/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionmap;

/**
 *
 * @author Hp Compac
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
Societe societe = new Societe ();

Employe e1 = new Employe (1,"ABC123","Ben Ali","Mohamed");
Employe e2 = new Employe (2,"DEF123","Kamel","Ahmed");
Employe e3 = new Employe (3,"GHI123","Salem","Amal");

Departement d1 = new Departement (1,"Gestion");
Departement d2 = new Departement (2,"Informatique");

societe.ajouterEmployeDepartement(e1, d1);
societe.ajouterEmployeDepartement(e2, d1);
societe.ajouterEmployeDepartement(e3, d2);

societe.afficherLesEmployesLeursDepartements3();
System.out.println("************************************");
societe.afficherLesEmployes();
System.out.println("*************************************");
societe.afficherLesDepartements1();



    }
    
}
