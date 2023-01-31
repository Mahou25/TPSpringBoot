package org.example.Entities;

import jakarta.persistence.*;

@Entity
public class CompteAvecInterets extends CompteBancaire {
    @Id
    @Column
    private String numero;

    @Column
    private float solde;

    @Column
    private float dateOuverture;

    @Column
    private float taux;

    @Column
    private String nomClient;

    @Column
    private String prenomClient;

    @Column
    private String numeroAgence;

    @Column
    private String numeroBanque;

    public CompteAvecInterets(String numero,float solde,float dateOuverture,float taux,String nomClient,String prenomClient,String numeroAgence,String numeroBanque) {
        super(numero,solde,dateOuverture,nomClient,prenomClient,numeroAgence,numeroBanque);
        this.taux = taux;
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

    public float getTaux() {
        return taux;
    }

    public void setTaux(float taux) {
        this.taux = taux;
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
