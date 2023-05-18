package OO3_Pessoa;

public class Professor extends Pessoa{
    private String disciplina;
    private double salario;

    public Professor() {
        super();
        this.disciplina = "";
        this.salario = 0;
    }

    public Professor(String nome, int idade, String endereco, String disciplina, double salario) {
        super(nome, idade, endereco);
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public String getDisciplina() {
        return disciplina;
    }
}
