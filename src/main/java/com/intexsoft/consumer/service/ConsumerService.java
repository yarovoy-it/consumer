package com.intexsoft.consumer.service;

import java.math.BigDecimal;
import java.util.Optional;

/**
 * Service to manage consumed numbers.
 */
public interface ConsumerService {
    /**
     * Method for saving number
     */
    void save(int acceptNumber);

    /**
     * Method for counting average by period of time if not found anything numbers will return null
     * @return mean
     */
    BigDecimal mean();

}
