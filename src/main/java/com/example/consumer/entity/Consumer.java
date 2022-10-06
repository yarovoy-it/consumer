package com.example.consumer.entity;

import javax.persistence.*;
import java.util.Date;

public class Consumer {

    private Integer id;
    private Integer value;
    private Date setTime;

    public Consumer() {
    }

    public Consumer(Integer id, Integer value, Date setTime) {
        this.id = id;
        this.value = value;
        this.setTime = setTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Date getSetTime() {
        return setTime;
    }

    public void setSetTime(Date setTime) {
        this.setTime = setTime;
    }
}
