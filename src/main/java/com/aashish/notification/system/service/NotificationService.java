package com.aashish.notification.system.service;

import com.aashish.notification.system.dto.NotifyDTO;
import com.aashish.notification.system.factory.AlertFactory;
import com.aashish.notification.system.factory.ChannelRegistry;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NotificationService {
    private final AlertFactory alertFactory;
    private final ChannelRegistry channelRegistry;

    public void sendAlert(NotifyDTO notifyDTO) {
        alertFactory.getInstance(notifyDTO.getAlertType(), channelRegistry.get(notifyDTO.getChannelType())).sendToChannel(notifyDTO);
    }
}
