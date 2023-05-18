package Agenda;

public class Agenda {
    Pessoa[] responsaveis = new Pessoa[10];
    Aluno[] alunos = new Aluno[10];
    int totalDeAlunos = 0, totalResponsaveis = 0;

    public void cadastraResponsavel(Pessoa responsavel) {
        if (totalResponsaveis >= 10) {
            System.out.println("Total de responsaveis já cadastrados!");
        } else {
            this.responsaveis[totalResponsaveis] = responsavel;
            totalResponsaveis++;
            System.out.println("Responsável cadastrado com sucesso!");
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
        System.out.println("Responsáveis: ");
        for (int i = 0; i < totalResponsaveis; i++) {
            responsaveis[i].mostraInfo();
        }
    }

    public void mostraAlunos() {
        System.out.println("Alunos: ");
        for (int i = 0; i < totalDeAlunos; i++) {
            alunos[i].mostraInfo();
        }
    }

    public void mostraGeral() {
        for (int i = 0; i < totalDeAlunos && i < totalResponsaveis; i++) {
            System.out.println(" - Aluno");
            alunos[i].mostraInfo();
            System.out.printf(" - Responsável do aluno %s\n", alunos[i].getNome());
            responsaveis[i].mostraInfo();
        }
    }
}
