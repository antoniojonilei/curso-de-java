package A007ComparandoStrings;

public class ComparandoStrings {
    public static void main(String[] args) {
        String nome1 = "Jonilei";
        String nome2 = "Jonilei";
        String nome3 = new String("Jonilei");
        String res;
        res = nome1 == nome3 ? "igual" : "diferente";

        String igualdadeConteudo = nome2.equals(nome3) ? "igual" : "diferente";

        System.out.println("valor de res: " + res);
        System.out.println("valor de igualdade: " + igualdadeConteudo);

        // ^ - Ou exclusivo
        // || - ou
        // && - E 
        // ! - não  
    }
}
