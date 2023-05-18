package Agenda;

public class Pessoa {
    protected String nome, email;
    protected int telefone;

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
        System.out.printf("Nome: %s\nEmail: %s\nTelefone: %d\n\n", this.nome, this.email, this.telefone);
    }
}
