package com.example.bankaccountmanagementsystem.repository;

import com.example.bankaccountmanagementsystem.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
