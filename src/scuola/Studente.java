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
public class Studente {
    
    Scanner in = new Scanner(System.in);
    private String cognome;
    private String nome;
    private String[] materie = new String[3];
    private int[] voti = new int[3];
    private int conta;
    private int contaStampa = 1;
    private float media;
    
    public Studente(){
    }
    
    public void setCognomeNome(){
        System.out.println("Inserisci il tuo cognome:");
        this.cognome = in.nextLine();
        System.out.println("-------------------------");
        System.out.println("Inserisci il tuo nome:");
        this.nome = in.nextLine();
        System.out.println("-------------------------");
    }
    
    private void setNumVoti(){
        System.out.println("Quanti voti vuoi inserire? :");
        conta = in.nextInt();
        while (conta > 3 || conta < 0){
            System.out.println("Massimo 3 voti!");
            System.out.println("Quanti voti vuoi inserire? :");
            System.out.println("-------------------------");
            conta = in.nextInt();
        }
        
    }
    
    public void setVoto(){
        setNumVoti();
        contaStampa=1;
          for (int i = 0; i <= conta-1; i++){
            System.out.println("Inserisci voto " + contaStampa + ": ");
            voti[i] = in.nextInt();
            System.out.println("Inserisci materia: ");
            materie[i] = in.next();
            System.out.println("-------------------------");
            contaStampa++;
        }
    }
    
    public void visualizzaStudente(){
        System.out.println("");
        String myStudente = "Cognome: " + cognome + "\nNome: " + nome;
        System.out.println("-------------------------");
        System.out.println(myStudente);
    }
    public void visualizzaVoti(){
         contaStampa=1;
        for(int i = 0; i<=conta-1; i++){
            System.out.println("-------------------------");
            System.out.println("Voto "+ contaStampa + ": " + voti[i]);
            System.out.println("Materia: " + materie[i]);
            System.out.println("-------------------------");
            contaStampa++;
            
        }
    }
    public void media(){
        if (conta == 0){
            System.out.println("Studente non ha ancora voti;");
        } else {
                System.out.println("Media dei voti e': " + media);
        }
        int somma = 0;
        for (int i = 0; i <=conta-1; i++){
            somma = somma +voti[i];
        }
        media = (float)somma/conta;
        if (media < 6){
            System.out.println("Lo studente ha il debito!");
        }
    }
    
    
    
    
}
