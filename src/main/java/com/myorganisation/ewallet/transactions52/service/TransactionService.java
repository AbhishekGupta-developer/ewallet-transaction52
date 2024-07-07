package com.myorganisation.ewallet.transactions52.service;

import com.myorganisation.ewallet.transactions52.domain.Transaction;
import com.myorganisation.ewallet.transactions52.service.resource.TransactionMessage;

public interface TransactionService {

    void createTransaction(Transaction transaction);
    void updateTransaction(TransactionMessage message);
}
