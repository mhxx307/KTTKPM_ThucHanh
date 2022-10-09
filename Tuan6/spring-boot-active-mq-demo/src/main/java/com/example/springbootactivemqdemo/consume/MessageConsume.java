package com.example.springbootactivemqdemo.consume;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsume {

    @JmsListener(destination = "test")
    public void messageListener(String messageReceive) {
        System.out.println(messageReceive);
    }


}
