package EntendendoMetodosJava.Exercicio1;

import java.util.Scanner;

import static java.time.LocalTime.now;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Exercício: A partir da hora do dia informar uma mensagem adequada, 'bom dia', 'boa tarde'...
        int horaAtual = Tempo.horaAtual();

        if(horaAtual >= 12 & horaAtual <= 17 ){
            System.out.println("Boa tarde! Bem-vindo ao programa");
        } else if (horaAtual >= 18 || horaAtual <= 5) {
            System.out.println("Boa noite! Bem-vindo ao programa");
        }else{
            System.out.println("Bom dia! Bem-vindo ao programa");
        }
        //---------------------


        //##Exercicio: CALCULE AS 4 OPERAÇÕES BÁSICAS. SEMPRE 2 VALORES DEVEM SER PASSADOS.
        //##(Alteração pessoal: a pessoa decide qual operação decide realizar

        System.out.println("Digite o numero da operacao matematica para realizar o teste.\n" +
                            "1. somar | 2. subtrair | 3. dividir | 4. multiplicar");
        int numOperacao = scan.nextInt();

        //receber os números da operação
        System.out.println("Digite o primeiro numero: ");
        float n1 = scan.nextFloat();
        System.out.println("Digite o segundo numero: ");
        float n2 = scan.nextFloat();

        //verificar a operação a ser utilizada
        if(numOperacao == 1) {
            System.out.println("O valor final da operacao foi: " + Operacoes.somar(n1,n2));
        }else if(numOperacao == 2) {
            System.out.println("O valor final da operacao foi: " + Operacoes.subtrair(n1,n2));
        }else if(numOperacao == 3) {
            System.out.println("O valor final da operacao foi: " + Operacoes.dividir(n1,n2));
        }else if(numOperacao == 4) {
            System.out.println("O valor final da operacao foi: " + Operacoes.multiplicar(n1,n2));
        }
        //---------------------

        //##Calcule o valor final de empréstimo, onde as parcelas e a taxa de juros influnciam no valor final
        System.out.println("Vamos simular um emprestimo, por favor digite o valor a ser emprestado para a simulacao:");
        double valorEmprestimo = scan.nextDouble();
        System.out.println("Em quantas parcelas (em meses) pretende pagar?");
        int mesesAPagar = scan.nextInt();

        System.out.println(Emprestimo.calcular(valorEmprestimo,mesesAPagar));

    }

    //Métodos utilizados no exercício

    //método empréstimo



}
