/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionmap;

import java.util.Objects;

/**
 *
 * @author Hp Compac
 */
public class Employe {
    private int cin ;
    private String matricule ; 
    private String nom ;
    private String prenom ;

    public Employe() {
    }
    public Employe(int cin, String matricule, String nom, String prenom) {
        this.cin = cin;
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
    }

 

    @Override
    public String toString() {
        return "Employe{" + "cin=" + cin + ", matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + this.cin;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employe other = (Employe) obj;
        if (this.cin != other.cin) {
            return false;
        }
        return true;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
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

   

    
  

    

    

    
}
