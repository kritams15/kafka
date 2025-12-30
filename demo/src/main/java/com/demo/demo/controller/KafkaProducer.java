//package com.demo.demo.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.AutoConfigureOrder;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api")
//public class KafkaProducer {
//    @Autowired
//    private KafkaTemplate<String ,RiderLocation > kafkaTemplate;
//
//    @PostMapping
//    public  String sendMessage(@RequestParam String message){
//        RiderLocation location = new RiderLocation("riderk",43.23,88.55);
//        kafkaTemplate.send("my-topic-new", location);
//        return  "message send:" +location.getRiderId();
//    }
//}
