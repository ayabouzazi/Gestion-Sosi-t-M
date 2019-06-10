/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Hp Compac
 */
public class Societe implements InterfaceSociete {
    
    Map <Employe, Departement > map =  new HashMap() ;//on peut ajouter les types HashMap
    
    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
         map.put(e,d); // add prent un seul parametre dans ce cas on a besoin d'une methode qui prend 2 valeurs 
      }// la méthode add pour les set et les liste prend uniquement une valeure(argument) donc on utilise put

    @Override
    public void supprimerEmploye(Employe e) {
        map.remove(e); //il suffit de donner la cle pour que la ligne s'efface tt entiére
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        System.out.println(map);
    }
     
    public void afficherLesEmployesLeursDepartements2() {
        for (Employe e : map.keySet()) {
            System.out.println (e+"-"+map.get(e));
        }
       
    }
public void afficherLesEmployesLeursDepartements3() {
        for (Map.Entry <Employe , Departement > entry : map.entrySet()) {
            System.out.println (entry.getKey()+" - "+entry.getValue());
        }
       
    }
    @Override
    public void afficherLesEmployes() {
      
        for (Employe e : map.keySet()) {
            System.out.println (e);
        }
        
        
    }

    @Override
    public void afficherLesDepartements() {
        //on va utiliser un set pour supprimer les doublons
        //Set<Departement>setD = new HashSet(map.values());
           for (Departement d : map.values()) {
            System.out.println (d);
        }
    }

    @Override
    public void afficherDepartement(Employe e) {
          System.out.println(map.get(e));
    }
   
    public void afficherLesDepartements1() {
    // on va utiliser un set pour supp les doublons 
    Set <Departement>  setD = new HashSet() ;
        setD.addAll(map.values());
        for ( Departement d : setD){
        System.out.println(d);
    }
    }
    @Override
    public boolean rechercherEmploye(Employe e) {
       
        return map.containsKey(e);
    
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        return map.containsValue(d) ;
    
    }
      
}
