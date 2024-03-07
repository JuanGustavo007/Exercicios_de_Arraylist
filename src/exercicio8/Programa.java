package exercicio8;

public class Programa {
    public static void main(String[] args) {

        Exercicio8 exercicio8 = new Exercicio8(30);
        Exercicio8 exercicio81 = new Exercicio8(40);

        if (exercicio8.compareTo(exercicio81) > 0) {
            System.out.println("Exercicio 8 é maior");
        }else{
            System.out.println("Exercicio81 é maior");
        }
    }
}
