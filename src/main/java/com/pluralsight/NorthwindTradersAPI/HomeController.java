package com.pluralsight.NorthwindTradersAPI;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(@RequestParam(value = "country", required = false) String country) {
        if (country != null) {
            return "Hello " + country;
        }
        return "Hello World";
    }
}
