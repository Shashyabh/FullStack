package com.shashyabh.electronic.store.services;

public interface EmailService {
    boolean sendEmail(String subject, String message, String to);
}
