package com.aashish.notification.system.factory;

import com.aashish.notification.system.dto.enums.ChannelType;
import com.aashish.notification.system.service.Channel;
import com.aashish.notification.system.service.impl.channel.EmailChannel;
import com.aashish.notification.system.service.impl.channel.PushChannel;
import com.aashish.notification.system.service.impl.channel.SMSChannel;
import com.aashish.notification.system.service.impl.channel.SlackChannel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class ChannelFactory {
    private final SMSChannel smsChannel;
    private final EmailChannel emailChannel;
    private final SlackChannel slackChannel;
    private final PushChannel pushChannel;

    public Channel getChannel(ChannelType channelType) {
        switch (channelType) {
            case SMS -> {
                return smsChannel;
            }
            case SLACK -> {
                return slackChannel;
            }
            case PUSH -> {
                return pushChannel;
            }
            case EMAIL -> {
                return emailChannel;
            }

            default -> throw new IllegalArgumentException("Invalid Channel Type provided");
        }

    }
}
