package com.sacral.lic.model;

import javax.persistence.*;
import java.time.LocalDateTime;
 
@Entity
@Table(name = "logging_history")
public class LoggingHistory {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
    @Column(name = "user_id", nullable = false)
    private Long userId;
 
    @Column(name = "timestamp", nullable = false)
    private LocalDateTime timestamp;
 
    @Column(name = "details", nullable = false, length = 500)
    private String details;
 
    public LoggingHistory() {
    }
 
    public LoggingHistory(Long userId, LocalDateTime timestamp, String details) {
        this.userId = userId;
        this.timestamp = timestamp;
        this.details = details;
    }
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public Long getUserId() {
        return userId;
    }
 
    public void setUserId(Long userId) {
        this.userId = userId;
    }
 
    public LocalDateTime getTimestamp() {
        return timestamp;
    }
 
    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
 
    public String getDetails() {
        return details;
    }
 
    public void setDetails(String details) {
        this.details = details;
    }
 
    @Override
    public String toString() {
        return "LoggingHistory{" +
                "id=" + id +
                ", userId=" + userId +
                ", timestamp=" + timestamp +
                ", details='" + details + '\'' +
                '}';
    }
}