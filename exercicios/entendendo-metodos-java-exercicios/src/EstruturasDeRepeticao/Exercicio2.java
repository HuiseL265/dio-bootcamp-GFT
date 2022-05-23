package EstruturasDeRepeticao;
// 2. Faça um programa que leia um nome de usuário e a sua senha
// e não aceite a senha igual ao nome do usuário, mostrando
// uma mensagem de erro e voltando a pedir as informações.

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean validacao = true;
        String usuario;
        String senha;

        System.out.println("Informe o nome de usuario: ");
        usuario = scan.next();

        do{
            System.out.println("Informe uma senha: ");
            senha = scan.next();

            //se a senha conter o nome do usuario...
            if(senha.toLowerCase().contains(usuario.toLowerCase())){
                System.out.println("Nao pode haver o nome de usuario na sua senha, tente novamente.");
            }else{
                System.out.println("Usuario e senha cadastrados! Obrigado!");
                validacao = false;
            }

        }while(validacao);

    }
}
