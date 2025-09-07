package com.aashish.notification.system.dto;

import com.aashish.notification.system.dto.enums.AlertType;
import com.aashish.notification.system.dto.enums.ChannelType;
import com.aashish.notification.system.dto.enums.Severity;
import lombok.Data;

@Data
public class NotifyDTO {
    private AlertType alertType;
    private Severity severity;
    private String message;
    private ChannelType channelType;
}
