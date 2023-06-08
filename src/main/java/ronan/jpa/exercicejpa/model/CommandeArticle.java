package ronan.jpa.exercicejpa.model;

import jakarta.persistence.*;

@Entity
@Table(name = "commande_article")
public class CommandeArticle {
    /*@Id
    @Column(name="numero_commande")
    private long numeroCommande;

    @Column(name="denomination_article")
    private String denominationArticle;*/

    @EmbeddedId
    CommandeArticleId pk;

    private Integer quantite;

    public long getNumeroCommande() {
        return this.pk.getNumeroCommande();
    }

    public void setNumeroCommande(long numeroCommande) {
        this.pk.setNumeroCommande(numeroCommande);
    }

    public String getDenominationArticle()
    {
        return this.pk.getDenominationArticle();
    }

    public void setDenominationArticle(String denominationArticle)
    {
        this.pk.setDenominationArticle(denominationArticle);
    }

    public int getQuantite()
    {
        return quantite;
    }

    public void setQuantite(int quantite)
    {
        this.quantite = quantite;
    }
}
