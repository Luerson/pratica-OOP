package OO3_Mercado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Loja minhaLoja = new Loja();
        int operacao = -1;

        try {
            while (operacao != 0) {
                System.out.println("Escolha a operação que deseja realizar:");
                System.out.println("1 - para adicionar produto");
                System.out.println("2 - para mostrar as informações da lista");
                System.out.print("0 - para encerrar o programa\n-->");

                operacao = Integer.parseInt(input.nextLine());

                switch (operacao) {
                    case 0:
                        break;
                    case 1:
                        AdicionaProduto(minhaLoja, input);
                        break;
                    case 2:
                        minhaLoja.listarProdutos();
                        break;
                    default:
                        System.out.println("Valor digitado é inválido");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Valor digitado é inválido " + e);
        }
    }

    public static void AdicionaProduto(Loja loja, Scanner input) {
        int tipo;

        System.out.println("Qual o tipo de produto que você deseja adicionar?");
        System.out.println("1 - para computador");
        System.out.println("2 - para Monitor");

        tipo = Integer.parseInt(input.nextLine());

        if (tipo == 1) {
            Computador novoComputador = new Computador();

            System.out.println("Por favor, informe o nome do produto: ");
            novoComputador.setNome(input.nextLine());

            System.out.println("Por favor, informe o preço do produto: ");
            novoComputador.setPreco(Integer.parseInt(input.nextLine()));

            System.out.println("Por favor, informe uma descrição para o produto: ");
            novoComputador.setDescricao(input.nextLine());

            System.out.println("Por favor, informe a memória em GB: ");
            novoComputador.setMemoriaEmGB(Integer.parseInt(input.nextLine()));

            System.out.println("Por favor, informe o armazenamento total em GB: ");
            novoComputador.setArmazenamentoEmGB(Integer.parseInt(input.nextLine()));

            loja.adicionarProduto(novoComputador);

        } else if (tipo == 2) {
            Monitor novoMonitor = new Monitor();

            System.out.println("Por favor, informe o nome do produto: ");
            novoMonitor.setNome(input.nextLine());

            System.out.println("Por favor, informe o preço do produto: ");
            novoMonitor.setPreco(Integer.parseInt(input.nextLine()));

            System.out.println("Por favor, informe uma descrição para o produto: ");
            novoMonitor.setDescricao(input.nextLine());

            System.out.println("Por favor, informe a resolução no formato XXXXxYYY: ");
            novoMonitor.setResolucao(input.nextLine());

            System.out.println("Por favor, informe o tamanho em polegadas: ");
            novoMonitor.setTamanhoEmPolegadas(Integer.parseInt(input.nextLine()));

            loja.adicionarProduto(novoMonitor);
        }
    }
}
