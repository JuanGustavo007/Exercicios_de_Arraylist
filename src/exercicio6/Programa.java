package exercicio6;

import java.util.ArrayList;

public class Programa {
    public static void main(String[] args) {
        ArrayList<String> texto = new ArrayList<>();
        texto.add("Texto 1");
        texto.add("texto 2");
        texto.add("texto 3");
        Exercicio6 exercicio6 = new Exercicio6(texto);
        exercicio6.metodo("Texto", "Mais um", "Outro");

    }
}
