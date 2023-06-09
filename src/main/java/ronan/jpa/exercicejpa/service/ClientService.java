package ronan.jpa.exercicejpa.service;

import jakarta.annotation.PostConstruct;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ronan.jpa.exercicejpa.model.Commande;
import ronan.jpa.exercicejpa.repository.CommandeJpaRepository;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private CommandeJpaRepository commandeJpaRepository;

    @Transactional
    public List<Commande> getClienstEtCommandes() {
        List<Commande> commandes = commandeJpaRepository.findAll();
        for (var cmd : commandes) {
            cmd.getClient().getNom();
        }
        return commandes;
    }

    @Transactional
    public void test() {
        System.out.println("========================================");
        for (var e : getClienstEtCommandes()) {
            System.out.println(e + " " + e.getClient());
        }
        System.out.println("========================================");
    }

}
