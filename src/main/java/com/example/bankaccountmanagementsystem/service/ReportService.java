package com.example.bankaccountmanagementsystem.service;

import org.springframework.stereotype.Service;

@Service
public class ReportService {

    public String generateMonthlyReport() {
        return "Monthly report generated.";
    }
}
