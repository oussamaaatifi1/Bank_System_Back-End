package com.banksystem.service;

import com.banksystem.dto.TransactionDTO;

public interface TransactionService {
    public TransactionDTO createTransaction(TransactionDTO transactionDTO);
}
