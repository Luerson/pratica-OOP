package OO3_Produto;

public class Produto {
    String nome;
    int quantidade;
    float preco;

    public Produto() {
        this.nome = "";
        this.quantidade = 0;
        this.preco = 0;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public float getPreco() {
        return preco;
    }
}
