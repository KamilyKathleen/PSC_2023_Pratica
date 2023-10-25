/* 02 - Escreva um algoritmo que leia um número e informe se ele é divisível
 * por 10, por 5, por 2 ou se não é divisível por nenhum deles.
 */

package Setembro.Aula_19_09_2023;

/*
 * Projeto desenvolvido na aula de Programação de Soluções Computacionais - Una Sete Lagoas
 *
 * Dia 19/09/2023
 */

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;

        System.out.println("Digite um número: ");
        num = scan.nextInt();

        if (num % 10 == 0) {
            System.out.println("O número " + num + " é divisível por 10.");
        } else if (num % 5 == 0) {
            System.out.println("O número " + num + " é divisível por 5.");
        } else if (num % 2 == 0) {
            System.out.println("O número " + num + " é divisível por 2.");
        } else {
            System.out.println("O número " + num + " não é divisível por 10, por 5 ou por 2.");
        }

/*
        if (num % 10 == 0) {
            System.out.println("O número " + num + " é divisível por 10.");
        } if (num % 5 == 0) {
            System.out.println("O número " + num + " é divisível por 5.");
        } if (num % 2 == 0) {
            System.out.println("O número " + num + " é divisível por 2.");
        } else {
            System.out.println("O número " + num + " não é divisível por 10, por 5 ou por 2.");
        }
*/

/*
        if (num % 10 == 0 && num % 5 == 0 && num % 2 == 0) {
            System.out.println("O número " + num + " é divisível por 10, por 5 e por 2.");
        } else if (num % 5 == 0) {
            System.out.println("O número " + num + " é divisível por 5.");
        } else if (num % 2 == 0) {
            System.out.println("O número " + num + " é divisível por 2.");
        } else {
            System.out.println("O número " + num + " não é divisível por 10, por 5 ou por 2.");
        }
*/
    }
}
