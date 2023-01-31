package org.example.Entities;

import jakarta.persistence.*;

@Entity
public class Employe {
    @Column
    private String nom ;

    @Column
    private String prenom;

    @Column
    private String adresse;

    @Column
    private float salaire;

    @Id
    @Column
    private int numINSEE;

    @Column
    private String nomBanque;

    @OneToOne
    Agence agence;

    public Employe(String nom, String prenom, String adresse, float salaire, int numINSEE, String nomBanque) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.salaire = salaire;
        this.numINSEE = numINSEE;
        this.nomBanque = nomBanque;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public float getSalaire() {
        return salaire;
    }

    public void setSalaire(float salaire) {
        this.salaire = salaire;
    }

    public int getNumINSEE() {
        return numINSEE;
    }

    public void setNumINSEE(int numINSEE) {
        this.numINSEE = numINSEE;
    }

    public String getNomBanque() {
        return nomBanque;
    }

    public void setNomBanque(String nomBanque) {
        this.nomBanque = nomBanque;
    }
}
