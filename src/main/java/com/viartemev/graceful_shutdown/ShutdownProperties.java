package com.viartemev.graceful_shutdown;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(value = "endpoints.shutdown")
public class ShutdownProperties {

    private long timeout = 3000;

    public long getTimeout() {
        return timeout;
    }

    public void setTimeout(long timeout) {
        this.timeout = timeout;
    }
}