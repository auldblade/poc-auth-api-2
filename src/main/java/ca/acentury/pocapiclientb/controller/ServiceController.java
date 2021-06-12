package ca.acentury.pocapiclientb.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    @CrossOrigin(origins = "http://localhost:8089")
    @GetMapping("/service/b")
    public String[] getServices() {
        return new String[] {"Service B 1", "Service B 2", "Service B 3"};
    }
}
