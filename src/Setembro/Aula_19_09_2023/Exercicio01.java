/* 01 - Escreva um algoritmo para determinar se um número A é divisível por um outro número B.
 * Esses valores devem ser fornecidos pelo usuário.
 */

package Setembro.Aula_19_09_2023;

/*
 * Projeto desenvolvido na aula de Programação de Soluções Computacionais - Una Sete Lagoas
 *
 * Dia 19/09/2023
 */

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2;

        System.out.println("Digite um número: ");
        num1 = scan.nextInt();

        System.out.println("Digite outro número: ");
        num2 = scan.nextInt();

        if (num1 % num2 == 0) {
            System.out.println("O número " + num1 + " é divisível por " + num2 + ".");
        } else {
            System.out.println("O número " + num1 + " não é divisível por " + num2 + ".");
        }
    }
}
