package OO3_Produto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ControleProduto controle = new ControleProduto();
        Produto produto = new Produto();
        int operacao = 1;
        String lixo;

        try {
            while (operacao != 0) {
                System.out.println("\nEscolha uma operação:");
                System.out.println("1 - Cadastrar produto");
                System.out.println("2 - Vender produto");
                System.out.print("0 - para fechar o programa\n-->");

                operacao = input.nextInt();
                lixo = input.nextLine();

                switch (operacao) {
                    case 1: {
                        String nome;
                        int quantidade;
                        float preco;

                        System.out.print("\nInforme o nome do produto\n-->");
                        nome = input.nextLine();

                        System.out.print("Informe a quantidade do produto\n-->");
                        quantidade = input.nextInt();

                        System.out.print("Informe o preço do produto (use vírgula para casa decimal)\n-->");
                        preco = input.nextFloat();
                        lixo = input.nextLine();

                        controle.cadastraProduto(nome, quantidade, preco);
                        break;
                    }

                    case 2: {
                        String nome;
                        int quantidade;

                        System.out.print("\nInforme o nome do produto que deseja vender\n-->");
                        nome = input.nextLine();
                        ;

                        System.out.print("Informe a quantidade que deseja vender\n-->");
                        quantidade = input.nextInt();

                        controle.efetuaVenda(nome, quantidade);
                        break;
                    }

                    case 0: break;
                    default: System.out.println("Opção indisponível!\n");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Por favor, digite um valor válido para prosseguir!\n");
        }
    }
}
