public class Aluno {
    private String nome;
    private float nota1, nota2, nota3;

    public Aluno () {
        this.nome = "";
        this.nota1 = 0;
        this.nota2 = 0;
        this.nota3 = 0;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public String getNome() {
        return nome;
    }

    public float getNota1() {
        return nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public float notaFinal() {
        return nota1 + nota2 + nota3;
    }

    public boolean passou() {
        return notaFinal() >= 60;
    }

    public float distanciaDoMinimo() {
        if (passou()) {
            return 0;
        } else {
            return 60 - notaFinal();
        }
    }
}
