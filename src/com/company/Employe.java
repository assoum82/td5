package com.company;

public class Employe{

    private String Nom;
    private String Fonct;
    private double Salaire;

    public Employe (String Nom, String Fct, double Sal){
        this.Nom = Nom;
        this.Fonct = Fct;
        this.Salaire = Sal;
    }

    public Employe (String Nom, String Fct){
        this.Nom = Nom;
        this.Fonct = Fct;
    }

    public double calculMontant ()
    {
        return this.Salaire;
    }

    public String Cheque (){
        return " Mr  "+ this.Nom + " Payez,contre ce chéque  " + calculMontant + ;
    }

}
