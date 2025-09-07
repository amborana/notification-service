package com.aashish.notification.system.service.impl.alert;

import com.aashish.notification.system.dto.NotifyDTO;
import com.aashish.notification.system.service.Alert;
import com.aashish.notification.system.service.Channel;
import org.springframework.stereotype.Component;

public class BusinessAlert extends Alert {
    public BusinessAlert(Channel channel) {
        super(channel);
    }

    @Override
    public void sendToChannel(NotifyDTO notifyDTO) {
        channel.send(notifyDTO);
    }
}
