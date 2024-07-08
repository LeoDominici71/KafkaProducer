package com.consumer.kafka.controller;

import com.consumer.kafka.entity.Messagem;
import com.consumer.kafka.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sendMessage")
public class kafkaController {

    @Autowired
    private KafkaProducerService service;

    @PostMapping
    public ResponseEntity<String> sendMessage(@RequestBody Messagem message){
        service.sendMessage(message.getTextMessage());
        return ResponseEntity.ok("Message sent");
    }

}
