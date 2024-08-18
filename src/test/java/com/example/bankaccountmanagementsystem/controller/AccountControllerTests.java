package com.example.bankaccountmanagementsystem.controller;

import com.example.bankaccountmanagementsystem.model.Account;
import com.example.bankaccountmanagementsystem.service.AccountService;
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

class AccountControllerTests {

    @InjectMocks
    private AccountController accountController;

    @Mock
    private AccountService accountService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAllAccounts() {
        when(accountService.getAllAccounts()).thenReturn(Collections.singletonList(new Account()));
        ResponseEntity<?> response = accountController.getAllAccounts();
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }

    @Test
    void testCreateAccount() {
        Account account = new Account();
        when(accountService.createAccount(any(Account.class))).thenReturn(account);
        ResponseEntity<?> response = accountController.createAccount(account);
        assertEquals(HttpStatus.CREATED, response.getStatusCode());
    }

    @Test
    void testGetAccountById() {
        Account account = new Account();
        when(accountService.getAccountById(1L)).thenReturn(account);
        ResponseEntity<?> response = accountController.getAccountById(1L);
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }
}
