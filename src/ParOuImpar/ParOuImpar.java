package ParOuImpar;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Valor: ");
        float valor = teclado.nextFloat();

        if (valor % 2 == 0) {
            System.out.println("Valor Par");
        } else {
            System.out.println("Valor ímpar");
        }

        System.out.println("fim do programa");
        teclado.close();
    }
}
