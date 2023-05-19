package Pagamentos.classes;

public class CartaoDeCredito implements FormaDePagamento{
    String usuario;

    public void realizarPagamento() {
        System.out.println("pagamento efetivado com cartão de crédito!\n");
    }

    public void gerarRecibo(float valor) {
        System.out.printf("Valor total da compra a ser cobrado na fatura = R$%.2f\n", valor);
    }
}
