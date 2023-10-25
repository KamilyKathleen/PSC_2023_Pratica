/* 01 - Fazer um algoritmo que receba 2 números e mostre um menu com seis opções
 * (adição, subtração, multiplicação, divisão, resto da divisão / módulo, sair).
 * O programa deve fazer a operação escolhida com os dois números e mostrar novamente
 * o menu enquanto o usuário não escolher sair.*/

package Outubro.Aula_10_10_2023;

/*
 * Projeto desenvolvido na aula de Programação de Soluções Computacionais - Una Sete Lagoas
 *
 * Dia 10/10/2023
 */

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int escolhaUsuario = 0, num1, num2;

        while (escolhaUsuario != 6) {
            System.out.println("\n\nCalculadora");
            System.out.println("Escolha uma das opções abaixo: ");

            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Módulo / Resto da divisão");
            System.out.println("6 - Sair");
            escolhaUsuario = scan.nextInt();

            if (escolhaUsuario == 1) {
                System.out.println("Digite o primeiro número: ");
                num1 = scan.nextInt();
                System.out.println("Digite o segundo número: ");
                num2 = scan.nextInt();
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            } else if (escolhaUsuario ==2) {
                System.out.println("Digite o primeiro número: ");
                num1 = scan.nextInt();
                System.out.println("Digite o segundo número: ");
                num2 = scan.nextInt();
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
            } else if (escolhaUsuario == 3) {
                System.out.println("Digite o primeiro número: ");
                num1 = scan.nextInt();
                System.out.println("Digite o segundo número: ");
                num2 = scan.nextInt();
                System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
            } else if (escolhaUsuario == 4) {
                System.out.println("Digite o primeiro número: ");
                num1 = scan.nextInt();
                System.out.println("Digite o segundo número: ");
                num2 = scan.nextInt();
                System.out.println(num1 + " ÷ " + num2 + " = " + (num1 / num2));
            } else if (escolhaUsuario == 5) {
                System.out.println("Digite o primeiro número: ");
                num1 = scan.nextInt();
                System.out.println("Digite o segundo número: ");
                num2 = scan.nextInt();
                System.out.println(num1 + " módulo de " + num2 + " = " + (num1 % num2));
            } else if (escolhaUsuario == 6) {
                System.out.println("Obrigado por usar essa calculadora!");
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
