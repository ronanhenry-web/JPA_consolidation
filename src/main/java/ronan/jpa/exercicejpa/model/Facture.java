package ronan.jpa.exercicejpa.model;

import jakarta.persistence.*;

@Entity
@Table(name="facture")
public class Facture {

    @Id
    @Column(name="numero_commande")
    private Long numeroCommande;

    @Enumerated(EnumType.STRING)
    @Column(name="statut_paiement")
    private StatutPaiement statutPaiement;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="numero_commande")
    private Commande commande;

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

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }
}
