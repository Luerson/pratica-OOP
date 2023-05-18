public class Funcionario {
    private String nome;
    private float salario;
    private float imposto;
    private float salarioLiquido;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void setImposto(float imposto) {
        this.imposto = imposto;
    }

    public String getNome() {
        return nome;
    }

    public float getSalario() {
        return salario;
    }

    public float getImposto() {
        return imposto;
    }

    public float getSalarioLiquido() {
        this.salarioLiquido = this.salario - this.imposto;
        return this.salarioLiquido;
    }

    public float getNovoSalario(float porcentagem) {
        this.salario = this.salarioLiquido * (1 + porcentagem) + this.imposto;
        return this.salario;
    }
}
