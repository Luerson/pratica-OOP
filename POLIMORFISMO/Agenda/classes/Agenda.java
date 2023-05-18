package Agenda.classes;

public class Agenda {
    private Pessoa[] responsaveis = new Pessoa[10];
    private Aluno[] alunos = new Aluno[10];
    int totalDeAlunos = 0, totalResponsaveis = 0;

    public void cadastraResponsavel(Pessoa responsavel) {
        if (totalResponsaveis >= 10) {
            System.out.println("Total de responsaveis já cadastrados!");
        } else {
            this.responsaveis[totalResponsaveis] = responsavel;
            totalResponsaveis++;
            System.out.println("Responsável cadastrado com sucesso!\n");
        }
    }

    public void cadastraAluno(Aluno aluno) {
        if (totalDeAlunos >= 10) {
            System.out.println("Total de alunos já preenchido!");
        } else {
            this.alunos[totalDeAlunos] = aluno;
            totalDeAlunos++;
            System.out.println("Aluno cadastrado com sucesso!\n");
        }
    }

    public void mostraResponsaveis() {
        if (totalResponsaveis == 0) {
            System.out.println("Não há nada no cadastro!\n");
            return;
        }

        System.out.println("Responsáveis:\n");
        for (int i = 0; i < totalResponsaveis; i++) {
            responsaveis[i].mostraInfo();
            System.out.println();
        }
    }

    public void mostraAlunos() {
        if (totalDeAlunos == 0) {
            System.out.println("Não há nada no cadastro!\n");
            return;
        }

        System.out.println("Alunos:\n");
        for (int i = 0; i < totalDeAlunos; i++) {
            alunos[i].mostraInfo();
            System.out.println();
        }
    }

    public void mostraGeral() {
        if (totalDeAlunos == 0) {
            System.out.println("Não há nada no cadastro!\n");
            return;
        }

        for (int i = 0; i < totalDeAlunos && i < totalResponsaveis; i++) {
            System.out.println(" - Aluno");
            alunos[i].mostraInfo();
            System.out.println();

            System.out.printf(" - Responsável do aluno %s\n", alunos[i].getNome());
            responsaveis[i].mostraInfo();
            System.out.println();
        }
    }

    public void achaContato(int indice) {
        if (indice >= totalDeAlunos && indice >= totalResponsaveis) {
            System.out.println("\nO índice informado excede a base de dados!\n");
            return;
        }

        if (indice < 0) {
            System.out.println("\nEsse índice é inválido!\n");
            return;
        }

        System.out.println(" - Aluno");
        alunos[indice].mostraInfo();
        System.out.println();

        System.out.printf(" - Responsável do aluno %s\n", alunos[indice].getNome());
        responsaveis[indice].mostraInfo();
        System.out.println();
    }

    public void achaContato(String nome) {
        for (int i = 0; i < totalDeAlunos; i++) {
            if (alunos[i].getNome().equals(nome)) {
                System.out.println();
                alunos[i].mostraInfo();
                System.out.println();
                return;
            }
        }

        for (int i = 0; i < totalResponsaveis; i++) {
            if (responsaveis[i].getNome().equals(nome)) {
                System.out.println();
                responsaveis[i].mostraInfo();
                System.out.println();
                return;
            }
        }

        System.out.println("\nContato não encontrado!\n");
    }
}
