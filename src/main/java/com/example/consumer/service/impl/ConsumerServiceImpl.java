package com.example.consumer.service.impl;

import com.example.consumer.entity.Consumer;
import com.example.consumer.repository.ConsumerRepository;
import com.example.consumer.service.ConsumerService;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    private final ConsumerRepository consumerRepository;

    public ConsumerServiceImpl(ConsumerRepository consumerRepository) {
        this.consumerRepository = consumerRepository;
    }

    @Override
    public void save(int acceptNumber) {
        consumerRepository.save(new Consumer(1, acceptNumber, new Date()));
    }

    @Override
    public double mean(int timePeriod) {
        return 0;
    }
}
