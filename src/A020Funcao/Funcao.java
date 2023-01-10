package A020Funcao;

public class Funcao {

    static void soma(int a, int b) {
        int soma = a + b;
        System.out.println("O valor da soma e: " + soma);
    }

    // O método main é o método principal. Por onde o programa começa.
    // Métodos não retornam valor
    // Funções retornam valor
    public static void main(String[] args) {
    
        System.out.println("Comecou o programa");

        soma(9, 2);
    }
}
