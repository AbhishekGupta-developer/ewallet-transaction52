package com.myorganisation.ewallet.transactions52.service.resource;

import com.myorganisation.ewallet.transactions52.domain.Transaction;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionRequest {

    private Long senderId;
    private Long receiverId;
    private Double amount;
    private String description;

    public Transaction toTransaction() {
        return Transaction.builder()
                .senderId(senderId)
                .receiverId(receiverId)
                .amount(amount)
                .transactionId(UUID.randomUUID().toString())
                .build();
    }

}
