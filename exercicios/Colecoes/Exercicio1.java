package Colecoes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Exercicio1 {
    public static void main(String[] args) {

        float media = 0;
        List<Meses> meses = new ArrayList<>(){{
            add(new Meses("Janeiro",23f));
            add(new Meses("Fevereiro",31f));
            add(new Meses("Março",17f));
            add(new Meses("Abril",14f));
            add(new Meses("Maio",12f));
            add(new Meses("Junho",25f));
        }};

        for (Meses mes: meses) {
            media += mes.getTemperatura();
        }

        media = media / meses.size();

        System.out.println("Media Semestral: " + media + "\n" +
                           "Meses com temperatura acima da media: ");
        for (Meses mes: meses) {
            if(mes.getTemperatura() > media) System.out.println(mes.toString());
        }
    }
}


class Meses{
    private String nome;
    private Float temperatura;

    public Meses(String nome, Float temperatura) {
        this.nome = nome;
        this.temperatura = temperatura;
    }

    public String getNome() {
        return nome;
    }

    public Float getTemperatura() {
        return temperatura;
    }

    @Override
    public String toString() {
        return "--" +
                "Mes='" + nome + '\'' +
                ", Temperatura=" + temperatura +
                "--";
    }
}
