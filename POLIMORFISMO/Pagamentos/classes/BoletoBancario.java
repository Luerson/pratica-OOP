package Pagamentos.classes;

public class BoletoBancario implements FormaDePagamento {
    public void realizarPagamento() {
        System.out.println("Pagamento efetivado através de boleto bancário!\n");
    }

    public void gerarRecibo(float valor) {
        System.out.printf("boleto pago no valor de R$%.2f\n", valor);
    }
}
