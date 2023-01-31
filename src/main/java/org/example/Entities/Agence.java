package org.example.Entities;
import jakarta.persistence.*;

@Entity
public class Agence {
    @Column
    @Id
    private String numero;

    @Column
    private String nom;

    @Column
    private String adresse;

    @Column
    private String ville;

    @Column
    private String codePostal;

    @Column
    private String nomDirecteur;

    @Column
    private String nomBanque;

    @OneToOne
    private Banque banque;

    @OneToMany
    private Employe employe;

    public Agence (String numero,String nom,String adresse,String ville,String codePostal,String nomDirecteur,String nomBanque){
        this.numero = numero;
        this.nom = nom;
        this.adresse = adresse;
        this.ville = ville;
        this.codePostal = codePostal;
        this.nomDirecteur = nomDirecteur;
        this.nomBanque = nomBanque;
    }

    public String getNumero(){return numero;}
    public void setNumero(String numero){this.numero=numero;}

    public String getNom(){return nom;}
    public void setNom(String nom){this.nom=nom;}

    public String getAdresse(){return adresse;}
    public void setAdresse(String adresse){this.adresse = adresse;}

    public String getVille(){return ville;}
    public void setVille(String ville){this.ville=ville;}

    public String getCodePostal(){return codePostal;}
    public void setCodePostal(String codePostal){this.codePostal = codePostal;}

    public String getNomDirecteur(){return nomDirecteur;}
    public void setNomDirecteur(String nomDirecteur){this.nomDirecteur = nomDirecteur;}

    public String getNomBanque(){return nomBanque;}
    public void setNomBanque(String nomBanque){this.nomBanque = nomBanque;}

    public String[] numerosComptesAvecInterets(String nomBanque){
        String [] compteAI = new String[0];//je ne devrait pas initialiser le tableau, mais je l'ai fait pour pouvoir faire un return d'abord puisque pour l'instant le tableau est vide.
        return compteAI;
    }

    public String[] numerosComptesSansInterets(String nomBanque){
        String [] comptesSI = new String[0];//je ne devrait pas initialiser le tableau, mais je l'ai fait pour pouvoir faire un return d'abord puisque pour l'instant le tableau est vide.
        return comptesSI;
    }

    public String[] listeCompte(String nomBanque){
        String [] comptes = new String[0];//je ne devrait pas initialiser le tableau, mais je l'ai fait pour pouvoir faire un return d'abord puisque pour l'instant le tableau est vide.
        return comptes;
    }

    public String[] listeEmployes(String nomBanque){
        String [] employes = new String[0];//je ne devrait pas initialiser le tableau, mais je l'ai fait pour pouvoir faire un return d'abord puisque pour l'instant le tableau est vide.
        return employes;
    }
}
