package Agenda.classes;

public class Aluno extends Pessoa {
    private int matricula;

    public Aluno(String nome, String email, int telefone, int matricula) {
        super(nome, email, telefone);
        this.matricula = matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void mostraInfo() {
        super.mostraInfo();

        System.out.printf("Matrícula: %d\n", this.matricula);
    }
}
