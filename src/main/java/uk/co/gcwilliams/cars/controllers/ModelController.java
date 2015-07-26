package uk.co.gcwilliams.cars.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import uk.co.gcwilliams.cars.services.ModelService;

import static com.google.common.base.Strings.isNullOrEmpty;
import static java.util.Collections.singletonMap;

/**
 * The model controller
 *
 * Created by GWilliams on 26/07/2015.
 */
@Controller
public class ModelController {

    private final ModelService modelService;

    /**
     * Default constructor
     *
     * @param modelService the model service
     */
    @Autowired
    public ModelController(ModelService modelService) {
        this.modelService = modelService;
    }

    @RequestMapping(value = "/car-models", method = RequestMethod.GET)
    public ModelAndView listModels() {
        return new ModelAndView("car-models", singletonMap("models", modelService.getModels()));
    }

    @RequestMapping(value = "/car-models", method = RequestMethod.POST)
    public String addMake(@RequestParam(value = "model", required = false) String model) {

        if (isNullOrEmpty(model)) {
            return "redirect:/somethings-gone-wrong";
        }

        modelService.addModel(model);
        return "redirect:/car-models";
    }
}
