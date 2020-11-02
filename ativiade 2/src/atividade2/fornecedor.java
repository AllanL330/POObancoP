package atividade2;

public class fornecedor extends pessoa {
	private double valorCredito;
	private double valorDivida;

	public fornecedor(String p_nome, String p_endereco, String p_telefone, double f_valorCredito,
			double f_valorDivida) {
		super(p_nome, p_endereco, p_telefone);
		valorCredito = f_valorCredito;
		valorDivida = f_valorDivida;
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

	public double obterSaldo() {
		return getValorCredito() - getValorDivida();
	}
}
