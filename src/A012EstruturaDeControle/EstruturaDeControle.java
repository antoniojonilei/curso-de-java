package A012EstruturaDeControle;

public class EstruturaDeControle {
    public static void main(String[] args) {
        int contador = 0;

        while (contador < 15) {
            contador++;
            
            if (contador == 5 || contador == 7) {
                continue;
            }

            if (contador == 12) {
                break;
            }

            System.out.println(contador + " Cambalhota");
            
        }

        System.out.println("Fim do programa");
    }
}

// continue; 
// - enterrompe o fluxo natural do laço, fazendo o fluxo voltar para a verificação inicial

// break; 
// -- enterrompe a execução do laço