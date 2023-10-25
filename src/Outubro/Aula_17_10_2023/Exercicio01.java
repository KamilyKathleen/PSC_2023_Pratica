/* 01 - Faça um programa que apresente o menu de opções a seguir. Ele deve permitir ao usuário
escolher a opção desejada, receber os dados necessários para executar a operação e mostrar o
resultado. É preciso, também, verificar a possibilidade de que o usuário tenha digitado uma opção
inválida. Nesse caso, ele deve indicar isso com uma mensagem e mostrar o menu novamente. O
programa precisa sempre voltar ao menu inicial até que o usuário escolha a opção 4.

Menu de opções:
1. Novo salário
2. Férias
3. Décimo terceiro
4. Sair

Digite a opção desejada :

Caso o usuário escolha a Opção 1: o programa deve pedir o salário de um funcionário, calcular e mostrar o
novo salário usando as regras a seguir.

Salários Porcentagem de aumento:
Até R$ 3500,00 15%
De R$ 3500,00 a R$ 6000,00 10%
Acima de R$ 6000,00 5%

Caso o usuário escolha a Opção 2: o programa deve pedir o salário de um funcionário, calcular e mostrar o
valor de suas férias. Sabe-se que as férias equivalem ao seu salário acrescido de l/3.

Caso o usuário escolha a Opção 3: o programa deve pedir o salário de um funcionário e o número de meses
que ele trabalha na empresa (no máximo 12), calcular e mostrar o valor do décimo terceiro. Sabe-se que o
décimo terceiro equivale ao seu salário multiplicado pelo número de meses de trabalho dividido por 12 (ou
seja, "salario*mesesTrabalhados/12").

Caso o usuário escolha a Opção 4: finalizar e sair do programa.
*/

package Outubro.Aula_17_10_2023;

/*
 * Projeto desenvolvido na aula de Programação de Soluções Computacionais - Una Sete Lagoas
 *
 * Dia 10/10/2023
 */

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double salario, salarioNovo, ferias, decimoTerceiro;
        int opcaoMenu = 0, mesesTrabalhados;

        while (opcaoMenu != 4) {
            System.out.println("\n\nMenu de opções: ");
            System.out.println("1 - Novo salário: ");
            System.out.println("2 - Férias: ");
            System.out.println("3 - Décimo terceiro: ");
            System.out.println("4 - Sair");
            System.out.println("\nDigite a opção desejada: ");
            opcaoMenu = scan.nextInt();

            if (opcaoMenu == 1) {
                System.out.println("Digite o seu salário atual: ");
                salario = scan.nextDouble();
                if (salario <= 0) {
                    System.out.println("Valor inválido! Tente novamente.");
                } else if (salario < 3500.00) {
                    salarioNovo = salario + (0.15 * salario);
                    System.out.println("Seu novo salário, com acréscimo de 15%, será de R$ " + salarioNovo);
                } else if (salario <=6000.00) {
                    salarioNovo = salario + (0.10 * salario);
                    System.out.println("Seu novo salário, com acréscimo de 10%, será de R$ " + salarioNovo);
                } else {
                    salarioNovo = salario + (0.05 * salario);

                    System.out.println("Seu novo salário, com acréscimo de 5%, será de R$ " + salarioNovo);
                }
            } else if (opcaoMenu == 2) {
                System.out.println("Digite o seu salário atual: ");
                salario = scan.nextDouble();
                ferias = salario + (salario / 3);
                System.out.println("Suas férias equivalem a R$ " + ferias);
            } else if (opcaoMenu == 3) {
                System.out.println("Digite o seu salário atual: ");
                salario = scan.nextDouble();
                System.out.println("Digite o número de meses que você trabalhou na empresa neste ano: ");
                mesesTrabalhados = scan.nextInt();

                decimoTerceiro = (salario * mesesTrabalhados) / 12;
                System.out.println("O seu décimo terceiro equivale a R$ " + decimoTerceiro);
            } else if (opcaoMenu == 4) {
                System.out.println("Obrigado por utilizar este sistema.");
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
