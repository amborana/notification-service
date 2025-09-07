package com.aashish.notification.system.service;

import com.aashish.notification.system.dto.NotifyDTO;

public abstract class Alert {
    protected Channel channel;

    public Alert (Channel channel){
        this.channel=channel;
    }
    public abstract void sendToChannel(NotifyDTO notifyDTO);
}
