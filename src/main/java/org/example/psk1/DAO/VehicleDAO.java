package org.example.psk1.DAO;

import org.apache.ibatis.session.SqlSession;
import org.example.psk1.Mappers.VehicleMapper;
import org.example.psk1.Entity.Vehicle;

import java.util.List;

public class VehicleDAO {
    private final VehicleMapper vehicleMapper;

    public VehicleDAO(SqlSession sqlSession) {
        this.vehicleMapper = sqlSession.getMapper(VehicleMapper.class);
    }

    public void insertVehicle(Vehicle vehicle) {
        vehicleMapper.insertVehicle(vehicle);
    }

    public List<Vehicle> getAllVehicles() {
        return vehicleMapper.getAllVehicles();
    }

    public Vehicle getVehicleById(int id) {
        return vehicleMapper.getVehicleById(id);
    }

    public void deleteVehicle(int id) {
        vehicleMapper.deleteVehicle(id);
    }
}
