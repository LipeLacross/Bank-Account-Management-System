package com.example.controller;

import com.example.bankaccountmanagementsystem.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reports")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @GetMapping("/monthly")
    public String generateMonthlyReport() {
        return reportService.generateMonthlyReport();
    }
}
