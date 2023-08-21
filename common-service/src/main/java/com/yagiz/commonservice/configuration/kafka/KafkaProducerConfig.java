package com.yagiz.commonservice.configuration.kafka;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;

import com.yagiz.commonservice.kafka.producer.KafkaProducer;

@Configuration
public class KafkaProducerConfig {
    
    @Bean
    KafkaProducer getKafkaProducer(KafkaTemplate<String, Object> kafkaTemplate) {
        return new KafkaProducer(kafkaTemplate);
    }
}
