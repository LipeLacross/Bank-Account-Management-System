package com.example.bankaccountmanagementsystem.service;

import com.example.bankaccountmanagementsystem.model.Transaction;
import com.example.bankaccountmanagementsystem.repository.TransactionRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class TransactionServiceTests {

    @InjectMocks
    private TransactionService transactionService;

    @Mock
    private TransactionRepository transactionRepository;

    @Test
    public void testCreateTransaction() {
        MockitoAnnotations.openMocks(this);
        Transaction transaction = new Transaction();
        when(transactionRepository.save(transaction)).thenReturn(transaction);

        Transaction createdTransaction = transactionService.createTransaction(transaction);
        assertEquals(transaction, createdTransaction);
    }

    @Test
    public void testGetTransactionById() {
        MockitoAnnotations.openMocks(this);
        Transaction transaction = new Transaction();
        when(transactionRepository.findById(1L)).thenReturn(Optional.of(transaction));

        Optional<Transaction> retrievedTransaction = transactionService.getTransactionById(1L);
        assertEquals(transaction, retrievedTransaction.get());
    }
}
