package Colecoes.Sets;

import java.nio.charset.CoderResult;
import java.util.*;

public class Exercicio1 {
    public static void main(String[] args) {

        Set<String> cores = new  HashSet<>() {{
            add("Vermelho");
            add("Laranja");
            add("Amarelo");
            add("Verde");
            add("Azul");
            add("Anil");
            add("Violeta");
        }};

        System.out.println("A. Exiba todas as cores uma abaixo da outra");
        Iterator<String> iteratorCores = cores.iterator();

        while(iteratorCores.hasNext()){
            System.out.println("--" + iteratorCores.next());
        }

        System.out.println("B. A quantidade de cores que o arco-iris tem");
        System.out.println("Qtd. de cores: " + cores.size());

        Set<String> cores2 = new TreeSet<>(cores);

        System.out.println("C. Exiba as cores em ordem alfabetica");
        System.out.println(cores2);

        Set<String> coresInvertidas = new TreeSet<>(Collections.reverseOrder());
        coresInvertidas.addAll(cores);
        System.out.println("D. Exiba as cores na ordem inversa informada");
        System.out.println(coresInvertidas);

        System.out.println("E. Exiba todas as cores que começar com a letra 'v'");
        for (String cor : cores) {
            if(cor.toLowerCase().startsWith("v")) System.out.println(cor);
        }

        System.out.println("F. Remova todas as cores que nao comecam com a letra 'v'");
        for (String cor : cores) {
            if(!cor.toLowerCase().startsWith("v")){
               //cores.remove(cor);
            }
        }

        System.out.println("G. Limpe o conjunto");
        cores.removeAll(cores);
        System.out.println(cores);

        System.out.println("F. Confira se o conjunto está vazio");
        System.out.println("Vazio? "+ cores.isEmpty());

    }
}

