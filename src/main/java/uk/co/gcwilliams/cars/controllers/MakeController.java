package uk.co.gcwilliams.cars.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import uk.co.gcwilliams.cars.services.MakeService;

import static com.google.common.base.Strings.isNullOrEmpty;
import static java.util.Collections.singletonMap;

/**
 * The make controller
 *
 * Created by GWilliams on 26/07/2015.
 */
@Controller
public class MakeController {

    private final MakeService makeService;

    /**
     * Default constructor
     *
     * @param makeService the make service
     */
    @Autowired
    public MakeController(MakeService makeService) {
        this.makeService = makeService;
    }

    @RequestMapping(value = "/car-makes", method = RequestMethod.GET)
    public ModelAndView listMakes() {
        return new ModelAndView("car-makes", singletonMap("makes", makeService.getMakes()));
    }

    @RequestMapping(value = "/car-makes", method = RequestMethod.POST)
    public String addMake(@RequestParam(value = "make", required = false) String make) {

        if (isNullOrEmpty(make)) {
            return "redirect:/somethings-gone-wrong";
        }

        makeService.addMake(make);
        return "redirect:/car-makes";
    }
}
