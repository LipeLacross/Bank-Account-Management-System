package com.example.bankaccountmanagementsystem.controller;

import com.example.bankaccountmanagementsystem.service.ReportService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringBootTest
public class ReportControllerTests {

    private MockMvc mockMvc;

    @InjectMocks
    private ReportController reportController;

    @Mock
    private ReportService reportService;

    @Test
    public void testGenerateMonthlyReport() throws Exception {
        MockitoAnnotations.openMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(reportController).build();

        when(reportService.generateMonthlyReport()).thenReturn("Monthly report generated.");

        mockMvc.perform(get("/reports/monthly"))
                .andExpect(status().isOk())
                .andExpect(content().string("Monthly report generated."));
    }
}
