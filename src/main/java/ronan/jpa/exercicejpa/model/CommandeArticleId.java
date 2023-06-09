package ronan.jpa.exercicejpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class CommandeArticleId implements Serializable {

    @Column(name="denomination_article")
    private String denominationArticle;

    @Column(name="numero_commande")
    private Long numeroCommande;

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
