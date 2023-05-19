package Pagamentos.main;

import Pagamentos.classes.BoletoBancario;
import Pagamentos.classes.CartaoDeCredito;
import Pagamentos.classes.TransferenciaBancaria;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Compra {
    public static void main(String[] args) {
        CartaoDeCredito meuCartao = new CartaoDeCredito();
        TransferenciaBancaria transferir = new TransferenciaBancaria();
        BoletoBancario boleto = new BoletoBancario();
        Scanner sc = new Scanner(System.in);
        int opcao;
        float valor;

        System.out.print("Escolha uma das opções para efetivar a sua compra:\n1 - cartão de crédito\n2 - transferência barcária\n3 - boleto bancário\n-->");

        try {
            opcao = Integer.parseInt(sc.nextLine());

            System.out.println("Qual o valor da operação? (digite o valor correspondente em reais com ponto na casa decimal)");
            valor = Float.parseFloat(sc.nextLine());

            switch (opcao) {
                case 1:
                    meuCartao.realizarPagamento();

                    System.out.print("Deseja receber o recibo?\n1 - sim\n0 - não\n-->");
                    opcao = Integer.parseInt(sc.nextLine());

                    if (opcao == 1) {
                        meuCartao.gerarRecibo(valor);
                    }

                    break;
                case 2:
                    transferir.realizarPagamento();

                    System.out.print("Deseja receber o recibo?\n1 - sim\n0 - não\n-->");
                    opcao = Integer.parseInt(sc.nextLine());

                    if (opcao == 1) {
                        transferir.gerarRecibo(valor);
                    }

                    break;
                case 3:
                    boleto.realizarPagamento();

                    System.out.print("Deseja receber o recibo?\n1 - sim\n0 - não\n-->");
                    opcao = Integer.parseInt(sc.nextLine());

                    if (opcao == 1) {
                        boleto.gerarRecibo(valor);
                    }

                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Valor digitado é inválido! Erro: " + e);
        } catch (NumberFormatException e) {
            System.out.println("Por favor, digite o valor da forma solicitada! Erro: " + e);
        }

        sc.close();
    }
}
