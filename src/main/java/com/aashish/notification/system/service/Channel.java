package com.aashish.notification.system.service;

import com.aashish.notification.system.dto.NotifyDTO;
import com.aashish.notification.system.dto.enums.Severity;

public interface Channel {
    void send (NotifyDTO notifyDTO);
}
