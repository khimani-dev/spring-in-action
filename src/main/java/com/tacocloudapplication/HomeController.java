package com.tacocloudapplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //Tells the Spring this is a controller and can handle the requests.
// Other annotations that can be used are @Service,@Repository @Component
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "home";
    }
}
