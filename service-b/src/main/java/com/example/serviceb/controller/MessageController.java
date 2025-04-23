
package com.example.serviceb.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class MessageController {

    @GetMapping("/message")
    public Map<String, String> getMessage() {
        Map<String, String> message = new HashMap<>();
        message.put("message", "Hello from Service B!");
        return message;
    }
}
