package nl.orhun.kafkarestapplication.controller;

import lombok.RequiredArgsConstructor;
import nl.orhun.kafkarestapplication.service.Producer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/kafka")
@RequiredArgsConstructor
public class KafkaController {
    private final Producer producer;

    @PostMapping(value = "/publish")
    public void sendMessage(@RequestParam("message") String message) {
        this.producer.sendMessage(message);
    }


}
