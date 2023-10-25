package Setembro.Aula_12_09_2023;

/*
 * Projeto desenvolvido na aula de Programação de Soluções Computacionais - Una Sete Lagoas
 *
 * Dia 12/09/2023
 */

import java.util.Scanner;

public class meuSegundoAlgoritmo {
    public static void main(String[] args) {
        String nome;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        nome = scan.nextLine();
        System.out.println("Bem vindo, " + nome);
    }
}
