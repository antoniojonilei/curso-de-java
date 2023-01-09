package A005OperadoresAritmeticos;

import java.util.Scanner;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero1 = 8;
        int numero2 = 5;
        float media = numero1 + numero2 / 2;

        System.out.printf("A média é de : %.2f \n\n", media);

        System.out.print("Numerador: ");
        int numerador = teclado.nextInt();
        System.out.print("Denominador: ");
        int denominador = teclado.nextInt();

        int divisao = numerador / denominador;
        int restoDivisao = numerador % denominador; 

        System.out.println("Divisao: " + divisao);
        System.out.println("Resto: " + restoDivisao);

        
        // Operadores Unários
        int numero3 = 5;
        int valor = 5 + ++numero3;
        System.out.println("depois do valor: " + numero3);
        int valor2 = 6 + numero3--;
        System.out.println(valor);
        System.out.println(numero3);
        System.out.println(valor2);

        // Atenção no pré-incremento/decremento e no pós-incremento/decremento

        // Operadores de Incremento

        // +=
        // -=
        // *=
        // /=
        // %=

        int numeroX = 1;
        numeroX += 2;
        System.out.println(numeroX);


        // class Math para cálculos matemáticos
        // Math.PI -  numero de pi
        // Math.pow(numero base, potencia) - exponencianão Math.pow(5, 2) = 25
        // Math.cbrt() - raiz cubica
        // Math.random()  - gera um valor aleatório entre 0 e 1.0

        int numeroR = 9;
        float raiz = (float) Math.sqrt(numeroR);
        System.out.println(raiz);

        double aleatorio = Math.random();
        System.out.println(aleatorio);

        // aleatório entre 5 e 10 - por exemplo 
        double aleatoriEspecifico = 5 + Math.random() * 10 - 5;
        System.out.println(aleatoriEspecifico);
        teclado.close();
    }   
}
