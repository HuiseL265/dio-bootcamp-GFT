package MetodosJava.Exercicio1;

public class Emprestimo {

    public static String calcular(double valor,int mesesParaPagar){
        double taxaJurosAM = 0.10;
        double valorMensal = (valor / mesesParaPagar)+(valor / mesesParaPagar * taxaJurosAM);
        double valorFinal = valorMensal * mesesParaPagar;

        return "----------------------------------------\n" +
                "O valor final do emprestimo sera de: " + valorFinal +
                "\n\nQuantidade de parcelas: " + mesesParaPagar +
                "\nValor mensal das parcelas: " + valorMensal +
                "\n----------------------------------------";
    }

}
