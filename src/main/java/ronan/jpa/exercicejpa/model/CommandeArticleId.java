package ronan.jpa.exercicejpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class CommandeArticleId implements Serializable {
    @Column(name="numero_commande")
    private long numeroCommande;

    @Column(name="denomination_article")
    private String denominationArticle;

    public long getNumeroCommande() {
        return numeroCommande;
    }

    public void setNumeroCommande(long numeroCommande) {
        this.numeroCommande = numeroCommande;
    }

    public String getDenominationArticle() {
        return denominationArticle;
    }

    public void setDenominationArticle(String denominationArticle) {
        this.denominationArticle = denominationArticle;
    }
}
