package OO3_Funcionario;

public class Gerente extends Funcionario{
    public Gerente(String nome, double salario, int ID) {
        super(nome, salario, ID);
        salarioGerente();
    }

    private void salarioGerente() {
        setSalario(getSalario()*1.2);
    }
}
