package OO3_Pessoa;

public class Aluno extends Pessoa {
    private String matricula;
    private String curso;

    public Aluno() {
        super();
        this.matricula = "";
        this.curso = "";
    }

    public Aluno(String nome, int idade, String endereco, String matricula, String curso) {
        super(nome, idade, endereco);
        this.matricula = matricula;
        this.curso = curso;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }
}
