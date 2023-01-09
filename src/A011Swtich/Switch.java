package A011Swtich;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantidade de pernas: ");
        int pernas = teclado.nextInt();
        String tipo;
        
        switch (pernas) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bipede";
                break;
            case 3: 
                tipo = "tripé";
                break;
            case 4:
                tipo = "Quadrupede";
                break;
            case 6, 8:
                tipo = "Aranha";
                break;
            default: 
                tipo = "ET";            
        } 

        System.out.println("Voce tem o tipo: " + tipo);
        teclado.close();
    }
}