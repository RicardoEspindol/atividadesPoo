package bancario.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import persistencia.bancaria.PersistenciaArquivo;

public class Programa {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PersistenciaArquivo p = new PersistenciaArquivo();
		
		
		int opcao = 0;
		boolean sair = false;
		System.out.println();
		System.out.println("  BANCO TRIBAÚNA  	"
				+ "\n  BEM VINDO AO NOSSO SITE! \n"
				+ "  COMO PODEMOS TE AJUDAR?");

		while(!sair)
		{
			System.out.print("\n\n  INSIRA A OPÇÃO DESEJADA:\n"
					+ "    1) CADASTRAR CLIENTE;\n"
					+ "    2) LISTAR CLIENTES ENCONTRADOS;\n"
					+ "    3) CONSULTAR CLIENTE POR CPF;\n"
					+ "    4) REMOVER CLIENTE;\n"
					+ "    5) CRIAR CONTA E ASSOCIAR AO CLIENTE;\n"
					+ "    6) LISTAR AS CONTAS CADASTRADAS ;\n"
					+ "    7) REMOVER CONTA ;\n"
					+ "    8) REALIZAR DEPÓSITO;\n"
					+ "    9) REALIZAR SAQUE;\n"
					+ "    10) CONSULTAR SALDO;\n"
					+ "    11) SAIR DO SITE;\n\n"
					+ "    >>  OPÇÃO: ");
			opcao = sc.nextInt();
			
			switch (opcao) {
			
			case 1:
				System.out.println("\n >> OPÇÃO CADASTRAR CLIENTE << ");
				System.out.println(" - INSIRA OS DADOS DO CLIENTE ");
				
				String nome;
				String cpf;
				String numeroConta;
				System.out.print(" DIGITE SEU NOME: ");
				nome= sc.next();
				System.out.print(" DIGITE SEU CPF: ");
				cpf = sc.next();
				System.out.print(" DIGITE O NUMERO DA SUA CONTA: ");
				numeroConta = sc.next();
				
				Conta account = new Conta (numeroConta);
				Cliente client = new Cliente(cpf,nome);
				
				try{
					client.adicionarConta(account);
					p.adicionarCliente(client);
					p.chamadaSalvar();
				}catch(Exception e) {
					System.err.println(e.getMessage());
				}
				
				break;
				
			case 2:
				System.out.println("\n >> LISTA DE CLIENTES CADASTRADOS <<");
				for(Cliente cont: p.listarClientes()) {
					System.out.println(cont);
				}
				
				break;
			case 3:
				System.out.println("\n >> CONSULTAR CLIENTE POR CPF << ");
				String cpfLC;
				System.out.print(" DIGITE O NUMERO DO SEU CPF PARA SER REALIZADA A CONSULTA: ");
				cpfLC = sc.next();
				try {
				System.out.println(p.localizarClienteCPF(cpfLC));
				}catch (Exception e){
					System.err.println(e.getMessage());
				}
				
				break;
				
			case 4:
				System.out.println("\n >> REMOVER CLIENTE <<");
				Cliente clientex;
				String cpf1RC;
				System.out.print(" DIGITE SEU CPF: ");
				cpf1RC = sc.next();
				try {
				clientex = p.localizarClienteCPF(cpf1RC);
				p.removerCliente(cpf1RC);
				p.chamadaSalvar();
				}catch(Exception e) {
					System.err.println(e.getMessage());
				}
				
				
				break;
			case 5:
				System.out.println("\n >> CRIAR CONTA E ASSOCIAR À CLIENTE <<");
			String numeroContaa;
			String cpfLocalizar;
			Cliente temp;
			System.out.print(" DIGITE SEU CPF: ");
			cpfLocalizar = sc.next();
			System.out.print(" NUMERO DA CONTA: ");
			numeroContaa = sc.next();	
			Conta account2 = new Conta (numeroContaa);
			try{
				temp= p.localizarClienteCPF(cpfLocalizar);
				temp.adicionarConta(account2);
				p.chamadaSalvar();
			}catch(Exception e) {
				System.err.println(e.getMessage());
			}
			
			
						
				
				break;
			case 6:
				System.out.println("\n >> LISTAR CONTAS DE CLIENTE <<");
				List<Conta> temp1 = new ArrayList<>();
				String cpfLC1;
				System.out.print(" DIGITE O NUMERO DO SEU CPF PARA SER REALIZADA A CONSULTA: ");
				cpfLC1 = sc.next();
				try {
				temp1 = p.localizarClienteCPF(cpfLC1).listaContas();
				System.out.println(" \n- EXIBINDO CONTAS CADASTRADAS CORRESPONDENTE AO CPF FORNECIDO ");
				for(Conta c : temp1)
					System.out.println(c);
				}catch(Exception e) {
					System.err.println(e.getMessage());
				}
				
				break;
			case 7:
				System.out.println("\n >> REMOVER CONTA << ");
				String numeroContR;
				String cpf1R;
				Cliente p1R;
				System.out.print(" SEU CPF: ");
				cpf1R = sc.next();
				Conta c1R;
				System.out.print(" DIGITE O NUMERO DA SUA CONTA: ");
				numeroContR = sc.next();
				try {
				p1R = p.localizarClienteCPF(cpf1R);
				c1R = p1R.localizarConta(numeroContR);
				p1R.removerConta(c1R);
				p.chamadaSalvar();
				}catch(Exception e) {
					System.err.println(e.getMessage());
				}
				break;
				
			case 8:
				System.out.println("\n >> REALIZAR DEPÓSITO <<");
				float numero;
				String numeroCont;
				String cpf1;
				Cliente p1;
				System.out.print(" SEU CPF: ");
				cpf1 = sc.next();
				Conta c1;
				System.out.print(" DIGITE O NUMERO DA SUA CONTA: ");
				numeroCont = sc.next();
				System.out.print(" VALOR DE DEPOSITO: ");
				numero = sc.nextFloat();
				try{
				p1 = p.localizarClienteCPF(cpf1);
				c1 = p1.localizarConta(numeroCont);
				c1.depositarC(numeroCont, numero);
				p.salvarDeposito();
				}catch(Exception e){
					System.err.println( e.getMessage());
					
				}
				
				break;
				
			case 9:
				System.out.println("\n >> REALIZAR SAQUE <<");
				float valorSaque;
				String numeroConta2;
				String cpf2;
				Cliente p2;
				System.out.print(" DIGITE SEU CPF: ");
				cpf2 = sc.next();
				Conta c2;
				System.out.print(" DIGITE O NUMERO DA SUA CONTA: ");
				numeroConta2 = sc.next();
				System.out.print(" VALOR DE SAQUE: ");
				valorSaque = sc.nextFloat();
				try {
				p2 = p.localizarClienteCPF(cpf2);
				c2 = p2.localizarConta(numeroConta2);
				c2.sacarQuant(numeroConta2, valorSaque);
				p.salvarSaque();}
				catch(Exception e) {
					System.err.println(e.getMessage());
				}
				break;
				
			case 10:
				System.out.println("\n >> CONSULTAR SALDO <<");
				String numeroCont4;
				String cpf4;
				Cliente p4;
				System.out.print(" SEU CPF: ");
				cpf4 = sc.next();
				Conta c4;
				System.out.print(" DIGITE O NUMERO DA SUA CONTA: ");
				numeroCont4 = sc.next();
				
				try{
					p4 = p.localizarClienteCPF(cpf4);
					c4 = p4.localizarConta(numeroCont4);
					System.out.println(" SALDO DA SUA CONTA = R$ "+ c4.consultaSaldo(numeroCont4));
				}catch(Exception e) {
					System.err.println(e.getMessage());
				}
				// ESSE AQUI EU FIZ MAIS TÁ DANDO ERRO NO LOCALIZAR CONTA LINHA ENCIMA DO TRY
				
				break;
			case 11:
				sair = true;
				System.out.println("\n >> PROGRAMA FINALIZADO! << \n\n\n");
				break;
				
			default:
				System.err.println(" OPÇÃO NÃO ENCONTRADA!");
				break;
			}
			System.out.println("\n\n");
			}		
		}
	
}

