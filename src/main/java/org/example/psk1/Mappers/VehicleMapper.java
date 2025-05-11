package org.example.psk1.Mappers;

import org.example.psk1.Entity.Vehicle;

import java.util.List;

public interface VehicleMapper {
    void insertVehicle(Vehicle vehicle);
    List<Vehicle> getAllVehicles();
    Vehicle getVehicleById(int id);
    void deleteVehicle(int id);
}
