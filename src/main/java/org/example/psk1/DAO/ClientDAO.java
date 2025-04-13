package org.example.psk1.DAO;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.example.psk1.entities.Client;

import java.util.List;

@Stateless
public class ClientDAO {
    @PersistenceContext
    private EntityManager entityManager;

    public void saveClient(Client client) {
        entityManager.persist(client);
    }

    public Client findClientById(int id) {
        return entityManager.find(Client.class, id);
    }

    public List<Client> findAllClients() {
        return entityManager.createQuery("SELECT c FROM Client c", Client.class).getResultList();
    }
}
