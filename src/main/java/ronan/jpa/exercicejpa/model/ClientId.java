package ronan.jpa.exercicejpa.model;

import java.io.Serializable;

public class ClientId implements Serializable {

    private String nom;

    private String prenom;

    public ClientId(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
}
