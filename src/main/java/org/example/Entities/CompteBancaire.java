package org.example.Entities;

import jakarta.persistence.*;

@Entity
public class CompteBancaire {
    @Id
    @Column
    private String numero;

    @Column
    private float solde;

    @Column
    private float dateOuverture;

    @Column
    private String nomClient;

    @Column
    private String prenomClient;

    @Column
    private String numeroAgence;

    @Column
    private String numeroBanque;

    public CompteBancaire(String numero, float solde, float dateOuverture, String nomClient, String prenomClient, String numeroAgence, String numeroBanque) {
        this.numero = this.numero;
        this.solde = this.solde;
        this.dateOuverture = this.dateOuverture;
        this.nomClient = this.nomClient;
        this.prenomClient = this.prenomClient;
        this.numeroAgence = this.numeroAgence;
        this.numeroBanque = this.numeroBanque;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }

    public float getDateOuverture() {
        return dateOuverture;
    }

    public void setDateOuverture(float dateOuverture) {
        this.dateOuverture = dateOuverture;
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

    public String getNumeroAgence() {
        return numeroAgence;
    }

    public void setNumeroAgence(String numeroAgence) {
        this.numeroAgence = numeroAgence;
    }

    public String getNumeroBanque() {
        return numeroBanque;
    }

    public void setNumeroBanque(String numeroBanque) {
        this.numeroBanque = numeroBanque;
    }

    //    public Client getClient(String nomClient, String prenomClient, String numero){
//        Client client ;
//        return client;
//    }
}
