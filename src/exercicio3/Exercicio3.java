package exercicio3;

import java.util.ArrayList;

public class Exercicio3 {
    private ArrayList <Object> lista = new ArrayList<>();
    private ArrayList <Object> lista2 = new ArrayList<>();

    public Exercicio3 (ArrayList <Object> lista, ArrayList <Object> lista2){
        this.lista = lista;
        this.lista2 = lista2;
    }

    public ArrayList <Object> diferenca (ArrayList <Object> lista, ArrayList <Object> lista2){
        ArrayList <Object> base_comparacao = new ArrayList<>();
        for (int i = 0; i <lista.size() ; i++) {
            if (!lista2.contains(lista.get(i))){
                base_comparacao.add(lista.get(i));
            }else{
                System.out.println("O valor contém");
            }
        }
        return base_comparacao;
    }
}
