/* 03 - Escreva um algoritmo que leia um número e informe se ele é divisível por
 * 3 e por 7 (ou seja, não basta ele ser divisível só por 3 ou só por 7, tem
 * que ser divisível pelos dois ao mesmo tempo).
 */
package Setembro.Aula_19_09_2023;

/*
 * Projeto desenvolvido na aula de Programação de Soluções Computacionais - Una Sete Lagoas
 *
 * Dia 19/09/2023
 */

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;

        System.out.println("Digite um número: ");
        num = scan.nextInt();

        if (num % 3 == 0 && num % 7 == 0) {
            System.out.println("O número " + num + " é divisível por 3 e por 7.");
        } else {
            System.out.println("O número " + num + " não é divisível por 3 e por 7.");
        }
    }
}
