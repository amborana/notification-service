package com.aashish.notification.system.service.impl.channel;

import com.aashish.notification.system.dto.NotifyDTO;
import com.aashish.notification.system.dto.enums.ChannelType;
import com.aashish.notification.system.service.Channel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PushChannel implements Channel {
    @Override
    public ChannelType type() {
        return ChannelType.PUSH;
    }

    @Override
    public void send(NotifyDTO notifyDTO) {
        log.info(notifyDTO.getMessage());
    }
}
