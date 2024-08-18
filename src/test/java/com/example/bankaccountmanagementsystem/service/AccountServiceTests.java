package com.example.bankaccountmanagementsystem.service;

import com.example.bankaccountmanagementsystem.model.Account;
import com.example.bankaccountmanagementsystem.repository.AccountRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collections;
import java.util.Optional;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class AccountServiceTests {

    @InjectMocks
    private AccountService accountService;

    @Mock
    private AccountRepository accountRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllAccounts() {
        when(accountRepository.findAll()).thenReturn(Collections.singletonList(new Account()));
        assertEquals(1, accountService.getAllAccounts().size());
    }

    @Test
    void testCreateAccount() {
        Account account = new Account();
        when(accountRepository.save(any(Account.class))).thenReturn(account);
        assertNotNull(accountService.createAccount(account));
    }

    @Test
    void testGetAccountById() {
        Account account = new Account();
        when(accountRepository.findById(1L)).thenReturn(Optional.of(account));
        assertNotNull(accountService.getAccountById(1L));
    }
}
