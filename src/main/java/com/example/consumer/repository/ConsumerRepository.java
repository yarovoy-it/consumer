package com.example.consumer.repository;

import com.example.consumer.entity.Consumer;

/**
 * Repository for {@link Consumer} entity.
 */

public interface ConsumerRepository {
    /**
     * Method for saving object consumer
     * @param consumer
     */
    void save(Consumer consumer);
}
