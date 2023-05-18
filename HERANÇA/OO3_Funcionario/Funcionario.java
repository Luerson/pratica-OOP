package OO3_Funcionario;

public class Funcionario {
    private String nome;
    private double salario;
    private int ID;

    public Funcionario (String nome, double salario, int ID) {
        this.nome = nome;
        this.salario = salario;
        this.ID = ID;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public int getID() {
        return ID;
    }
}
