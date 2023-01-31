package org.example.Entities;

import jakarta.persistence.*;

@Entity
public class Client {
    @Id
    @Column
    private String numero;

    @Column
    private String nom;

    @Column
    private String prenom;

    @Column
    private String adresse;

    @Column
    private String nomConseiller;

    //Les relations
    @OneToMany
    private CompteBancaire compteBancaire;

    @OneToOne
    private Agence agence;
    //Le constructeur
    public Client(String numero,String nom,String prenom,String adresse,String nomConseiller){
        this.numero = numero;
        this.nom = nom;
        this.prenom = prenom;
        this.nomConseiller = nomConseiller;
    }

    //Les getters et setters
    public String getNumero(){return numero;}
    public void setNumero(String numero){this.numero=numero;}

    public String getNom(){return nom;}
    public void setNom(String nom){this.nom=nom;}

    public String getPrenomom(){return prenom;}
    public void setPrenom(String prenom){this.prenom=prenom;}

    public String getAdresse(){return adresse;}
    public void setAdresse(String adresse){this.adresse = adresse;}

    public String getNomConseiller(){return nomConseiller;}
    public void setNomConseiller(String nomConseiller){this.nomConseiller=nomConseiller;}
}
