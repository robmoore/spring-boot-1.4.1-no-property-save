package com.example.domain;

import java.util.UUID;

public class Taxi extends Vehicle {
    private UUID meterId;

    public UUID getMeterId() {
        return meterId;
    }

    public void setMeterId(UUID meterId) {
        this.meterId = meterId;
    }
}
