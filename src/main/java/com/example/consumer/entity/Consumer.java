package com.example.consumer.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Consumer {

    @Id
    @GeneratedValue
    @Column(name = "Id", nullable = false)
    private Integer id;
    @Column(name = "Value", nullable = false)
    private Integer value;
    @Temporal(TemporalType.DATE)
    @Column(name = "Set_Time", nullable = false)
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
