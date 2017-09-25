/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adveillaul
 */
public class Promotion {
    public List<Etudiants> listeEtudiants = new ArrayList<>();
    
    public void ajouterEtudiant(String nom){
        Etudiants etudiant = CreerEtudiant.creerEtudiant(nom);
        listeEtudiants.add(etudiant);
        
    }
}
