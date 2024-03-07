package exercicio5;

import java.util.ArrayList;

public class Programa {
    public static void main(String[] args) {

        ArrayList <String> textos = new ArrayList<>();
        textos.add("Texto 1");
        textos.add("Texto 2");
        System.out.println(textos);
        Exercicio5 exercicio5 = new Exercicio5(textos);
        exercicio5.substituir(textos, "Texto 1");
    }
}
