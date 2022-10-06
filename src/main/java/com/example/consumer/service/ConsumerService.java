package com.example.consumer.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Service to manage consumed numbers.
 */
public interface ConsumerService {
    /**
     * Method for saving numbers
     */
    void save(int acceptNumber);

    /**
     * Method for counting average by period of time
     * @param timePeriod period of time
     * @return mean
     */
    double mean(int timePeriod);

}
