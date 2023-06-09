package ronan.jpa.exercicejpa.repository;

import jakarta.annotation.PostConstruct;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import ronan.jpa.exercicejpa.model.Client;

import java.util.List;

@Service
public class ClientEmRepository {

    @Autowired
    EntityManager em;

    public List<Client> getAllClients() {
        var req = em.createQuery("select cli from Client cli");
        var ret = req.getResultList();
        return ret;
    }

    public void test() {
        System.out.println("---------------------------------------");
        for (var cli : getAllClients()) {
            System.out.println(cli);
        }
        System.out.println("---------------------------------------");
    }
}
