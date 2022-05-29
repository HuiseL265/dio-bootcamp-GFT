package Colecoes.Sets;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {

        Set<Double> notas = new HashSet<>(Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6));
        System.out.println(notas.toString()); // forma padrão é aleatoria

        System.out.println("conferir se tem a nota 5: " + notas.contains(5d));

        System.out.println("menor nota: " + Collections.min(notas));
        System.out.println("maior nota: " + Collections.max(notas));


        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("soma dos valores: " + soma);
        System.out.println("media das notas: " + (soma/notas.size()));

        System.out.println("remova a nota 0 ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 6) iterator1.remove();
        }
        System.out.println(notas);

        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("exiba as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);
        notas.clear();

        System.out.println("notas esta vazio? ");
        System.out.println(notas.isEmpty());
        System.out.println("notas2 esta vazio? ");
        System.out.println(notas2.isEmpty());
        System.out.println("notas3 esta vazio? ");
        System.out.println(notas3.isEmpty());


    }
}
