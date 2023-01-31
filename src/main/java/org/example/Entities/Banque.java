package org.example.Entities;
import jakarta.persistence.*;

@Entity
public class Banque {
    @Id
    @Column
    private String numero;

    @Column
    private float capital;

    @Column
    private String adresseSiege;

    @Column
    int[]numSalaries;

    @Column
    private String[]villesAgences;



    public Banque(String numero,float capital,String adresseSiege, int[]numSalaries, String[]villesAgences){
        this.numero = numero;
        this.capital = capital;
        this.adresseSiege = adresseSiege;
        this.numSalaries = numSalaries;
        this.villesAgences = villesAgences;
    }

    public String getNumero(){return numero;}
    public void setNumero(String numero){this.numero=numero;}

    public float getCapital(){return capital;}
    public void setCapital(float capital){this.capital = capital;}

    public String getAdresseSiege(){return adresseSiege;}
    public void setAdresseSiege(String adresseSiege){this.adresseSiege = adresseSiege;}

    public int[] getNumSalaries(){return numSalaries;}
    public void setNumSalaries(int[] numSalaries){this.numSalaries = numSalaries;}

    public String[] getVillesAgences(){return villesAgences;}
    public  void setVillesAgences(String[] villesAgences){this.villesAgences = villesAgences;}

}
