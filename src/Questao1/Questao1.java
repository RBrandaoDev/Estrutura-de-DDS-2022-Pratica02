package Questao1;

public class Questao1 {

  public static void main(String[] args) {

      String nome;
      
    ListaLigada lista = new ListaLigada();
    ListaLigada priori = new ListaLigada();

    for (int i = 1; i <= 2; i++) {
      lista.inserirFinal(i);

    }

    for (int i = 1; i <= 100; i += 2) {
      priori.inserirFinal(i);

      if ((i % 2) != 0) {
        lista.remover(i);
      }

    }

    lista.mostrarLista();
    priori.mostrarLista();

  }

}
