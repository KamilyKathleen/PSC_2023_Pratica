// 01 - Crie um algoritmo que imprima todos os números inteiros de 0 a 50.

package Outubro.Aula_03_10_2023;

/*
 * Projeto desenvolvido na aula de Programação de Soluções Computacionais - Una Sete Lagoas
 *
 * Dia 03/10/2023
 */

public class Exercicio01 {
    public static void main(String[] args) {
        int i;

        // for (inicialização, condição, incremento)
        for (i = 0; i <= 50; i++) {
            System.out.println(i);
        }

        i = 0;
        System.out.println();
        while (i <= 50) {
            System.out.println(i);
            i++;
        }

        i = 0;
        System.out.println();
        do {
            System.out.println(i);
            i++;
        } while (i <= 50);
    }
}
