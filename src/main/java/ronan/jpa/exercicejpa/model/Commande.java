package ronan.jpa.exercicejpa.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "commande")
public class Commande {
    @Id
    private long numero;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="date_commande")
    private LocalDateTime dateCommande;

    @Column(name="nom_client")
    private String nomClient;

    @Column(name="prenom_client")
    private String prenomClient;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name = "nom_client", referencedColumnName = "nom"),
            @JoinColumn(name = "prenom_client", referencedColumnName = "prenom")
    })
    private Client client;

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public LocalDateTime getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(LocalDateTime dateCommande) {
        this.dateCommande = dateCommande;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getPrenomClient() {
        return prenomClient;
    }

    public void setPrenomClient(String prenomClient) {
        this.prenomClient = prenomClient;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
