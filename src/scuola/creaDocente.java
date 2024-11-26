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
public class creaDocente {
    
    Scanner scan = new Scanner(System.in);
    Docente docente = new Docente();
    private String conferma;
    
    public creaDocente(){
        System.out.println("");
        System.out.println("-------------------------");
        System.out.println("Creazione docente nuovo: ");
        docente.setCognomeMateria();
    }
    
    
    public void visualizzaTutto(){
        System.out.println("Vuoi visualizzare i dettagli del docente?: (Y / N)" );
       conferma = scan.nextLine();
       if ("Y".equals(conferma)){
           docente.visualizzaDocente();
       }
       if ("N".equals(conferma)){
           System.out.println("Grazie per il vostro tempo!");
       }
        
    }
    
}
