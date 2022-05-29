package Colecoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Integer> respostas = new ArrayList<>();

        int contaAfirmativas = 0;

        System.out.println("Perguntas sobre o crime:");
        System.out.println("Telefonou para a vitima? (1 = Sim/2 = Nao)");
        respostas.add(scan.nextInt());
        System.out.println("Esteve no local do crime? (1 = Sim/2 = Nao)");
        respostas.add(scan.nextInt());
        System.out.println("Mora perto da vitima? (1 = Sim/2 = Nao)");
        respostas.add(scan.nextInt());
        System.out.println("Devia para a vitima? (1 = Sim/2 = Nao)");
        respostas.add(scan.nextInt());
        System.out.println("Ja trabalhou com a vitima? (1 = Sim/2 = Nao)");
        respostas.add(scan.nextInt());

        for (int resposta:respostas) {
            if (resposta == 1) {
                contaAfirmativas += 1;
            }
        }

        switch (contaAfirmativas){
            case 0:
            case 1:
                System.out.println("Inocente");
                break;
            case 2:
                System.out.println("Suspeita");
                break;
            case 3:
            case 4:
                System.out.println("Cumplice");
                break;
            case 5:
                System.out.println("Assassina");
                break;
        }



    }
}
