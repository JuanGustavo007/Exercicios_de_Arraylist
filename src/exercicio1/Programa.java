package exercicio1;

import java.util.ArrayList;

public class Programa {
    public static void main(String[] args) {
        ArrayList <Object> lista1 = new ArrayList<>();
        lista1.add("Texto");
        lista1.add(2);
        lista1.add(true);

        ArrayList <Object> lista2 = new ArrayList<>();
        lista2.add("Texto2");
        lista2.add(2);
        lista2.add(false);
        lista2.add(true);


        Exercicio1 ex = new Exercicio1(lista1, lista2);

        ex.juntarLista();

    }
}
