package exercicio9;

import exercicio8.Exercicio8;

import java.util.ArrayList;

public class Exercicio9 {
    private int [] lista_indices = {1,2};
    private ArrayList<Integer> valores = new ArrayList<>();

    public Exercicio9 (ArrayList<Integer> valores){
        this.valores = valores;
    }

    public void metodoRemove(){
        System.out.println(valores);
        for (int i = 0; i <lista_indices.length ; i++) {
            System.out.println(this.valores);
            valores.remove(lista_indices[i]);
        }
        System.out.println(this.valores);
    }
}
