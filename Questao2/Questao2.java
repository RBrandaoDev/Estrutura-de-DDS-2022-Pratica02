package Questao2;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner (System.in);
        
        ListaLigada listaNoiva = new ListaLigada();
        ListaLigada listaNoivo = new ListaLigada();
        ListaLigada join = new ListaLigada();
        
        String nomeNoivo = "abc";
        String nomeNoiva = "cba";
        
        for (int i = 1; i < 3; i++ ){
            System.out.print(i + " Convidado Noiva: " );
            nomeNoiva =  ler.nextLine();  
            listaNoiva.adicionar(nomeNoiva);
            
        }
        
        System.out.println("------------------------------");
        
       for (int i = 1; i < 3 ; i++){
            System.out.print(i + " Convidado Noivo: ");
            nomeNoivo = ler.nextLine();
            listaNoivo.adicionar(nomeNoivo);
        }
       
        System.out.println("Tamanho: " + listaNoivo.getTamanho());
        System.out.println("Tamanho: " + listaNoiva.getTamanho());
        
        for (int i = 0; i < listaNoiva.getTamanho(); i++){
             join.adicionar(listaNoiva.get(i).getValor());
        }
         
        for (int i = 0 ; i < listaNoivo.getTamanho(); i++){
            join.adicionar(listaNoivo.get(i).getValor());
                       
        }
        
         System.out.println("Tamanho: " + join.getTamanho());

         
         for (int i = 0; i < join.getTamanho(); i++){
             System.out.println(join.get(i).getValor());
         }
    }    
}
        

