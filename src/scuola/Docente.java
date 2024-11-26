/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scuola;

import java.util.Scanner;

/**
 *
 * @author ospite
 */
public class Docente {
    Scanner in = new Scanner(System.in);
    private String cognome;
    private String materia;
    
    public Docente(){
    }
    
    public void setCognomeMateria(){
        System.out.println("Inserisci il tuo cognome:");
        this.cognome = in.nextLine();
        System.out.println("-------------------------");
        System.out.println("Inserisci la materia di studio:");
        this.materia = in.nextLine();
        System.out.println("-------------------------");
    }
     public void visualizzaDocente(){
        System.out.println("");
        String myDocente = "Cognome: " + cognome + "\nMateria di insegnamento: " + materia;
        System.out.println("-------------------------");
        System.out.println(myDocente);
    }
    
}
