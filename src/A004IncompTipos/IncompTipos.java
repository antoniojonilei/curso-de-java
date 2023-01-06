// incompatibilidade de tipos
package A004IncompTipos;

public class IncompTipos {
    public static void main(String[] args) {
        int idade = 31;
        // String valor = idade; 
        // String valor = (String) idade
        String valor = Integer.toString(idade);
        
        System.out.println(valor);

        String numeroEmString = "32";
        // int idadeString = numeroEmString;
        // int idadeString = (int) numeroEmString;
        int idadeString = Integer.parseInt(numeroEmString);
        
        System.out.println(idadeString);

        String numeroFloat = "48.56";
        float floatString = Float.parseFloat(numeroFloat);

        System.out.printf("%.3f", floatString);
    }
}
