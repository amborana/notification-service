package com.aashish.notification.system.service.impl.alert;

import com.aashish.notification.system.dto.NotifyDTO;
import com.aashish.notification.system.service.Alert;
import com.aashish.notification.system.service.Channel;

public class SystemAlert extends Alert {
    public SystemAlert(Channel channel) {
        super(channel);
    }

    @Override
    public void sendToChannel(NotifyDTO notifyDTO) {
        channel.send(notifyDTO);
    }
}
