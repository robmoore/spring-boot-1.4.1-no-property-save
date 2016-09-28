package com.example.repo;

import com.example.domain.Taxi;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Random;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VehicleRepositoryTest {

    private final Random random = new Random();
    @Autowired
    private TaxiRepository taxiRepository;

    @Test
    public void taxi() throws Exception {
        Taxi taxi = new Taxi();
        taxi.setMeterId(UUID.randomUUID());
        taxi.setMileage(random.nextLong());

        taxiRepository.save(taxi);
        Assert.assertEquals(1, taxiRepository.count());
    }
}