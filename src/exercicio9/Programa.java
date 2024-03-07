package exercicio9;

import java.util.ArrayList;

public class Programa {
    public static void main(String[] args) {

        ArrayList <Integer> inteiros = new ArrayList<>();
        inteiros.add(10);
        inteiros.add(2);
        inteiros.add(3);
        inteiros.add(41);
        inteiros.add(1);
        Exercicio9 exercicio9 = new Exercicio9(inteiros);
        exercicio9.metodoRemove();
    }
}
