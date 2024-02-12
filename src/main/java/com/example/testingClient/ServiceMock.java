package com.example.testingClient;

import org.springframework.stereotype.Service;

@Service
public class ServiceMock {

    public String getHello() {
        return "Hello";
    }

    public String mockMethod() {
        //TODO:: Dance
    }
}
