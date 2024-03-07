package exercicio7;

import java.util.ArrayList;

public class Programa {
    public static void main(String[] args) {

        ArrayList <Integer> inteiros = new ArrayList<>();
        inteiros.add(1);
        inteiros.add(10);
        inteiros.add(30);

        Exercicio7 exe7 = new Exercicio7(inteiros);
        exe7.retornoInteiros();



    }
}
