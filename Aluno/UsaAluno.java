import java.util.Scanner;

public class UsaAluno {
    public static void main(String[] args) {
        final int TOTAL_DE_NOTAS = 3;
        Scanner input = new Scanner(System.in);
        Aluno meuAluno = new Aluno();
        float[] notas = new float[TOTAL_DE_NOTAS];

        System.out.print("Informe o nome do aluno: \n-->");
        meuAluno.setNome(input.nextLine());

        for (int i = 0; i < TOTAL_DE_NOTAS; i++) {
            System.out.printf("Informe a nota %d do aluno %s\n-->", i+1, meuAluno.getNome());
            notas[i] = input.nextInt();

            if (i == 0 && (notas[i] < 0 || notas[i] > 30)) {
                System.out.println("Por favor, digite uma nota válida (de 0 a 30)");
                i--;
            } else if (i != 0 && (notas[i] < 0 || notas[i] > 35)) {
                System.out.println("Por favor, digite uma nota válida (de 0 a 35)");
                i--;
            }
        }

        meuAluno.setNota1(notas[0]);
        meuAluno.setNota2(notas[1]);
        meuAluno.setNota3(notas[2]);

        System.out.printf("Aluno %s\n", meuAluno.getNome());
        System.out.print("Situação: ");
        if (meuAluno.passou()) {
            System.out.print("Passou!\n");
        } else {
            System.out.print("Não passou!\n");
        }
        System.out.printf("Nota final = %.2f\n", meuAluno.notaFinal());
        System.out.printf("Faltam %.2f pontos para o aluno passar!\n", meuAluno.distanciaDoMinimo());
    }
}
