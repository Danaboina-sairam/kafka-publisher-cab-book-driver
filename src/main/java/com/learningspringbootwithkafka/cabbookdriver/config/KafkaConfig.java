package com.learningspringbootwithkafka.cabbookdriver.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import static com.learningspringbootwithkafka.cabbookdriver.constants.AppConstants.CAB_LOCATION;

@Configuration
public class KafkaConfig {


    @Bean
    public NewTopic topic(){
        System.out.println("this is topoc"+TopicBuilder.name(CAB_LOCATION).build());
        return TopicBuilder.name(CAB_LOCATION).build();
    }
}
