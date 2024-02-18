package br.ifc.edu.sample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    

    @RequestMapping("/health")
    public String health() {
        return "OK, it's work";
    }

    @RequestMapping("/")
    public String home() {
        return "IFC Rest API - Sample Application";
    }


}
