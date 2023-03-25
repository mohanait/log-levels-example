package com.projectsync.loglevels.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class StudentController {

    @GetMapping(value = "/")
    public String welcome() {

        log.error("Error message");
        log.warn("Warning message");
        log.info("Info message");
        log.debug("Debug message");
        log.trace("Trace message");

        return "hello, world";
    }
}

/*
https://www.knowledgefactory.net/2020/12/Log4j2-with-Spring-Boot-and-logging-hierarchy-order.html
https://stackabuse.com/guide-to-logging-in-spring-boot/

error: prints error message
warn: prints error, warn, so on
logging.level.root=INFO (prints error, warn, info. Skips debug, trace)
 */
