package A015RepeticaoAninhada;

public class RepeticaoAninhada {
    public static void main(String[] args) {
        
        for ( int i = 0; i <= 3; i++ ) {
            System.out.println("I: " + i);

            for ( int j = 0; j <= 2; j+=2 ) {
                System.out.println("J: " + j);
            }
        }

        System.out.println("Fim do programa");
    }
}
