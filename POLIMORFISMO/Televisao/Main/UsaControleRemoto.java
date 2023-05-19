package Televisao.Main;

import Televisao.Classes.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UsaControleRemoto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ControleRemoto controleRemoto = new ControleRemoto();
        int resposta;

        System.out.println("Você acabou de ligar sua TV! Ela sempre liga na Globo (17) e no volume 20.");

        try {
            do{
                System.out.print("Digite 1 para mudar o canal\nDigite 2 para mudar o volume\nDigite 3 para consultar os valores de canal e volume\nDigite 0 para desligar a TV\n--> ");
                resposta = sc.nextInt();

                switch (resposta) {
                    case 1:
                        System.out.print("Há 3 opções para mudar o canal.\nDigite 1 para aumentar o número do canal em uma unidade\nDigite 2 para diminuir o número do canal em uma unidade\nDigite 3 para indicar o número do canal desejado\n--> ");
                        int resposta2 = sc.nextInt();
                        switch (resposta2) {
                            case 1:
                                controleRemoto.aumentarCanal();
                                break;
                            case 2:
                                controleRemoto.diminuirCanal();
                                break;
                            case 3:
                                System.out.print("Digite o número do canal desejado\n--> ");
                                controleRemoto.mudarCanal(sc.nextInt());
                                break;
                            default:
                                System.out.println("Você selecionou uma opção inválida.");
                        }
                        break;
                    case 2:
                        System.out.print("Há 2 opções para mudar o volume.\nDigite 1 para aumentar o volume em uma unidade\nDigite 2 para diminuir o volume em uma unidade\n--> ");
                        int resposta3 = sc.nextInt();
                        switch (resposta3) {
                            case 1:
                                controleRemoto.aumentarVolume();
                                break;
                            case 2:
                                controleRemoto.diminuirVolume();
                                break;
                            default:
                                System.out.println("Você selecionou uma opção inválida.");
                        }
                        break;
                    case 3:
                        controleRemoto.mostraInfo();
                        break;
                    case 0:
                        System.out.println("Desligando...");
                        break;
                    default:
                        System.out.println("Você selecionou uma opção inválida. Tente novamente.");
                        break;
                }
            } while (resposta!=0);
        } catch (InputMismatchException e) {
            System.out.println("Valor digitado é inválido! Erro: " + e);
        }

        sc.close();
    }
}
