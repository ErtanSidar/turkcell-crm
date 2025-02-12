package com.turkcell.notification_service;

import java.time.LocalDateTime;

class Notification {
    private Long id;
    private Long customerId;
    private String type; // EMAIL, SMS, PUSH
    private String content;
    private Boolean isRead;
    private LocalDateTime createdAt;
    private LocalDateTime sentAt;
}
