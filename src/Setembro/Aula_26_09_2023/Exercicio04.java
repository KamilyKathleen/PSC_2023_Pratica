/* Continuação da aula 19-09-2023.
 * 04 - Simular um caixa eletrônico quando vamos sacar o dinheiro. O caixa eletrônico
 * deve verificar se o valor que desejamos sacar é menor que o saldo disponível.
 * Assumiremos que há R$1000.00 de saldo disponível para o saque. Implemente o
 * algoritmo que resolve esse problema.*/

package Setembro.Aula_26_09_2023;

/*
 * Projeto desenvolvido na aula de Programação de Soluções Computacionais - Una Sete Lagoas
 *
 * Dia 26/09/2023
 */

import java.util.Scanner;
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double saldoDisponivel, valorSaque;
        saldoDisponivel = 1000.00;

        System.out.println("         Caixa Eletrônico         ");
        System.out.println("----------------------------------");
        System.out.println("Saldo disponível: R$ " + saldoDisponivel);
        System.out.print("Digite o valor que deseja sacar: R$ ");
        valorSaque = scan.nextDouble();

        if (valorSaque < saldoDisponivel) {
            System.out.println("Saque efetuado com sucesso!");
            saldoDisponivel -= valorSaque;
            System.out.println("Novo saldo: R$ " + saldoDisponivel);
        } else {
            System.out.println("Saldo insuficiente para saque. Tente novamente!");
        }
    }
}
