package exercicio2;

import java.util.ArrayList;
import java.util.Objects;

public class Exercicio2 {
    private ArrayList <Object> lista1;
    private ArrayList <Object> lista2;

    public Exercicio2 (ArrayList <Object> lista1, ArrayList <Object> lista2){
        this.lista1 = lista1;
        this.lista2 = lista2;
    }

    public void comparar (ArrayList <Object> lista1, ArrayList <Object> lista2){
        ArrayList <Object> valores_comparados = new ArrayList<>();
        for (int i = 0; i < lista1.size(); i++) {
            if (lista2.contains(lista1.get(i))){
                valores_comparados.add(lista1.get(i));
            }else{
                System.out.println("A posição " + lista1.get(i) + "Não contém no array");
            }
        }

        for (int i = 0; i < lista2.size(); i++) {
            if (lista1.contains(lista2.get(i))){
                valores_comparados.add(lista2.get(i));
            }else{
                System.out.println("A posição " + lista2.get(i) + "Não contém no array");
            }
        }

        System.out.println(valores_comparados);

    }
}
