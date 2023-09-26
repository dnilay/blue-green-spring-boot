package com.example.demoprojectcodedeploy.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class ApiController {

    @GetMapping
    public ResponseEntity<?> healthCheck() throws UnknownHostException {
        return ResponseEntity.ok("it worked successfully..."+ InetAddress.getLocalHost().toString());
    }

    @GetMapping("/api/hello/{name}")
    public ResponseEntity<?> sayHello(@PathVariable("name") String name)
    {
        return ResponseEntity.ok("Hello "+name);
    }
}
