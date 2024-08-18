package com.example.bankaccountmanagementsystem.controller;

import com.example.bankaccountmanagementsystem.model.Transaction;
import com.example.bankaccountmanagementsystem.service.TransactionService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Collections;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class TransactionControllerTests {

    @InjectMocks
    private TransactionController transactionController;

    @Mock
    private TransactionService transactionService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllTransactions() {
        when(transactionService.getAllTransactions()).thenReturn(Collections.singletonList(new Transaction()));
        ResponseEntity<?> response = transactionController.getAllTransactions();
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }

    @Test
    void testCreateTransaction() {
        Transaction transaction = new Transaction();
        when(transactionService.createTransaction(any(Transaction.class))).thenReturn(transaction);
        ResponseEntity<?> response = transactionController.createTransaction(transaction);
        assertEquals(HttpStatus.CREATED, response.getStatusCode());
    }

    @Test
    void testGetTransactionById() {
        Transaction transaction = new Transaction();
        when(transactionService.getTransactionById(1L)).thenReturn(transaction);
        ResponseEntity<?> response = transactionController.getTransactionById(1L);
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }
}
