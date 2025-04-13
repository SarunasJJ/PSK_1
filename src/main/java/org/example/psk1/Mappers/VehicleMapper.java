package org.example.psk1.Mappers;

import org.example.psk1.entities.Vehicle;

import java.util.List;

public interface VehicleMapper {
    void insertVehicle(Vehicle vehicle);
    List<Vehicle> getAllVehicles();
}
