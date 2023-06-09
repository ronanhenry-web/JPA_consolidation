package ronan.jpa.exercicejpa.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "livraison")
public class Livraison {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    // alter table livraison modify id_livraison bigint(20) NOT NULL AUTO_INCREMENT;
    @Column(name="id_livraison")
    private Long idLivraison;
    @Column(name="numero_commande")
    private Long numeroCommande;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="date_livraison")
    private Date dateLivraisonEffective;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "numero_commande", insertable = false, updatable = false)
    private Commande commande;

    public Long getNumeroCommande() {
        return numeroCommande;
    }

    public void setNumeroCommande(Long numeroCommande) {
        this.numeroCommande = numeroCommande;
    }

    public Long getIdLivraison() {
        return idLivraison;
    }

    public void setIdLivraison(Long idLivraison) {
        this.idLivraison = idLivraison;
    }

    public Date getDateLivraisonEffective() {
        return dateLivraisonEffective;
    }

    public void setDateLivraisonEffective(Date dateLivraisonEffective) {
        this.dateLivraisonEffective = dateLivraisonEffective;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }
}
