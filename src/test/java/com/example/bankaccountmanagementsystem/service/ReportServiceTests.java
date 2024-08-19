package com.example.bankaccountmanagementsystem.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ReportServiceTests {

    private ReportService reportService = new ReportService();

    @Test
    public void testGenerateMonthlyReport() {
        String report = reportService.generateMonthlyReport();
        assertEquals("Monthly report generated.", report);
    }
}
