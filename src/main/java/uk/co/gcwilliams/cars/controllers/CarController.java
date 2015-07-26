package uk.co.gcwilliams.cars.controllers;

import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import uk.co.gcwilliams.cars.services.CarService;
import uk.co.gcwilliams.cars.services.MakeService;
import uk.co.gcwilliams.cars.services.ModelService;

import java.util.Map;

import static com.google.common.base.Strings.isNullOrEmpty;
import static com.google.common.primitives.Longs.tryParse;
import static java.util.Collections.singletonMap;

/**
 * The car controller
 *
 * Created by GWilliams on 25/07/2015.
 */
@Controller
public class CarController {

    private final CarService carService;

    private final MakeService makeService;

    private final ModelService modelService;

    /**
     * Default constructor
     *
     * @param carService the car service
     * @param makeService the make service
     * @param modelService the model service
     */
    @Autowired
    public CarController(CarService carService, MakeService makeService, ModelService modelService) {
        this.carService = carService;
        this.makeService = makeService;
        this.modelService = modelService;
    }

    @RequestMapping(value = "/cars", method = RequestMethod.GET)
    public ModelAndView listCars() {
        Map<String, Object> model = Maps.newHashMap();
        model.put("cars", carService.getCars());
        model.put("makes", makeService.getMakes());
        model.put("models", modelService.getModels());
        return new ModelAndView("cars", model);
    }

    @RequestMapping(value = "/cars", method = RequestMethod.POST)
    public String addCar(
            @RequestParam(value = "registration", required = false) String registration,
            @RequestParam(value = "make", required = false) String make,
            @RequestParam(value = "model", required = false) String model) {

        if (isNullOrEmpty(registration) || tryParse(make) == null || tryParse(model) == null) {
            return "redirect:/somethings-gone-wrong";
        }

        carService.addCar(registration, tryParse(make), tryParse(model));
        return "redirect:/cars";
    }
}
