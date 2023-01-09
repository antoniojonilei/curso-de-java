package A010CondicionalComposta;

import java.util.Scanner;

public class CondicionalComposta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ano de Nacimento: ");
        int anoNscimento = teclado.nextInt();
        int idade = 2023 - anoNscimento;
       
        if (idade >= 18 ) {
            System.out.println("Maio de idade");
        } else {
            System.out.println("Menor de idade");
        }

        System.out.println("Fim do programa");
        teclado.close();
    }
}
