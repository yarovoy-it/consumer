package com.example.consumer.repository.impl;

import com.example.consumer.entity.Consumer;
import com.example.consumer.repository.ConsumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ConsumerRepositoryImpl implements ConsumerRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void save(Consumer consumer) {
        jdbcTemplate.update("insert into student (id, value, set_time) " + "values(?,  ?, ?)",
                consumer.getId(), consumer.getValue(), consumer.getSetTime());
    }
}
