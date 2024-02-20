package com.example.nnpia_cv02.Services;

import org.springframework.stereotype.Service;

@Service
public class myService implements myServiceInterface {
    @Override
    public void greet(String name) {
        System.out.println("Greetings " + name);
    }
}
