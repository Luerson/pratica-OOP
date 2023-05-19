package Pagamentos.classes;

public class TransferenciaBancaria implements FormaDePagamento{
    public void realizarPagamento() {
        System.out.println("Pagamento realizado por transferância bancária!");
    }

    public void gerarRecibo(float valor) {
        System.out.printf("Valor total transferido para a conta = R$%.2f\n", valor);
    }
}
