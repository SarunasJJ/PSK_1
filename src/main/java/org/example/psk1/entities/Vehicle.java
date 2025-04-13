package org.example.psk1.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true)
    private String licensePlate;

    private String manufacturer;
    private String model;
    private int year;
    private String color;
    private String type;

    @ManyToOne
    @JoinColumn(name = "car_rental_id")
    private CarRental carRental;

    @ManyToMany(mappedBy = "vehicles")
    private List<Client> clients;

}
