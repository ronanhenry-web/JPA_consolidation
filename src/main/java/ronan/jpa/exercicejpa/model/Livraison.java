package ronan.jpa.exercicejpa.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "livraison")
public class Livraison {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_livraison")
    private Long idLivraison;
    @Column(name="numero_commande")
    private LocalDateTime dateLivraison;
    @Column(name="date_livraison_effective")
    private Long numeroCommande;

    public Long getIdLivraison() {
        return idLivraison;
    }

    public void setIdLivraison(Long idLivraison) {
        this.idLivraison = idLivraison;
    }

    public LocalDateTime getDateLivraison() {
        return dateLivraison;
    }

    public void setDateLivraison(LocalDateTime dateLivraison) {
        this.dateLivraison = dateLivraison;
    }

    public Long getNumeroCommande() {
        return numeroCommande;
    }

    public void setNumeroCommande(Long numeroCommande) {
        this.numeroCommande = numeroCommande;
    }
}
