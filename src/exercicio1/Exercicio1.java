package exercicio1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Exercicio1 {
    //Escreva um método que aceite dois ArrayLists como entrada e retorne um novo ArrayList contendo
    // todos os elementos únicos presentes em ambos os ArrayLists.
    private ArrayList <Object> lista = new ArrayList<>();
    private ArrayList <Object> lista2 = new ArrayList <>();

    public Exercicio1 (ArrayList l, ArrayList l2){
        this.lista = l;
        this.lista2 = l2;
    }

    public void juntarLista (){
        Set valores_juntos = new HashSet();

        for (int i = 0; i <this.lista.size() ; i++) {

            valores_juntos.add(lista.get(i));
        }

        for (int i = 0; i < this.lista2.size(); i++) {

            valores_juntos.add(lista2.get(i));
        }

        valores_juntos.forEach(valor -> {
            System.out.println(valor);
        });
    }


}
