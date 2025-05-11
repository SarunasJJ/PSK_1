package org.example.psk1.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class CarRental {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String address;
    private String phone;
    private String email;

    @OneToMany(mappedBy = "carRental")
    List<Vehicle> vehicles;

    @OneToMany(mappedBy = "carRental")
    List<Client> clients;
}
