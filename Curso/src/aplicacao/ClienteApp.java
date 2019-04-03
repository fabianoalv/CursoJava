package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.Cliente;

public class ClienteApp {

	public static void main(String[] args) {
		
		List<Cliente> cliente = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de cliente para cadastro :");
		int qtd = sc.nextInt();
		
		for (int i = 0; i < qtd; i++ ) {
			System.out.print("Cliente # "+ (i+1));
			System.out.print("\nDigite o ID :");
			int id = sc.nextInt();
			System.out.print("Digite o nome :");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Digite o endereco");
			String endereco = sc.nextLine();
			
			cliente.add(new Cliente(id, nome, endereco));
		}
		
		System.out.println();
		
		for (Cliente c : cliente) {
			System.out.println(c);
		}
		
		System.out.println();
		System.out.println("Digite o ID para busca do cliente :");
		int id = sc.nextInt();
		Cliente e = cliente.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if(e == null) {
			System.out.println("Cliente n�o cadastrado!");
		} else {
			
			System.out.println("Cliente encontrado ID : "+e.getId()+" "+e.getNome()+" " +"Endere�o :"+ e.getEndereco() );
		}
				
		
	}

}
