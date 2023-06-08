package ronan.jpa.exercicejpa.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "client", schema = "commandes")
// 1 @IdClass(ClientId.class)
public class Client {

    @EmbeddedId
    private ClientIdEmbedded nomPrenom;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "client")
    private List<Commande> commandes;

    // 1 @Id
    // 1 private String nom;

    // 1 @Id
    // 1 private String prenom;

    @Transient // avec EmbeddedId pour signifier que le nom n'est pas à sauvegarder à ce niveau
    public String getNom() {
        // 1 return nom;
        return nomPrenom.getNom();
    }

    public void setNom(String nom) {
        // 1 this.nom = nom;
        nomPrenom.setNom(nom);
    }

    @Transient // avec EmbeddedId pour signifier que le nom n'est pas à sauvegarder à ce niveau
    public String getPrenom() {
        // 1 return prenom;
        return nomPrenom.getPrenom();
    }

    public void setPrenom(String prenom) {
        // 1 this.prenom = prenom;
        nomPrenom.setPrenom(prenom);
    }

}

