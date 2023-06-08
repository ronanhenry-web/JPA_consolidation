package ronan.jpa.exercicejpa.model;

import jakarta.persistence.*;

@Entity
@Table(name = "facture")
public class Facture {
    @Id
    @Column(name="numero_commande")
    private Long numeroCommande;

    @Enumerated(EnumType.STRING)
    @Column(name="statut_paiement")
    private StatutPaiement statutPaiement;

    public Long getNumeroCommande() {
        return numeroCommande;
    }

    public void setNumeroCommande(Long numeroCommande) {
        this.numeroCommande = numeroCommande;
    }

    public StatutPaiement getStatutPaiement() {
        return statutPaiement;
    }

    public void setStatutPaiement(StatutPaiement statutPaiement) {
        this.statutPaiement = statutPaiement;
    }
}
