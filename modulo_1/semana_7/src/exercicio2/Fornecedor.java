package exercicio2;

public class Fornecedor extends Pessoa {

    private double valorCredito;

    private double valorDivida;

    public double obterSaldo() {
        double saldo;
        saldo = this.valorCredito - this.valorDivida;
        return saldo;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    @Override
    public String toString() {
        return String.format("%nFornecedor %s: Contato: %s, %s.\nPossui saldo: R$ %.2f ",
                getNome(), getTelefone(), getEndereco(), obterSaldo());
    }
}
