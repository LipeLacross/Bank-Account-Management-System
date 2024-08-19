package com.example.bankaccountmanagementsystem.service;

import com.example.bankaccountmanagementsystem.model.Account;
import com.example.bankaccountmanagementsystem.repository.AccountRepositoryTest;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class AccountServiceTests {

    @InjectMocks
    private AccountService accountService;

    @Mock
    private AccountRepositoryTest accountRepository;

    @Test
    public void testGetAllAccounts() {
        MockitoAnnotations.openMocks(this);
        when(accountRepository.findAll()).thenReturn(List.of(new Account()));

        List<Account> accounts = accountService.getAllAccounts();
        assertEquals(1, accounts.size());
    }

    @Test
    public void testCreateAccount() {
        MockitoAnnotations.openMocks(this);
        Account account = new Account();
        when(accountRepository.save(account)).thenReturn(account);

        Account createdAccount = accountService.createAccount(account);
        assertEquals(account, createdAccount);
    }

    @Test
    public void testGetAccountById() {
        MockitoAnnotations.openMocks(this);
        Account account = new Account();
        when(accountRepository.findById(1L)).thenReturn(Optional.of(account));

        Optional<Account> retrievedAccount = accountService.getAccountById(1L);
        assertEquals(account, retrievedAccount.get());
    }
}
