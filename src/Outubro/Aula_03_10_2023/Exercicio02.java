/* 02 - Modificar o exercício da aula 26/09/2023 para continuar ou finalizar
 * o processo com um laço de repetição.
 */

package Outubro.Aula_03_10_2023;

/*
 * Projeto desenvolvido na aula de Programação de Soluções Computacionais - Una Sete Lagoas
 *
 * Dia 03/10/2023
 */

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        double saldoDisponivel, valorSaque, valorDeposito;
        String escolhaUsuario;
        saldoDisponivel = 1000.00;

        System.out.println("         Caixa Eletrônico         ");
        System.out.println("----------------------------------");
        System.out.println("Você deseja sacar ou depositar?");
        escolhaUsuario = scan.nextLine();

        if (escolhaUsuario.trim().equalsIgnoreCase("sacar")) {
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
        } else if (escolhaUsuario.trim().equalsIgnoreCase("depositar")) {
            System.out.println("Saldo disponível: R$ " + saldoDisponivel);
            System.out.print("Digite o valor que deseja depositar: R$ ");
            valorDeposito = scan.nextDouble();
            if (valorDeposito > 0) {
                saldoDisponivel += valorDeposito;
                System.out.println("Novo saldo: R$ " + saldoDisponivel);
            } else {
                System.out.println("Valor inválido! Tente novamente.");
            }
        } else {
            System.out.println("Opção inválida! Tente novamente.");
        }
    }
}
