package com.aashish.notification.system.factory;

import com.aashish.notification.system.dto.enums.ChannelType;
import com.aashish.notification.system.service.Channel;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class ChannelRegistry {
    private final List<Channel> channels;              // all channel beans
    private final Map<ChannelType, Channel> registry = new EnumMap<>(ChannelType.class);

    @PostConstruct
    void init() {
        for (Channel ch : channels) {
            ChannelType key = ch.type();
            if (registry.putIfAbsent(key, ch) != null) {
                throw new IllegalStateException("Duplicate Channel for " + key);
            }
        }
    }

    public Channel get(ChannelType type) {
        Channel ch = registry.get(type);
        if (ch == null) throw new IllegalArgumentException("Unsupported channel: " + type);
        return ch;
    }
}