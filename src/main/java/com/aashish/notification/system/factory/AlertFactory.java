package com.aashish.notification.system.factory;

import com.aashish.notification.system.dto.enums.AlertType;
import com.aashish.notification.system.service.Alert;
import com.aashish.notification.system.service.Channel;
import com.aashish.notification.system.service.impl.alert.BusinessAlert;
import com.aashish.notification.system.service.impl.alert.SecurityAlert;
import com.aashish.notification.system.service.impl.alert.SystemAlert;
import org.springframework.stereotype.Component;

@Component
public class AlertFactory {

    public Alert getInstance(AlertType alertType, Channel channel) {
        return switch (alertType) {
            case SYSTEM   -> new SystemAlert(channel);
            case BUSINESS -> new BusinessAlert(channel);
            case SECURITY -> new SecurityAlert(channel);
            default -> throw new IllegalArgumentException("Invalid Alert type provided: " + alertType);
        };
    }
}
