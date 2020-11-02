package atividade2;

public class pessoa {
	protected String nome;
	protected String endereco ;
	protected String telefone;
	
	public pessoa(String p_nome, String p_endereco, String p_telefone){
		nome = p_nome;
		endereco = p_endereco;
		telefone = p_telefone;	
	}
	
	public pessoa() {
		this("","","");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
