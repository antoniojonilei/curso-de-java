package A009CondicionaisSimples;

import java.util.Scanner;

public class CondicionaisSimples {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite primeira nota: ");
        float nota1 = teclado.nextFloat();
        System.out.print("Digite segunda nota: ");
        float nota2 = teclado.nextFloat();

        float media = (nota1 + nota2) / 2;

        System.out.println("Média: " + media);

        if (media > 9) {
            System.out.println("Parabéns!");
        }

        System.out.println("Fim do programa");
        teclado.close();

    }
}
