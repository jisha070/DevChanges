
package com.example.servicea.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class ServiceBClient {
    private final RestTemplate restTemplate = new RestTemplate();

    public Map<String, String> getMessageFromServiceB() {
        String url = "http://localhost:8081/api/v1/message";
        return restTemplate.getForObject(url, Map.class);
    }
}
