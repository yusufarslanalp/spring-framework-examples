package com.example.aopexample.service;

import org.springframework.stereotype.Service;

@Service
public class Message {

    public String getMessage( String msg )
    {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        return msg;
    }

}
