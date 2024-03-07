package exercicio8;

public class Exercicio8 implements Comparable <Exercicio8>{


    private int valor;

    public Exercicio8 (int valor){
        this.valor = valor;
    }

    @Override
    public int compareTo(Exercicio8 o) {
        return Integer.compare(this.valor , o.valor);
    }
}
