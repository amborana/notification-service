package com.aashish.notification.system.controller;

import com.aashish.notification.system.dto.NotifyDTO;
import com.aashish.notification.system.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("notify")
@RequiredArgsConstructor
public class NotificationController {
    private final NotificationService notificationService;

    @PostMapping
    public ResponseEntity<String> send(@RequestBody NotifyDTO notifyDTO) {
        notificationService.sendAlert(notifyDTO);
        return ResponseEntity.ok("Notification Sent");
    }
}
