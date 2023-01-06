package A002TiposPrimitivos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        String nome = "Jonilei";
        float nota = 8.5f;

        System.out.println("A nota é " + nota); 
        System.out.printf("Sua nota é %.2f \n", nota); // %f quer dizer do tipo floata e o numero é a quantidade de casas decimais - usar %./numero/f

        System.out.printf("A nota de %s é %.4f \n", nome, nota);
        
        // também pode ser usado format
        System.out.format("A notá de %s é %.2f \n", nome, nota);
    }
}

// System.out.println("") - digite sout e aperte TAB

// \n quebra uma linha

// print -  escreve na tela
// println - escreve e pula linha
// printf - impressão formatada ()