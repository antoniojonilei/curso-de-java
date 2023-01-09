package Voto;

import java.util.Scanner;

public class Voto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ano de nascimento: ");
        int anoNascimento = teclado.nextInt();
        int idade = 2023 - anoNascimento;

        System.out.println("Idade: " + idade);

        if (idade < 16) {
            System.out.println("Não vota");
        } else if ((idade >= 16 && idade < 18) || idade > 70 ) {
            System.out.println("Voto opcional");
        } else {
            System.out.println("Voto obrigatorio");
        }

        System.out.println("Fim do proghrama");
        teclado.close();
    }    
}