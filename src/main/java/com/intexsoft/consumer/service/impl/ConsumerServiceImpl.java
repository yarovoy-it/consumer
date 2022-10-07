package com.intexsoft.consumer.service.impl;

import com.intexsoft.consumer.config.ConsumerConfig;
import com.intexsoft.consumer.entity.Consumer;
import com.intexsoft.consumer.repository.ConsumerRepository;
import com.intexsoft.consumer.service.ConsumerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
@Service
@Slf4j
@AllArgsConstructor
public class ConsumerServiceImpl implements ConsumerService {
    private final ConsumerRepository consumerRepository;
    private final ConsumerConfig consumerConfig;

    @Override
    public void save(int acceptNumber) {
        log.debug("Save number {} to database", acceptNumber);
        consumerRepository.save(new Consumer(acceptNumber));
    }

    @Override
    public BigDecimal mean() {
        BigDecimal result = consumerRepository.mean(consumerConfig.getAverageTimePeriod()).orElse(null);
        log.debug("Return result of average numbers = {}", result);
        return result;
    }
}
