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
public class creaStudente  {
    Scanner scan = new Scanner(System.in);
    Studente studente = new Studente();
    private String conferma;
    
    public creaStudente(){
        System.out.println("-------------------------");
        System.out.println("Creazione studente: ");
        studente.setCognomeNome();
        studente.setVoto();
        visualizzaTutto();
    }
    
    public void visualizzaAlunno(){
        studente.visualizzaStudente();
        studente.visualizzaVoti();
        studente.media();
    }
    
    public void visualizzaTutto(){
        System.out.println("Vuoi visualizzare i dettagli dello studente?: (Y / N)" );
       conferma = scan.nextLine();
       if ("Y".equals(conferma)){
           visualizzaAlunno();
       }
       if ("N".equals(conferma)){
           System.out.println("Grazie per il vostro tempo!");
       }
        
    }
            

    
}
