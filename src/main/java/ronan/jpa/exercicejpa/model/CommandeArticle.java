package ronan.jpa.exercicejpa.model;

import jakarta.persistence.*;

@Entity
@Table(name="commande_article")
public class CommandeArticle {

    @EmbeddedId
    private CommandeArticleId pk;
    /*
        @Id
        @Column(name="numero_commande")
        private Long numeroCommande;
        @Id
        @Column(name="denomination_article")
        private String denominationArticle;
     */
    private Integer quantite;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="denomination_article", insertable = false, updatable = false)
    private Article article;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="numero_commande", insertable = false, updatable = false)
    private Commande commande;

    @Transient
    public Long getNumeroCommande() {
        return this.pk.getNumeroCommande();
    }
    public void setNumeroCommande(Long numeroCommande) {
        this.pk.setNumeroCommande(numeroCommande);
    }
    @Transient
    public String getDenominationArticle() {
        return this.pk.getDenominationArticle();
    }
    public void setDenominationArticle(String denominationArticle) {
        this.pk.setDenominationArticle(denominationArticle);
    }
    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }
}
