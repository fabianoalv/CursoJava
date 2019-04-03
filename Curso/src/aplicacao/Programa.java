package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Conta;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta c1;

		System.out.println("Entre com o numero da conta: ");
		int conta = sc.nextInt();
		System.out.print("Entre com o nome do titular da conta: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.println("Entre com o valor inicial da conta: (n/y) ?");
		char resp = sc.next().charAt(0);
		
		if(resp == 'y') {
			System.out.print("Entre com o valor de deposito");
			double valorInicial = sc.nextDouble();
			c1 = new Conta(conta, nome, valorInicial);
		} 
		
		else {
			c1 = new Conta(conta, nome);
			
		}
		
		
		System.out.println("Dados da conta: ");
		System.out.println(c1);

		

	}

}
