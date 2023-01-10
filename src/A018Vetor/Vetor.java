package A018Vetor;

import java.util.Arrays;

public class Vetor {
    public static void main(String[] args) {
        // busca de posição em vetor (indice)

        int vetor[] = { 3, 7, 6, 1, 9, 4, 2 };

        for (int valor: vetor) {
            System.out.println("valor: " + valor);
        }

        int posicao = Arrays.binarySearch( vetor, 1); // (array, valor)

        // Se o binarySearch não encontrar o valor em nenhumna posição array, o valor buscado vai ficar negativo

        System.out.println("Encontrei o valor na posição " + posicao);
    
    }
}
