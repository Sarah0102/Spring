package com.example.greeting.controller;

import com.example.greeting.service.GreetingService;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping
public class GreetingController {
    private static  final String template ="Hello, %s!";
    private static AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public GreetingService greeting(@RequestParam(value ="name", defaultValue="World") String name){
        String content = String.format(template,name);

        return new GreetingService(counter.incrementAndGet(),String.format(template,name));

    }
}
