package com.example.activemqtopic.listener;

import com.example.activemqtopic.model.Student;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Message;
import javax.jms.Topic;

@RestController
@RequestMapping("/consume")
public class Consume {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Autowired
    private Topic topic;

//    @JmsListener(destination = "minhquan-topic")
//    public void consumeMessage(String message) {
//        System.out.println("Message received from activemq topic---"+message);
//    }

    @GetMapping("/message")
    public String consumeMessage() {

        Student student = null;
        String jsonMessage = null;
        try {
            ObjectMapper mapper = new ObjectMapper();
            Message message = jmsTemplate.receive(topic);
            jsonMessage = message.getBody(String.class);
//            student = mapper.readValue(jsonMessage, Student.class);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonMessage;
    }
}
