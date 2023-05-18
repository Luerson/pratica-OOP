package OO3_Mercado;

public class Monitor extends Produto {
    private String resolucao;
    private int tamanhoEmPolegadas;

    public Monitor() {
        super();
        this.resolucao = "";
        this.tamanhoEmPolegadas = 0;
    }

    public Monitor(String nome, double preco, String descricao) {
        super(nome, preco, descricao);
        this.resolucao = "";
        this.tamanhoEmPolegadas = 0;
    }

    public String mostraInfo() {
        String info = super.mostraInfo();

        info += "resolução = " + this.resolucao + "\n";
        info += "Tamanho = " + this.tamanhoEmPolegadas + " polegadas\n";

        return info;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    public void setTamanhoEmPolegadas(int tamanhoEmPolegadas) {
        this.tamanhoEmPolegadas = tamanhoEmPolegadas;
    }

    public String getResolucao() {
        return resolucao;
    }

    public int getTamanhoEmPolegadas() {
        return tamanhoEmPolegadas;
    }
}
