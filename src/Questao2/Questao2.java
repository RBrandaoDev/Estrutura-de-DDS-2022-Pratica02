package Questao2;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner (System.in);
        
        ListaLigada listaNoiva = new ListaLigada();
        ListaLigada listaNoivo = new ListaLigada();
        
        String nome = "abc";
        
        for (int i = 1; i < 5; i++ ){
            System.out.println(i + "Convidado: " );
            nome =  ler.nextLine();  
            listaNoiva.inserirFinal(nome);
            
        }
        
        for (int i = 1; i < 5; i++){
            System.out.println(i + "Convidado: ");
            nome = ler.nextLine();
            listaNoivo.inserirFinal(nome);
        }
            
        listaNoiva.mostrarLista();
        listaNoiva.mostrarLista();
        
        }   
}
        

