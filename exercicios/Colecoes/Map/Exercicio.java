package Colecoes.Map;

import java.util.*;

public class Exercicio {
    public static void main(String[] args) {
        Map<String,Integer> popEstados = new LinkedHashMap<>(){{
           put("PE",9616621);
           put("AL",3351543);
           put("CE",9187103);
           put("RN",3534265);
        }};

        System.out.println("substituir valor de RN: ");
        System.out.println(popEstados);
        popEstados.put("RN",3534165);
        System.out.println(popEstados);

        System.out.println("\nConferir se o estado PB esta no dicionario, caso nao, adicione: ");
        if(!popEstados.containsKey("PB")){
            popEstados.put("PB",4039277);
        }
        System.out.println(popEstados);

        System.out.println("\nExibir os estados na ordem que foram informados: ");
        System.out.println(popEstados);

        System.out.println("\nExibir os estados na ordem alfabetica: ");
        Map<String,Integer> popEstados2 = new TreeMap<>(popEstados);
        for(Map.Entry<String,Integer> estado : popEstados2.entrySet()){
            System.out.println(estado.getKey());
        }

        Integer menorPopulacao = Collections.min(popEstados2.values());
        Integer maiorPopulacao = Collections.max(popEstados2.values());

        for(Map.Entry<String,Integer> estado : popEstados2.entrySet()){
            if(estado.getValue().equals(menorPopulacao)) System.out.println("Menor populacao: " + estado.getKey());
        }

        for(Map.Entry<String,Integer> estado : popEstados2.entrySet()){
            if(estado.getValue().equals(maiorPopulacao)) System.out.println("Maior populacao: " + estado.getKey());
        }

        Iterator<Integer> qtdPopulacao = popEstados.values().iterator();

        int soma = 0;
        while(qtdPopulacao.hasNext()){
            soma += qtdPopulacao.next();
        }

        System.out.println("\nA soma da populacao dos estados: " + soma);
        System.out.println("\nA media da populacao dos estados: " + soma/popEstados.size());


        Map<String,Integer> popEstados3 = new HashMap<>();

        popEstados3.putAll(popEstados);

        System.out.println("\nRemova os estados com a populacao menor que 4.000.000");
        for(Map.Entry<String,Integer> estado : popEstados3.entrySet()){
            System.out.println(estado.getKey() + ": " + estado.getValue());
        }

        for(Map.Entry<String,Integer> estado : popEstados3.entrySet()){
            if(estado.getValue() < 4000000){
                popEstados3.remove(estado);
            }
        }

        System.out.println("\nApos remocao: ");
        for(Map.Entry<String,Integer> estado : popEstados3.entrySet()){
            System.out.println(estado.getKey() + ": " + estado.getValue());
        }

        System.out.println("\nApague todos os dados do dicionario: ");
        popEstados3.clear();

        System.out.println("\nVerifique se esta vazio: " + popEstados3.isEmpty());





    }
}
