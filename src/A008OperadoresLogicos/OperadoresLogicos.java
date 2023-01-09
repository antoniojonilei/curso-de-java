package A008OperadoresLogicos;

public class OperadoresLogicos {
    public static void main(String[] args) {
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;

        System.out.println("valor 1: " + x + "valor 2: " + y + "valor 3: " + z);

        boolean res;

        res = x < 4 && y < 12 ? true : false;

        System.out.println(res);
    }
}
