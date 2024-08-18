package com.example.bankaccountmanagementsystem.controller;

import com.example.bankaccountmanagementsystem.service.ReportService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class ReportControllerTests {

    @InjectMocks
    private ReportController reportController;

    @Mock
    private ReportService reportService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGenerateMonthlyReport() {
        when(reportService.generateMonthlyReport()).thenReturn("Monthly report generated.");
        ResponseEntity<?> response = reportController.generateMonthlyReport();
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }
}
