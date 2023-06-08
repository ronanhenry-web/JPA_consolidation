package ronan.jpa.exercicejpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ronan.jpa.exercicejpa.model.Commande;

import java.util.List;

public interface CommandeJpaRepo extends JpaRepository<Commande, Long> {

    List<Commande> findByNomClient(String nomClient);

    List<Commande> findByNomClientAndPrenom(String nomClient, String prenomClient);

    @Query("select cmd from Commande cmd where cmd.nomClient =:nomClient and cmd.prenomClient =:prenomClient")
    List<Commande> trouve(String nomClient, String prenomClient);
}
