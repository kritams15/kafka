package com.consumer.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics="my-topic",groupId = "my-new-group")
    public void lisner(String message){
        System.out.println("message is reveived 1"+message);
    }

    @KafkaListener(topics="my-topic",groupId = "my-new-group")
    public void lisner2(String message) {
        System.out.println("message is reveived 2" + message);
    }
        @KafkaListener(topics="my-topic-new",groupId = "my-new-group-rider")
        public void lisnerRiderLocation(RiderLocation location ){
            System.out.println("message is reveived 2" +location.getRiderId()+ " " +location.getLatitude()+ " "+ location.getLongitude());
    }
}
