package ronan.jpa.exercicejpa.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="commande")
public class Commande {
    @Id
    private Long numero;

    @Column(name="nom_client")
    private String nomClient;
    @Column(name="prenom_client")
    private String prenomClient;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="date_commande")
    private Date dateCommande;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name = "nom_client",
                    referencedColumnName = "nom", insertable = false, updatable = false),
            @JoinColumn(name = "prenom_client",
                    referencedColumnName = "prenom", insertable = false, updatable = false)
    })
    private Client client;

    @OneToOne(mappedBy = "commande", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Facture facture;

    @OneToMany(mappedBy = "commande", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Livraison> livraisons;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "commande", cascade = CascadeType.DETACH)
    List<CommandeArticle> commandesArticles;

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
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

    public Date getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Facture getFacture() {
        return facture;
    }

    public void setFacture(Facture facture) {
        this.facture = facture;
    }

    public List<Livraison> getLivraisons() {
        return livraisons;
    }

    public void setLivraisons(List<Livraison> livraisons) {
        this.livraisons = livraisons;
    }

    public List<CommandeArticle> getCommandesArticles() {
        return commandesArticles;
    }

    public void setCommandesArticles(List<CommandeArticle> commandesArticles) {
        this.commandesArticles = commandesArticles;
    }

    @Override
    public String toString() {
        return "Commande{" +
                "numero=" + numero +
                ", nomClient='" + nomClient + '\'' +
                ", prenomClient='" + prenomClient + '\'' +
                ", dateCommande=" + dateCommande +
                '}';
    }
}
