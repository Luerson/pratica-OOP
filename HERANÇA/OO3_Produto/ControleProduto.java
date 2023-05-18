package OO3_Produto;

public class ControleProduto {
    int length = 3;
    public Produto[] produtos = new Produto[length];

    public ControleProduto() {
        for (int i = 0; i < length; i++) {
            produtos[i] = new Produto();
        }
    }

    public int efetuaVenda(String p, int quantidade) {
        int i;
        int erro;

        for (i = 0; i < produtos.length; i++) {
            if (produtos[i].nome.equals(p)) {
                break;
            }
        }

        if (i >= produtos.length) {
            erro = 1;
        } else if (produtos[i].quantidade < quantidade) {
            erro = 2;
        } else {
            erro = 0;
        }

        switch (erro) {
            case 1:
                System.out.println("Produto não encontrado!\n");break;
            case 2:
                System.out.println("O estoque não possui a quantidade requisitada!\n");break;
            default: {
                System.out.println("Venda efetuada!\n");
                return 1;
            }
        }

        return 0;
    }

    public void cadastraProduto(String nome, int quantidade, float preco) {
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i].nome.equals("")) {
                produtos[i].setNome(nome);
                produtos[i].setQuantidade(quantidade);
                produtos[i].setPreco(preco);
                return;
            }
        }

        System.out.println("Cadastro cheio, operação não sucedida!\n");
    }
}
