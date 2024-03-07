package exercicio7;

import java.util.ArrayList;

public class Exercicio7 {
    //Escreva um método que aceite um ArrayList de arrays de inteiros e retorne um novo array
    // que contenha a soma dos elementos correspondentes dos arrays de entrada.

    private ArrayList<Integer> inteiros = new ArrayList<>();

    public Exercicio7(ArrayList<Integer> inteiros) {
        this.inteiros = inteiros;
    }

    public void retornoInteiros (){

        this.inteiros.forEach(v ->{
            this.inteiros.set(this.inteiros.indexOf(v), this.inteiros.get(this.inteiros.indexOf(v)) +  this.inteiros.get(this.inteiros.indexOf(v)));
        });

        System.out.println(this.inteiros);
    }
}
