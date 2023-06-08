package ronan.jpa.exercicejpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "article")
public class Article {
    @Id
    private String denomination;

    private float coutHorsTaxe;

    private float tva;

    public String getDenomination() {
        return denomination;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    public float getCoutHorsTaxe() {
        return coutHorsTaxe;
    }

    public void setCoutHorsTaxe(float coutHorsTaxe) {
        this.coutHorsTaxe = coutHorsTaxe;
    }

    public float getTva() {
        return tva;
    }

    public void setTva(float tva) {
        this.tva = tva;
    }
}
