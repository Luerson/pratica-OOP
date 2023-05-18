package OO3_Funcionario;

public class Main {
    public static void main(String[] args) {
        Gerente meuGerente = new Gerente("Palmito", 1000, 12);

        System.out.println("nome do gerente = " + meuGerente.getNome());
        System.out.println("salario do gerente = " + meuGerente.getSalario());
        System.out.println("ID do gerente = " + meuGerente.getID());
    }
}
