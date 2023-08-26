package com.sacral.lic.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.sacral.lic.entity.LoggingHistory;

@Service
public class LoggingHistoryService {
    private final LoggingHistoryRepository loggingHistoryRepository;

    public LoggingHistoryService(LoggingHistoryRepository loggingHistoryRepository) {
        this.loggingHistoryRepository = loggingHistoryRepository;
    }

    public List<LoggingHistory> findAllByUserId(Long userId) {
        return loggingHistoryRepository.findAllByUserId(userId);
    }

    public List<LoggingHistory> findAllByTimestamp(LocalDateTime timestamp) {
        return loggingHistoryRepository.findAllByTimestamp(timestamp);
    }

    public List<LoggingHistory> findAllByDetails(String details) {
        return loggingHistoryRepository.findAllByDetails(details);
    }

public void saveLoggingHistory(LoggingHistory loggingHistory) {
        loggingHistoryRepository.save(loggingHistory);
    }

    public void deleteLoggingHistory(LoggingHistory loggingHistory) {
        loggingHistoryRepository.delete(loggingHistory);
    }

    public void updateLoggingHistory(LoggingHistory loggingHistory) {
        loggingHistoryRepository.save(loggingHistory);
    }
}