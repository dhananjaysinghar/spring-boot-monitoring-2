package dev.codesoapbox.springbootkibanademo.controllers;

import org.slf4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class TestController {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(TestController.class);

    @GetMapping
    public void logTestMessage() {
        if (new Random().nextBoolean()) {
            log.error("This is a error log");
        }
        log.info("This is a success log");
    }
}
