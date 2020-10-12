package a;

import java.util.Date;

import banco.*;

public class principal {
	
	public static void main(String[] args) {
		String nome = "Allan Lopes";
		String cpf = "1234567890";
		String endereco = "rua ";
		String telefone = "01234567";
		Date nascimento = new Date();

		Cliente cliente1 = new Cliente(nome, cpf, endereco, telefone, nascimento);
		Cliente cliente2 = new Cliente(nome, cpf, endereco, telefone, nascimento);

		Conta conta1 = new Conta(cliente1, 1);
		Conta conta2 = new Conta(cliente2, 2);
		System.out.println("Saldo da conta: " + conta1.verSaldo());
		conta1.deposito(40);
		System.out.println("Deposito efetuado com sucesso, novo saldo da conta: " + conta1.verSaldo());
		System.out.println("Saldo da conta2: " + conta2.verSaldo());
		System.out.println("Tentativa de saque maior que saldo: " + conta1.saque(100));
   	
		
	}
}