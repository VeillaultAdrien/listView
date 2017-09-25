/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication3;

/**
 *
 * @author adveillaul
 */
public class CreerEtudiant {
    static public Etudiants creerEtudiant(String nom){
        Etudiants etudiant = new Etudiants(nom);
        return (etudiant);
    }
}
