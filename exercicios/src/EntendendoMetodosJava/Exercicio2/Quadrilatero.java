package EntendendoMetodosJava.Exercicio2;

public class Quadrilatero {

    public static void area(double x){
        System.out.println("A area do quadrado e :" + x*x);
    }

    public static void area(double largura, double altura){
        System.out.println("A area do retangulo e :" + (largura * altura));
    }

    public static void area(double baseMaior, double baseMenor,double altura){
        System.out.println("A area do retangulo e :" + ((baseMaior+baseMenor)*altura)/2);
    }

}
