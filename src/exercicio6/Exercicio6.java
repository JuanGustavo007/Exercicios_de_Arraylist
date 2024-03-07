package exercicio6;

import java.util.ArrayList;

public class Exercicio6 {
    private ArrayList<String> listaTextos = new ArrayList<>();

    public Exercicio6(ArrayList<String> texto){
        this.listaTextos = texto;
    }
    public void metodo(String ... textos){
        for (int i = 0; i <textos.length ; i++) {
            listaTextos.add(textos[i]);
        }
        System.out.println(listaTextos);
    }


}
