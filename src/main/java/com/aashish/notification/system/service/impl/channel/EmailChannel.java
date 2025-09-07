package com.aashish.notification.system.service.impl.channel;

import com.aashish.notification.system.dto.NotifyDTO;
import com.aashish.notification.system.dto.enums.Severity;
import com.aashish.notification.system.service.Channel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class EmailChannel implements Channel {
    @Override
    public void send(NotifyDTO notifyDTO) {
        log.info(notifyDTO.getMessage());
    }
}
