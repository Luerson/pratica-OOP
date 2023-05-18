import java.util.Scanner;

public class UsaFuncionario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Funcionario meuFuncionario = new Funcionario();

        System.out.print("Por favor, informe o nome do funcionário:\n-->");
        meuFuncionario.setNome(input.nextLine());

        try {
            System.out.print("Por favor, insira o salario total do funcinário:\n-->");
            meuFuncionario.setSalario(input.nextFloat());

            System.out.print("Por favor, insira o imposto que incide sobre o salário:\n-->");
            meuFuncionario.setImposto(input.nextFloat());
        }catch (NumberFormatException e) {
            System.out.println();
        }

        System.out.printf("Nome do funcionário: %s\n", meuFuncionario.getNome());
        System.out.printf("Salário líquido do funcionário: %.2f\n", meuFuncionario.getSalarioLiquido());

        float porcentagem;
        System.out.print("\nInforme a porcentagem de aumento do salário (onde '1' é 100%)");
        System.out.println(" usando vírgula para a casa decimal:");
        porcentagem = input.nextFloat();

        System.out.println("\nNovos dados:");
        System.out.printf("Nome do funcionário: %s\n", meuFuncionario.getNome());
        System.out.printf("Salário líquido do funcionário: %.2f\n", meuFuncionario.getNovoSalario(porcentagem));
    }
}
