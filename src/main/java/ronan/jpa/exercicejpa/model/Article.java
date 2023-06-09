package ronan.jpa.exercicejpa.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "article")
public class Article {

    @Id
    private String denomination;
    @Column(name = "cout_hors_taxe")
    private Float coutUnitaireHt;
    @Column(name="tva")
    private Float tauxTva;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "article", cascade = CascadeType.DETACH)
    List<CommandeArticle> commandesArticles;

    public String getDenomination() {
        return denomination;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    public Float getCoutUnitaireHt() {
        return coutUnitaireHt;
    }

    public void setCoutUnitaireHt(Float coutUnitaireHt) {
        this.coutUnitaireHt = coutUnitaireHt;
    }

    public Float getTauxTva() {
        return tauxTva;
    }

    public void setTauxTva(Float tauxTva) {
        this.tauxTva = tauxTva;
    }

    public List<CommandeArticle> getCommandesArticles() {
        return commandesArticles;
    }

    public void setCommandesArticles(List<CommandeArticle> commandesArticles) {
        this.commandesArticles = commandesArticles;
    }
}
