/*
* Alunos:
* Luerson de Albuqeuerque Silva Filho, 20220054900
* Camila Eduardo Costa Vasconcelos, 20220054768
*
* link para o diagrama que responde a letra a):
* https://drive.google.com/file/d/1Lzeyx9cApZoHkU9JjbiXcRTzV_5rIGbL/view?usp=sharing
*
* resposta letra d):
* Seria necessário criar uma nova classe professor que herda de aluno e possui atributos próprios.
* Além disso essa classe teria uma relação de composição do a agenda, pois nesse modelo a existência
* do objeto professor depende da classe agenda. Além disso, seria necessário criar métodos em agenda
* para preencher, listar e encontrar cada professor, o que tornaria a classe 'agenda' dependente
* da classe 'Professofor'.
* */

package Agenda.main;
import Agenda.classes.*;

import Agenda.classes.Agenda;

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
        String nomeAluno, nomeResponsavel;
        String emailAluno, emailResponsavel;
        int telefoneAluno, telefoneResponsavel;
        int matriculaAluno;

        System.out.print("informe o nome do aluno: ");
        nomeAluno = sc.nextLine();

        System.out.print("Informe o email do aluno: ");
        emailAluno = sc.nextLine();

        do {
            System.out.print("Informe o telefone do aluno (no formato 9XXXXXXXX): ");
            telefoneAluno = Integer.parseInt(sc.nextLine());

            if (telefoneAluno > 999999999 || telefoneAluno < 900000000) {
                System.out.println("Numero inválido! Informe o telefone no seguinte formato: 9XXXXXXXX");
            }
        } while (telefoneAluno > 999999999 || telefoneAluno < 900000000);

        do {
            System.out.print("Informe a matrícula do aluno no formato XXXXX: ");
            matriculaAluno = Integer.parseInt(sc.nextLine());

            if (matriculaAluno > 99999 || matriculaAluno < 10000) {
                System.out.println("Numero inválido! Informe o telefone no seguinte formato: XXXXX");
            }
        } while (matriculaAluno > 99999 || matriculaAluno < 10000);

        System.out.printf("informe o nome do responsável do aluno %s: ", nomeAluno);
        nomeResponsavel = sc.nextLine();

        System.out.print("Informe o email desse responsável: ");
        emailResponsavel = sc.nextLine();

        do {
            System.out.print("Informe o telefone desse responsável (no formato 9XXXXXXXX): ");
            telefoneResponsavel = Integer.parseInt(sc.nextLine());

            if (telefoneResponsavel > 999999999 || telefoneResponsavel < 900000000) {
                System.out.println("Numero inválido! Informe o telefone no seguinte formato: 9XXXXXXXX");
            }
        } while (telefoneResponsavel > 999999999 || telefoneResponsavel < 900000000);

        System.out.println();
        agenda.cadastraAluno(new Aluno(nomeAluno, emailAluno, telefoneAluno, matriculaAluno));
        agenda.cadastraResponsavel(new Pessoa(nomeResponsavel, emailResponsavel, telefoneResponsavel));
    }

    public static void mostrarDados(Agenda agenda, Scanner sc) {
        int tipo;
        int indice = -1;
        String nome = "";

        System.out.print("Quais informações você deseja?\n1 - alunos\n2 - responsáveis\n3 - ambos\n4 - contato por índice\n5 - contato por nome\n--> ");
        tipo = Integer.parseInt(sc.nextLine());
        System.out.println();

        if (tipo == 4) {
            System.out.print("Digite o índice desejado: ");
            indice = Integer.parseInt(sc.nextLine());
        }

        if (tipo == 5) {
            System.out.print("Digite o nome do contato desejado: ");
            nome = sc.nextLine();
        }

        switch(tipo) {
            case 1: agenda.mostraAlunos();break;
            case 2: agenda.mostraResponsaveis();break;
            case 3: agenda.mostraGeral();break;
            case 4: agenda.achaContato(indice);break;
            case 5: agenda.achaContato(nome);break;
            default: System.out.println("Opção Inválida!");break;
        }
    }
}
