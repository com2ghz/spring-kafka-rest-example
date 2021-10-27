package nl.orhun.kafkarestapplication.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class Consumer {

    @KafkaListener(topics = "topic-one", groupId = "myGroup")
    public void consume(String message) {
        log.info(String.format("#### -> Consumed message -> %s", message));
    }
}
