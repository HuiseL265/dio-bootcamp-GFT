package LogicaCondicionalEControleDeFluxo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i, num = 5;
        for (i = 0; i < 3; i++) {
            num += i;
            System.out.print(i);
        }


        int mesInformado;
        String nomeMes = "";
        boolean ferias = false;

        System.out.println("Informe o numero do mes: ");
        mesInformado = scan.nextInt();

        switch (mesInformado) {
            case 1 -> {
                nomeMes = "Janeiro";
                ferias = true;
            }
            case 2 -> nomeMes = "Fevereiro";
            case 3 -> nomeMes = "Março";
            case 4 -> nomeMes = "Abril";
            case 5 -> nomeMes = "Maio";
            case 6 -> nomeMes = "Junho";
            case 7 -> {
                nomeMes = "Julho";
                ferias = true;
            }
            case 8 -> nomeMes = "Agosto";
            case 9 -> nomeMes = "Setembro";
            case 10 -> nomeMes = "Outubro";
            case 11 -> nomeMes = "Novembro";
            case 12 -> {
                nomeMes = "Dezembro";
                ferias = true;
            }
            default -> {
            }
        }

        if (mesInformado != 0 && mesInformado < 13){
            System.out.println("Mes informado: " + nomeMes);
            if (ferias){
                System.out.println("Voce esta de ferias, aproveite!");
            }
        }else{
            System.out.println("Mes informado invalido");
        }



    }
}
