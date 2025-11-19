package com.bankapp.service;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {
	public void send(String message) {
		System.out.println("SMS Notification Sent: " + message);
	}
}