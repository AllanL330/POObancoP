package atividade2;

public class administrador extends empregado {

	private double ajudaCusto;

	public administrador(String p_nome, String p_endereco, String p_telefone, double e_salario, double a_ajudaCusto) {
		super(p_nome, p_endereco, p_telefone, e_salario);
		ajudaCusto = a_ajudaCusto;
	}

	public double getAjudaCusto() {
		return ajudaCusto;
	}

	public void setAjudaCusto(double ajudaCusto) {
		this.ajudaCusto = ajudaCusto;
	}

	//calcular salario do administrador
	public double calcularSalarioAdm() {
		return getAjudaCusto() + getSalario();
	}

	@Override
	public String toString() {
		return "Salario do administrador: " + calcularSalarioAdm();
	}

}

