package A003EntradaDeDados;

// import do Scanner para entrada de dados
import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();
        System.out.print("Digite sua nota: ");
        float nota = teclado.nextFloat();

        teclado.close();

        System.out.printf("A nota de de %s é %.2f", nome, nota);

    }
}

// int idade = teclado.nextInt(); ---- para ler inteiros
// float idade = teclado.nextFloat(); ---- para ler numeros reais
// String nome = teclado.nextLine(); ---- para ler strings