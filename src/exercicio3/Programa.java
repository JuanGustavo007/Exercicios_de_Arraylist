package exercicio3;

import exercicio3.Exercicio3;

import java.util.ArrayList;

public class Programa {
    public static void main(String[] args) {
        ArrayList<Object> lista1 = new ArrayList<>();
        lista1.add("Texto");
        lista1.add(24);
        lista1.add(true);

        ArrayList <Object> lista2 = new ArrayList<>();
        lista2.add("Texto2");
        lista2.add(2);
        lista2.add(false);
        lista2.add(true);
        lista2.add("Texto");

        Exercicio3 ex3 = new Exercicio3(lista1, lista2);
        System.out.println(ex3.diferenca(lista1, lista2));

    }
}
