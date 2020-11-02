package atividade2;

public class empregado extends Pessoa {
	protected double salario;
	
	public empregado(String p_nome, String p_endereco, String p_telefone, double e_salario) {
		super(p_nome, p_endereco, p_telefone);
		salario = e_salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	

}
