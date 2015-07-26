package uk.co.gcwilliams.cars.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * The home controller
 *
 * Created by GWilliams on 26/07/2015.
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String homePage() {
        return "home";
    }

    @RequestMapping(value = "/somethings-gone-wrong", method = RequestMethod.GET)
    public String errorPage() {
        return "somethings-gone-wrong";
    }
}
