package org.example.psk1.Beans;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.example.psk1.DAO.VehicleDAO;
import org.example.psk1.Entity.Vehicle;

@Named
@RequestScoped
public class VehicleBean {

    @Inject
    private VehicleDAO vehicleDAO;

    private Vehicle vehicle = new Vehicle();

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String submit() {
        vehicleDAO.insertVehicle(vehicle);
        return "vehicleList"; // Redirect to the vehicle list page after submission
    }
}
