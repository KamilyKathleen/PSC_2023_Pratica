/* 05 - Modificar o exercício anterior e simular um caixa eletrônico quando
 * vamos sacar ou depositar dinheiro. Ao usuário deve ser dada 2 opções:
 * sacar ou depositar. Se ele escolher sacar, o caixa eletrônico deve
 * verificar se o valor que deseja sacar é menor que o saldo disponível.
 * Se escolher deppositar, devemos apenas somar o valor do depósito ao
 * saldo dele. Assumiremos que há R$ 1000.00 de saldo disponível na conta.
 * Implemente o algoritmo que resolve este problema.
 */

package Setembro.Aula_26_09_2023;

/*
 * Projeto desenvolvido na aula de Programação de Soluções Computacionais - Una Sete Lagoas
 *
 * Dia 26/09/2023
 */

import java.util.Scanner;

public class Exercicio05 {
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
        }
        else if (escolhaUsuario.trim().equalsIgnoreCase("depositar")) {
            System.out.println("Saldo disponível: R$ " + saldoDisponivel);
            System.out.print("Digite o valor que deseja depositar: R$ ");
            valorDeposito = scan.nextDouble();
            saldoDisponivel += valorDeposito;
            System.out.println("Novo saldo: R$ " + saldoDisponivel);
        }
    }
}
