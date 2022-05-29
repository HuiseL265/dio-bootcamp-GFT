package Colecoes.Sets;

import java.util.*;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {

        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("Breaking Bad","Drama",60));
            add(new Serie("How I Met Your Mother", "Comedia",25));
            add(new Serie("The Witcher","Aventura",50));
        }};

        for(Serie serie : minhasSeries){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("Ordem insercao: ");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("Breaking Bad","Drama",60));
            add(new Serie("How I Met Your Mother", "Comedia",25));
            add(new Serie("The Witcher","Aventura",50));
        }};

        for(Serie serie : minhasSeries1){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("\nOrdem natural por TempoEpisodio");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);

        for(Serie serie : minhasSeries2){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("\nOrdem Nome/Genero/TempoEpisodio");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries2);

        for(Serie serie : minhasSeries3){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

    }
}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie>{

    @Override
    public int compare(Serie serie1, Serie serie2) {
        int nome = serie1.getNome().compareTo(serie2.getNome());
        if (nome != 0) return nome;

        int genero = serie1.getGenero().compareTo(serie2.getGenero());
        if (genero != 0) return genero;

        return Integer.compare(serie1.getTempoEpisodio(),serie2.getTempoEpisodio());
    }

}

class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero) && Objects.equals(tempoEpisodio, serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }


    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio =  Integer.compare(this.getTempoEpisodio(),serie.getTempoEpisodio());
        if(tempoEpisodio != 0 ) return tempoEpisodio;
        int genero = this.getGenero().compareTo(serie.getGenero());
        return genero;
    }
}
