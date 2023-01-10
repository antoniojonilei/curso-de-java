package A019Vetor;

import java.util.Arrays;

public class Vetor {
    public static void main(String[] args) {
        
        int numeros[] = new int[20]; 

        Arrays.fill(numeros, 0);

        for (int valor: numeros) {
            System.out.print(valor + " ");
        }

        System.out.println("\nFim do programa");
    }
}
