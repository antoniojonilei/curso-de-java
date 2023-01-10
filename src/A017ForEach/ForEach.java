package A017ForEach;

import java.util.Arrays;

public class ForEach {
    public static void main(String[] args) {
        
        double numeros[] = { 3.5, 5.6, 8.8, 4.9, 7.3, 1.3 };

        // Colcoando o vetor em ordem - (import java.util.Arrays)
        Arrays.sort(numeros);

        for (double valor: numeros) {
            System.out.print(valor + " ");
        }

        // Usa o mesmo tipo do vetor para tipar o valor dentro do laço for
    }
}
