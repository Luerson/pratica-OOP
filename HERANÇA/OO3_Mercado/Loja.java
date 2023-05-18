package OO3_Mercado;

public class Loja {
    public Produto[] produtos = new Produto[10];
    int numeroDeProdutos;

    public int adicionarProduto(Produto produto) {
        if (numeroDeProdutos >= produtos.length) {
            System.out.println("Estoque de produtos cheio");
            return 0;
        }

        produtos[numeroDeProdutos] = produto;
        numeroDeProdutos++;
        System.out.println("Produto adicionado com sucesso");

        return 1;
    }

    public void listarProdutos() {
        for (int i = 0; i < numeroDeProdutos; i++) {
            System.out.println(produtos[i].mostraInfo());
        }
    }
}
