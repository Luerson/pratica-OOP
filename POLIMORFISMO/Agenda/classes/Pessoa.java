package Agenda.classes;

public class Pessoa {
    private String nome, email;
    private int telefone;

    public Pessoa(String nome, String email, int telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefone() {
        return telefone;
    }

    public void mostraInfo() {
        System.out.printf("Nome: %s\nEmail: %s\nTelefone: %d\n", this.nome, this.email, this.telefone);
    }
}
