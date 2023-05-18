package OO3_Mercado;

public class Produto {
    private String nome;
    private double preco;
    private String descricao;

    public Produto() {
        this.nome = "";
        this.preco = 0;
        this.descricao = "";
    }

    public Produto(String nome, double preco, String descricao) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
    }

    public String mostraInfo() {
        String info = "";

        info += this.nome + "\n\n";
        info += this.descricao + "\n\n";

        info += "Especificações:\n";
        info += "Preço: " + String.format("%.2f", this.preco) + "R$\n";

        return info;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }
}
