package ronan.jpa.exercicejpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class CommandeArticleid implements Serializable {
    @Column(name="numero_commande")
    private long numeroCommande;

    @Column(name="denomination_article")
    private String denominationArticle;

    public String getDenominationArticle() {
        return denominationArticle;
    }

    public void setDenominationArticle(String denominationArticle) {
        this.denominationArticle = denominationArticle;
    }

    public Long getNumeroCommande() {
        return numeroCommande;
    }

    public void setNumeroCommande(Long numeroCommande) {
        this.numeroCommande = numeroCommande;
    }
}
