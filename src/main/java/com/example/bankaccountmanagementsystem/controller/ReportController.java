package com.example.bankaccountmanagementsystem.controller;

import com.example.bankaccountmanagementsystem.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reports")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @GetMapping("/monthly")
    public ResponseEntity<String> generateMonthlyReport() {
        String report = reportService.generateMonthlyReport();
        return new ResponseEntity<>(report, HttpStatus.OK);
    }
}
