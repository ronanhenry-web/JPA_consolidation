package ronan.jpa.exercicejpa;

import jakarta.annotation.PostConstruct;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import ronan.jpa.exercicejpa.model.Commande;
import ronan.jpa.exercicejpa.repository.CommandeJpaRepository;

import java.awt.print.Pageable;

@Service
@Transactional
public class Exemple {

    @Autowired
    CommandeJpaRepository commandeJpaRepository;

    public void test() {
        System.out.println("************************");
        for (var cmd :
            //commandeJpaRepository.findAll()
            //commandeJpaRepository.findByNomClient("DC")
                commandeJpaRepository.lister(
                        PageRequest.of(0,2,
                                Sort.by(
                                        Sort.Order.asc("dateCommande"),
                                        Sort.Order.asc("nomClient"))))
        ) {
            System.out.println(cmd + " " + cmd.getFacture().getStatutPaiement() +
                    " " + cmd.getLivraisons().size());
            for (var cmdart : cmd.getCommandesArticles()) {
                System.out.println("\t" + cmdart.getArticle().getDenomination() + " x " + cmdart.getQuantite());
            }
        }

        System.out.println("   *********************");

        String nomClientRequete = "ronan";
        String prenomClientRequete = "henry";

        Specification<Commande> critere = (root, criteria, builder) -> {
            //criteria.distinct(true);
            // builder.currentDate()
            if (prenomClientRequete == null) {
                return root.get("nomClient").in(nomClientRequete);
            } else {
                return builder.and(
                        root.get("nomClient").in(nomClientRequete),
                        root.get("prenomClient").in(prenomClientRequete));
            }
        };
        var commandes = commandeJpaRepository.findAll(critere, PageRequest.of(0,5,
                Sort.by(
                        Sort.Order.asc("dateCommande"),
                        Sort.Order.asc("nomClient"))));
        for (var cmd : commandes){
            System.out.println(cmd + " " + cmd.getFacture().getStatutPaiement() +
                    " " + cmd.getLivraisons().size());
            for (var cmdart : cmd.getCommandesArticles()) {
                System.out.println("\t" + cmdart.getArticle().getDenomination() + " x " + cmdart.getQuantite());
            }
        }

        System.out.println("************************");
    }

}
