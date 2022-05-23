package EstruturasDeRepeticao;

// 1. Faça um programa que peça uma nota, entre zero e dez.
// Mostre uma mensagem caso o valor seja inválido e continue pedindo
// até que o usuário informe um valor válido.

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numero;

        boolean invalido = true;

        do{
            System.out.println("Informe um valor entre 0 e 10");
            numero = scan.nextInt();

            if(numero < 0 || numero > 10){
                System.out.println("Valor inválido.");
            }else{
                System.out.println("Valor valido, muito obrigado!");
                invalido = false;
            }
        }while(invalido);
    }
}
