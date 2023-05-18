package Agenda;

public class Aluno  extends Pessoa {
    private int matricula;

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
