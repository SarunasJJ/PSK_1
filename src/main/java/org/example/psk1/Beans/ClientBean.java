package org.example.psk1.Beans;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.example.psk1.DAO.ClientDAO;
import org.example.psk1.DAO.VehicleDAO;
import org.example.psk1.Entity.Client;

@Named
@RequestScoped
public class ClientBean {

    @Inject
    private ClientDAO clientDAO;

    @Inject
    private VehicleDAO vehicleDAO;

    private Client client = new Client();

    private int selectedVehicleId;

    private Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String submit(){
        clientDAO.save(client);
        return "clientList"; // Redirect to the client list page after submission
    }
}

