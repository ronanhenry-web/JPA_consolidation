package ronan.jpa.exercicejpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "commande_article")
public class CommandeArticle {
    @Id
    private long numero;

    @Column(name="denomination_article")
    private String denominationArticle;

    private int quantite;

    public long getNumero()
    {
        return numero;
    }

    public void setNumero(long numero)
    {
        this.numero = numero;
    }

    public String getDenominationArticle()
    {
        return denominationArticle;
    }

    public void setDenominationArticle(String denominationArticle)
    {
        this.denominationArticle = denominationArticle;
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
