package com.intexsoft.consumer.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix="consumer")
public class ConsumerConfig {
    private int averageTimePeriod;

    public int getAverageTimePeriod() {
        return averageTimePeriod;
    }

    public void setAverageTimePeriod(int averageTimePeriod) {
        this.averageTimePeriod = averageTimePeriod;
    }
}
