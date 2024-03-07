package exercicio4;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Exercicio4 {
    //Escreva um método que aceite um ArrayList de elementos e retorne
    // um Map que mapeie cada elemento para sua frequência no ArrayList.

    private ArrayList <Object> valores = new ArrayList<>();
    private Map<Integer, Object> mapa = new HashMap<>();


    public Exercicio4(ArrayList<Object> valor){
        this.valores = valor;
    }

    public void metodo(ArrayList<Object> valor){
        for (int i = 0; i <valor.size() ; i++) {
            mapa.put(i, valor.get(i));
        }

        System.out.println(mapa);
    }
}
