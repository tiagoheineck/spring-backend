package br.ifc.edu.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/items"})
public class ItemController {
    

    @GetMapping
    public String findAll() {
        // Generate and return JSON content
        return "{\"key\": \"value\"}";
    }
     

}
