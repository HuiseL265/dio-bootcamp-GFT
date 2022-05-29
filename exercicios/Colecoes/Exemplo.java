package Colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Exemplo {
    public static void main(String[] args) {

        //List<Double> notas = new ArrayList<>(Arrays.asList(7d,2.0,9.4));
//        List<Double> notas = List.of(7d,8.5,9.3); //lista imutável!
//        notas.add(1d);
//        notas.remove(9.3);
//        System.out.println(notas);


        System.out.println("Crie uma lista e adicione as sete notas");

        ArrayList<Double> notas = new ArrayList<Double>();

        notas.add(7d);
        notas.add(7d);
        notas.add(7d);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);

        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5: " + notas.indexOf(5d));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4,8d);
        System.out.println(notas);

        System.out.println("Substitua a nota 4 pela nota 6");
        notas.set(notas.indexOf(5d),6.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));

        System.out.println("exiba todas as notas na ordem que foram informados: ");

        for(Double nota : notas) System.out.println(nota);

        System.out.println("menor nota: " + Collections.min(notas));
        System.out.println("maion nota: " + Collections.max(notas));

        System.out.println("soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }

        //Exercicio

        System.out.println("Crie uma lista chamada notas2" +
                            "e coloque todos os elementos da list ArrayList" +
                             "nessa nova lista: ");

        ArrayList<Double> notas2 = notas;

        System.out.println("notas 2: \n" + notas2);

        System.out.println("Mostre a primeira nota da nova lista sem remove-la: ");
        System.out.println(notas2.get(0));

        System.out.println("Mostre a primeira nota da nova lista removendo-o");
        System.out.println("primeira nota: " + notas2.get(0));
        notas2.remove(0);
        System.out.println("apos remocao: " + notas2);
















    }
}
