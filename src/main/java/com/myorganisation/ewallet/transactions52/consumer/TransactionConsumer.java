package com.myorganisation.ewallet.transactions52.consumer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.myorganisation.ewallet.transactions52.service.TransactionService;
import com.myorganisation.ewallet.transactions52.service.resource.TransactionMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class TransactionConsumer {

    private ObjectMapper mapper = new ObjectMapper();

    @Autowired
    TransactionService transactionService;

    @KafkaListener(topics = "WALLET_UPDATE", groupId = "transactionGroup")
    public void updateTransaction(String message) {
        try {
            System.out.println("message");
            TransactionMessage message1 = mapper.readValue(message, TransactionMessage.class);
            transactionService.updateTransaction(message1);
        } catch(JsonProcessingException ex) {
            throw new RuntimeException(ex);
        }
    }
}
