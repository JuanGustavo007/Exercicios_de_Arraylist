package exercicio5;

import java.util.ArrayList;

public class Exercicio5 {
    //Escreva um método que aceite um ArrayList de strings e
    // substitua todas as ocorrências de uma determinada string por outra string.

    private ArrayList<String> valores = new ArrayList<>();

    public Exercicio5(ArrayList<String> valores){
        this.valores = valores;
    }

    public void substituir(ArrayList<String> valores, String comparacao){
        for (int i = 0; i <valores.size() ; i++) {
            if (valores.get(i).contains(comparacao)){
                valores.set(i, "Texto trocado");
            }
        }
        System.out.println(valores);
    }
}
