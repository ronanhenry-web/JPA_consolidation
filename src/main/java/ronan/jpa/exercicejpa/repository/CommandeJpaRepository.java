package ronan.jpa.exercicejpa.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import ronan.jpa.exercicejpa.model.Commande;

import java.util.List;

public interface CommandeJpaRepository
        extends JpaRepository<Commande, Long>
        , JpaSpecificationExecutor<Commande>
{

    List<Commande> findByNomClient(String nomClient);

    List<Commande> findByNomClientAndPrenomClient(
            String nomClient, String prenomClient);

    @Query("select cmd from Commande cmd " +
            " where cmd.nomClient = :nomClient" +
            " and cmd.prenomClient = :prenomClient")
    List<Commande> trouve(
            String nomClient, String prenomClient);

    @Query("select c from Commande c") // order by c.dateCommande")
    Page<Commande> lister(PageRequest page); //, Sort sort);
}