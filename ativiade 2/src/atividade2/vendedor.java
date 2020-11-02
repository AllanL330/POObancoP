package atividade2;

public class vendedor extends empregado {
	private double valorVendas;
	private double comissao;

	public vendedor(String p_nome, String p_endereco, String p_telefone, double e_salario, double v_valorVendas,
			double v_comissao) {
		super(p_nome, p_endereco, p_telefone, e_salario);

		valorVendas = v_valorVendas;
		comissao = v_comissao;
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	public double comissao() {
		return getComissao() * getValorVendas();
	}

	//caucular salario do vendedor
	public double calcularSalarioVend() {
		return getSalario() + comissao();
	}

	@Override
	public String toString() {
		return "salario do Vendedor: " + calcularSalarioVend();
	}
}
