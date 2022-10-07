package com.intexsoft.consumer.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * Object Consumer for working with accept numbers
 */
@Data
public class Consumer {
    @Id
    private Integer id;
    private Integer acceptValue;
    private Date addTime;

    public Consumer(Integer acceptValue) {
        this.acceptValue = acceptValue;
        this.addTime = new Date();
    }
}
