package Agenda;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UsaAgenda {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner sc = new Scanner(System.in);
        int operacao;

        try {
            do {
                System.out.print("Por favor, escolha uma das seguintes operações\n1 - cadastrar\n2 - mostrar\n0 - sair\n--> ");
                operacao = Integer.parseInt(sc.nextLine());
                System.out.println();

                switch (operacao) {
                    case 1: cadastro(agenda, sc); break;
                    case 2: mostrarDados(agenda, sc); break;
                    case 0: System.out.println("Programa encerrado!\n");break;
                    default: System.out.println("Opção inválida!");
                }
            } while(operacao != 0);
        } catch(NumberFormatException e) {
            System.out.println("Erro: " + e);
        }

        sc.close();
    }

    public static void cadastro(Agenda agenda, Scanner sc) {
        Pessoa responsavel = new Pessoa();
        Aluno aluno = new Aluno();

        System.out.print("informe o nome do aluno: ");
        aluno.setNome(sc.nextLine());

        System.out.print("Informe o email do aluno: ");
        aluno.setEmail(sc.nextLine());

        do {
            System.out.print("Informe o telefone do aluno (no formato 9XXXXXXXX): ");
            aluno.setTelefone(Integer.parseInt(sc.nextLine()));

            if (aluno.getTelefone() > 999999999 || aluno.getTelefone() < 900000000) {
                System.out.println("Numero inválido! Informe o telefone no seguinte formato: 9XXXXXXXX");
            }
        } while (aluno.getTelefone() > 999999999 || aluno.getTelefone() < 900000000);

        do {
            System.out.print("Informe a matrícula do aluno no format0 XXXXX: ");
            aluno.setMatricula(Integer.parseInt(sc.nextLine()));

            if (aluno.getMatricula() > 99999 || aluno.getMatricula() < 10000) {
                System.out.println("Numero inválido! Informe o telefone no seguinte formato: XXXXX");
            }
        } while (aluno.getMatricula() > 99999 || aluno.getMatricula() < 10000);

        System.out.printf("informe o nome do responsável do aluno %s: ", aluno.getNome());
        responsavel.setNome(sc.nextLine());

        System.out.print("Informe o email desse responsável: ");
        responsavel.setEmail(sc.nextLine());

        do {
            System.out.print("Informe o telefone desse responsável (no formato 9XXXXXXXX): ");
            responsavel.setTelefone(Integer.parseInt(sc.nextLine()));

            if (responsavel.getTelefone() > 999999999 || responsavel.getTelefone() < 900000000) {
                System.out.println("Numero inválido! Informe o telefone no seguinte formato: 9XXXXXXXX");
            }
        } while (responsavel.getTelefone() > 999999999 || responsavel.getTelefone() < 900000000);

        System.out.println();
        agenda.cadastraAluno(aluno);
        agenda.cadastraResponsavel(responsavel);
    }

    public static void mostrarDados(Agenda agenda, Scanner sc) {
        int tipo;

        System.out.print("Quais informações você deseja?\n1 - alunos\n2 - responsáveis\n3 - ambos\n-->");
        tipo = Integer.parseInt(sc.nextLine());
        System.out.println();

        switch(tipo) {
            case 1: agenda.mostraAlunos();break;
            case 2: agenda.mostraResponsaveis();break;
            case 3: agenda.mostraGeral();break;
            default: System.out.println("Opção Inválida!");break;
        }
    }
}
