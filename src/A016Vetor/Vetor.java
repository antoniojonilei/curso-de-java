package A016Vetor;

public class Vetor {
    public static void main(String[] args) {

        // int[] numero = { 3, 2, 5, 8, 4 };
        
        int numeros[] = { 3, 2, 5, 8, 4, 7 };

        System.out.println("O total de indices: " + numeros.length);

        for (int contador = 0; contador <= numeros.length - 1; contador++) {
            System.out.print(numeros[contador] + " ");
        }
    }
}
