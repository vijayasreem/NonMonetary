@Repository
public interface LoggingHistoryRepository extends JpaRepository<LoggingHistory, Long> {
 
    List<LoggingHistory> findAllByUserId(Long userId);
 
    List<LoggingHistory> findAllByTimestamp(LocalDateTime timestamp);
 
    List<LoggingHistory> findAllByDetails(String details);
 
    void saveLoggingHistory(LoggingHistory loggingHistory);
 
    void deleteLoggingHistory(LoggingHistory loggingHistory);
 
    void updateLoggingHistory(LoggingHistory loggingHistory);
}