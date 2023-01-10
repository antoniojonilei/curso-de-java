package Vetores;

public class Vetores {
    public static void main(String[] args) {

        String mes[] = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" };

        int totalDiasMes[] = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        int totalDiasAno = 0;

        for (int i = 0; i < mes.length; i++) {
             totalDiasAno += totalDiasMes[i];  
            //  System.out.println("total dias ano - " + totalDiasAno);           
        }

        if (totalDiasAno == 366) {
            System.out.println("O ano tem um total de " + totalDiasAno + ". Ano bissextro");
        }

        System.out.println(" -- -- -- -- -- -- ");

        for (int contador = 0; contador < mes.length; contador++) {
            System.out.println("O mes de " + mes[contador] + " tem " + totalDiasMes[contador] + " dias");
        }
    }
}
