package com.example.activemqtopic.producer;

import com.example.activemqtopic.model.Student;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.jms.Topic;

@RestController
@RequestMapping("/producer")
public class Producer {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Autowired
    private Topic topic;


    @PostMapping("/message")
    public Student sendMessage(@RequestBody Student student) {

        try {
            ObjectMapper mapper = new ObjectMapper();
            String studentAsJson = mapper.writeValueAsString(student);
            jmsTemplate.convertAndSend(topic, studentAsJson);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return student;
    }
}
