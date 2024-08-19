package com.example.bankaccountmanagementsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.bankaccountmanagementsystem.repository")
@EntityScan(basePackages = "com.example.bankaccountmanagementsystem.model")
public class BankAccountManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankAccountManagementSystemApplication.class, args);
    }
}
