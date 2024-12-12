package com.pluralsight.NorthwindTradersAPI;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {
    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String index(@RequestParam String country) {
        return "Hello " + country;
    }
}