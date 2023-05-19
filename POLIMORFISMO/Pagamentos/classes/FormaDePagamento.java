package Pagamentos.classes;

public interface FormaDePagamento {
    public void realizarPagamento();
    public void gerarRecibo(float valor);
}
