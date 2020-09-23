package com.example.demotorashmi.registry;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class Controller {
    @GetMapping("/greeting")
    public String  greet(@RequestParam(value = "name") String name)
        {

            String s="hell0"+name;
            return s;

        }
}