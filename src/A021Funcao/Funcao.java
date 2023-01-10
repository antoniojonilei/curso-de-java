package A021Funcao;

public class Funcao {

    // Para chamar um método dentro de um metodo static, tbm se utiliza um metodo static

    static int somarValores(int a, int b) {
        int soma = a + b;
        return soma;
    }

    public static void main(String[] args) {
        System.out.println("Começou o programa");

        int somaVar = somarValores(2, 3); 

        System.out.println("O valor de soma: " + somaVar);
    }
}
