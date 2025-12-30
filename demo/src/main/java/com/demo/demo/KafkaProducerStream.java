package com.demo.demo;


import com.demo.demo.controller.RiderLocation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Supplier;

@Configuration
public class KafkaProducerStream {

    @Bean
    public Supplier<RiderLocation> sendRiderLocation(){
        return ()-> {
            RiderLocation location = new RiderLocation("kritam01",45.33,89.89);
       System.out.println("send message"+location.getRiderId());
       return location;
        };
    }
}
