package Colecoes.Sets;

import java.util.*;

public class Exercicio2 {
    public static void main(String[] args) {

        Set<LinguagemFavorita> linguagemFavoritaSet = new HashSet<>(){{
           add(new LinguagemFavorita("Java",1991,"IntelliJ"));
           add(new LinguagemFavorita("Python",1995,"PyCharm"));
           add(new LinguagemFavorita("Javascript",1995,"VSCode"));
        }};

        System.out.println("Ordem de inserção");
        Iterator<LinguagemFavorita> favoritaInterator = linguagemFavoritaSet.iterator();
        while(favoritaInterator.hasNext()){
            System.out.println(favoritaInterator.next());
        }

        System.out.println("Ordem Natural(Nome)");
        Set<LinguagemFavorita> linguagemFavoritaPorNome = new TreeSet<>(linguagemFavoritaSet);
        System.out.println(linguagemFavoritaPorNome);

        System.out.println("Ordem por IDE");
        Set<LinguagemFavorita> linguagemFavoritaPorIDE = new TreeSet<>(new ComparatorPorIDE());
        linguagemFavoritaPorIDE.addAll(linguagemFavoritaSet);
        System.out.println(linguagemFavoritaPorIDE);

        System.out.println("Ordem por Ano de Criacao e Nome");
        Set<LinguagemFavorita> linguagemFavoritaPorAnoENome = new TreeSet<>(new ComparatorAnoCriacaoENome());
        linguagemFavoritaPorAnoENome.addAll(linguagemFavoritaSet);
        System.out.println(linguagemFavoritaPorAnoENome);

        System.out.println("Ordem por Nome, ano de Criacao e IDE");
        Set<LinguagemFavorita> linguagemFavoritaPorNomeAnoCriacaoEIDE = new TreeSet<>(new ComparatorNomeAnoCriacaoEIDE());
        linguagemFavoritaPorNomeAnoCriacaoEIDE.addAll(linguagemFavoritaSet);
        System.out.println(linguagemFavoritaPorNomeAnoCriacaoEIDE);
    }
}

//Comparators:
class ComparatorPorIDE implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita ling1, LinguagemFavorita ling2) {
        int ide = ling1.getIde().compareTo(ling2.getIde());
        return ide;
    }
}

class ComparatorAnoCriacaoENome implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita ling1, LinguagemFavorita ling2) {
        int anoCriacao = Integer.compare(ling1.getAnoDeCriacao(), ling2.getAnoDeCriacao());
        if(anoCriacao != 0) return anoCriacao;

        int nome = ling1.getNome().compareTo(ling2.getNome());
        return nome;
    }
}

class ComparatorNomeAnoCriacaoEIDE implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita ling1, LinguagemFavorita ling2) {
        int nome = ling1.getNome().compareTo(ling2.getNome());
        if(nome != 0) return nome;

        int anoCriacao = Integer.compare(ling1.getAnoDeCriacao(), ling2.getAnoDeCriacao());
        if(anoCriacao != 0) return anoCriacao;

        int ide = ling1.getIde().compareTo(ling2.getIde());
        return ide;
    }
}

//=============

class LinguagemFavorita implements Comparable<LinguagemFavorita>{
    String nome;
    int anoDeCriacao;
    String ide;

    public LinguagemFavorita(String nome, int anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    @Override
    public int compareTo(LinguagemFavorita linguagem) {
       return this.nome.compareTo(linguagem.getNome());
    }

    @Override
    public String toString() {
        return "LinguagemFavorita{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", ide='" + ide + '\'' +
                '}';
    }
}
