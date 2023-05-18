package OO3_Mercado;

public class Computador extends Produto{
    private int memoriaEmGB;
    private int armazenamentoEmGB;

    public Computador() {
        super();
        this.memoriaEmGB = 0;
        this.armazenamentoEmGB = 0;
    }

    public Computador(String nome, double preco, String descricao) {
        super(nome, preco, descricao);
        this.memoriaEmGB = 0;
        this.armazenamentoEmGB = 0;
    }

    public String mostraInfo() {
        String info = super.mostraInfo();

        info += "Memória = " + this.memoriaEmGB + "GB\n";
        info += "Armazenamento = " + this.armazenamentoEmGB + "GB\n";

        return info;
    }

    public void setMemoriaEmGB(int memoriaEmGB) {
        this.memoriaEmGB = memoriaEmGB;
    }

    public void setArmazenamentoEmGB(int armazenamentoEmGB) {
        this.armazenamentoEmGB = armazenamentoEmGB;
    }

    public int getMemoriaEmGB() {
        return memoriaEmGB;
    }

    public int getArmazenamentoEmGB() {
        return armazenamentoEmGB;
    }
}
