package Exercicio;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        // Scanner teclado = new Scanner(System.in);

        // System.out.print("Digite uma idade: ");
        // int idade = teclado.nextInt();

        // if (idade < 18) {
        //     System.out.println("Não pode beber.");
        // }

        // System.out.println("Fimd do programa");
        // -----------------------------------------------


        boolean almocou = true;
        boolean estudou = false;

        String jogar = almocou && estudou ? "Pode Jogar" : "Não pode jogar";

        System.out.println(jogar);
    }
}
