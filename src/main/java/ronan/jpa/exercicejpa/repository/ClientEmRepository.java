package ronan.jpa.exercicejpa.repository;

import jakarta.annotation.PostConstruct;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ronan.jpa.exercicejpa.model.Client;

import java.util.List;

@Repository
public class ClientEmRepository {
    @Autowired
    EntityManager em;
    public List<Client> getAllClients() {
        var req = em.createQuery("select cli from Client cli");
        return req.getResultList();
    }

    @PostConstruct
    public void test() {
        for (var cli : getAllClients()) {
            System.out.println(cli);
        }
    }
}
