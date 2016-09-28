package com.example.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public abstract class Vehicle {

    @Id
    private ObjectId id;

    private long mileage;

    public ObjectId getId() {
        return id;
    }

    public long getMileage() {
        return mileage;
    }

    public void setMileage(long mileage) {
        this.mileage = mileage;
    }
}
