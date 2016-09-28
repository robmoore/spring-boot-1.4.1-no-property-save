package com.example.repo;

import com.example.domain.Taxi;
import com.example.domain.Vehicle;
import org.bson.types.ObjectId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
interface VehicleRepository<T extends Vehicle> extends CrudRepository<Vehicle, ObjectId> {
    @Override
    <S extends Vehicle> S save(S entity);
}

interface TaxiRepository
        extends VehicleRepository<Taxi> {
}

