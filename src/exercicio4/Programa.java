package exercicio4;

import java.util.ArrayList;

public class Programa {
    public static void main(String[] args) {

        ArrayList<Object> valores = new ArrayList<>();
        valores.add("Texto");
        valores.add(2);
        valores.add(299);
        valores.add(true);
        Exercicio4 ex4 = new Exercicio4(valores);
        ex4.metodo(valores);
    }
}
