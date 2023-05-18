package OO3_Pessoa;

public class Main {
    public static void main(String[] args) {
        Aluno meuAluno = new Aluno("Luerson", 21, "Rua coronel Miguel Satyro", "20220054900", "Ciência da computação");
        Professor meuProfessor = new Professor("Danielly Rousi", 40, "Cafundó do judas", "LP1", 100000);

        System.out.printf("Nome do aluno = %s\n", meuAluno.getNome());
        System.out.printf("Idade do aluno = %d\n", meuAluno.getIdade());
        System.out.printf("Endereco do aluno = %s\n", meuAluno.getEndereco());
        System.out.printf("Matricula do aluno = %s\n", meuAluno.getMatricula());
        System.out.printf("Curso do aluno = %s\n\n", meuAluno.getCurso());

        System.out.printf("Nome do professor = %s\n", meuProfessor.getNome());
        System.out.printf("Idade do professor = %d\n", meuProfessor.getIdade());
        System.out.printf("Endereco do professor = %s\n", meuProfessor.getEndereco());
        System.out.printf("Cadeira do professor = %s\n", meuProfessor.getDisciplina());
        System.out.printf("Salario do professor = %.2f\n\n", meuProfessor.getSalario());
    }
}
