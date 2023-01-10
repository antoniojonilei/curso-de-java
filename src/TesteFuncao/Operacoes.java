package TesteFuncao;

public class Operacoes {
    
    public static String contador(int inicio, int fim) {
        String soma = "";
        
        for (int contador = inicio; contador <= fim; contador++) {
            soma += contador + " ";
        }

        return soma;
    }

}
