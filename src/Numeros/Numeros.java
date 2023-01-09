package Numeros;

import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero = 0;
        int soma = 0;
        String resposta;

        do {

            System.out.print("Digite um numero: ");
            numero = teclado.nextInt();
            soma += numero;
            System.out.print("Quer continuar? {S/N} ");
            resposta = teclado.next();

        } while (resposta.equals("S") || resposta.equals("s"));

        System.out.println("A soma dos numero e: " + soma);
    }
}
