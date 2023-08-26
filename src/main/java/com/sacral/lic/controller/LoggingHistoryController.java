package com.sacral.lic.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sacral.lic.entity.LoggingHistory;
import com.sacral.lic.service.LoggingHistoryService;

@RestController
public class LoggingHistoryController {

    @Autowired
    private LoggingHistoryService loggingHistoryService;

    @GetMapping("/logging-history")
    public List<LoggingHistory> findAllByUserId(@RequestParam(name="userId") Long userId) {
        return loggingHistoryService.findAllByUserId(userId);
    }

    @GetMapping("/logging-history")
    public List<LoggingHistory> findAllByTimestamp(@RequestParam(name="timestamp") LocalDateTime timestamp) {
        return loggingHistoryService.findAllByTimestamp(timestamp);
    }

    @GetMapping("/logging-history")
    public List<LoggingHistory> findAllByDetails(@RequestParam(name="details") String details) {
        return loggingHistoryService.findAllByDetails(details);
    }

    @PostMapping("/logging-history")
    public void saveLoggingHistory(@RequestBody LoggingHistory loggingHistory) {
        loggingHistoryService.saveLoggingHistory(loggingHistory);
    }

    @DeleteMapping("/logging-history")
    public void deleteLoggingHistory(@RequestBody LoggingHistory loggingHistory) {
        loggingHistoryService.deleteLoggingHistory(loggingHistory);
    }

    @PutMapping("/logging-history")
    public void updateLoggingHistory(@RequestBody LoggingHistory loggingHistory) {
        loggingHistoryService.updateLoggingHistory(loggingHistory);
    }

}