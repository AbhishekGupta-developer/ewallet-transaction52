package com.myorganisation.ewallet.transactions52.controller;

import com.myorganisation.ewallet.transactions52.service.TransactionService;
import com.myorganisation.ewallet.transactions52.service.resource.TransactionRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {

    @Autowired
    TransactionService transactionService;

    @PostMapping("/transfer")
    public ResponseEntity<?> performTransaction(@RequestBody TransactionRequest transactionRequest) {
        transactionService.createTransaction(transactionRequest.toTransaction());
        return new ResponseEntity<>(null, HttpStatus.CREATED);
    }
}
