/* 02 - Modifique o exercício da aula anterior:
* Trocar a opção 4 para "Calcular INSS" e se basear na tabela abaixo para
descobrir quanto o funcionário paga por mês do imposto. Em seguida, pedir
ao usuário pra informar quantos meses completos ele trabalhou no ano e
calcular quanto de INSS ele pagará neste ano. Também é necessário mostrar
quanto ele teve de salário líquido neste mesmo ano (isto é, o total de salários
recebidos menos o total do INSS do ano).*/

package Outubro.Aula_24_10_2023;

/*
 * Projeto desenvolvido na aula de Programação de Soluções Computacionais - Una Sete Lagoas
 *
 * Dia 10/10/2023
 */

import java.util.Scanner;

public class Exercicio02 {

    public static void Inss() {
        Scanner scan = new Scanner(System.in);
        double inssMensal, inssAnual,salario,salarioLiquido;
        int mesesTrabalhados;
        System.out.println("Digite o número de meses completos que você trabalhou neste ano: ");
        mesesTrabalhados = scan.nextInt();
        inssAnual = inssMensal * mesesTrabalhados;
        salarioLiquido = salario - inssMensal;

        System.out.println("Você paga R$ " + inssMensal + " de INSS por mês.");
        System.out.println("Você paga R$ " + inssAnual + " de INSS por ano.");
        System.out.println("Salário líquido mensal: R$ " + salarioLiquido);
        System.out.println("Salário líquido anual: R$ " + (salarioLiquido * mesesTrabalhados));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double salario, salarioNovo, ferias, decimoTerceiro, inssMensal, inssAnual, salarioLiquido;
        int opcaoMenu = 0, mesesTrabalhados;

        while (opcaoMenu != 5) {
            System.out.println("\n\nMenu de opções: ");
            System.out.println("1 - Novo salário: ");
            System.out.println("2 - Férias: ");
            System.out.println("3 - Décimo terceiro: ");
            System.out.println("4 - Calcular INSS");
            System.out.println("5 - Sair");
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
                System.out.println("Digite o seu salário atual: ");
                salario = scan.nextDouble();

                if (salario <= 0) {
                    System.out.println("Valor inválido! Tente novamente.");
                } else if (salario <= 1320.00) {
                    inssMensal = salario * 0.075;
                    System.out.println("Digite o número de meses completos que você trabalhou neste ano: ");
                    mesesTrabalhados = scan.nextInt();
                    inssAnual = inssMensal * mesesTrabalhados;
                    salarioLiquido = salario - inssMensal;

                    System.out.println("Você paga R$ " + inssMensal + " de INSS por mês.");
                    System.out.println("Você paga R$ " + inssAnual + " de INSS por ano.");
                    System.out.println("Salário líquido mensal: R$ " + salarioLiquido);
                    System.out.println("Salário líquido anual: R$ " + (salarioLiquido * mesesTrabalhados));
                } else if (salario >= 1320.01 && salario <= 2571.29) {
                    inssMensal = salario * 0.09;
                    System.out.println("Digite o número de meses completos que você trabalhou neste ano: ");
                    mesesTrabalhados = scan.nextInt();
                    inssAnual = inssMensal * mesesTrabalhados;
                    salarioLiquido = salario - inssMensal;

                    System.out.println("Você paga R$ " + inssMensal + " de INSS por mês.");
                    System.out.println("Você paga R$ " + inssAnual + " de INSS por ano.");
                    System.out.println("Salário líquido mensal: R$ " + salarioLiquido);
                    System.out.println("Salário líquido anual: R$ " + (salarioLiquido * mesesTrabalhados));
                } else if (salario >= 2571.30 && salario <= 3856.94) {
                    inssMensal = salario * 0.12;
                    System.out.println("Digite o número de meses completos que você trabalhou neste ano: ");
                    mesesTrabalhados = scan.nextInt();
                    inssAnual = inssMensal * mesesTrabalhados;
                    salarioLiquido = salario - inssMensal;

                    System.out.println("Você paga R$ " + inssMensal + " de INSS por mês.");
                    System.out.println("Você paga R$ " + inssAnual + " de INSS por ano.");
                    System.out.println("Salário líquido mensal: R$ " + salarioLiquido);
                    System.out.println("Salário líquido anual: R$ " + (salarioLiquido * mesesTrabalhados));
                } else if (salario >= 3856.95 && salario <= 7507.49) {
                    inssMensal = salario * 0.14;
                    System.out.println("Digite o número de meses completos que você trabalhou neste ano: ");
                    mesesTrabalhados = scan.nextInt();
                    inssAnual = inssMensal * mesesTrabalhados;
                    salarioLiquido = salario - inssMensal;

                    System.out.println("Você paga R$ " + inssMensal + " de INSS por mês.");
                    System.out.println("Você paga R$ " + inssAnual + " de INSS por ano.");
                    System.out.println("Salário líquido mensal: R$ " + salarioLiquido);
                    System.out.println("Salário líquido anual: R$ " + (salarioLiquido * mesesTrabalhados));
                } else {
                    inssMensal = 876.95;
                    Inss();
                }

            } else if (opcaoMenu == 5) {
                System.out.println("Obrigado por utilizar este sistema.");
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
