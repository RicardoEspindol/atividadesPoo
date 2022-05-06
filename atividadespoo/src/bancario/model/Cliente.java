package bancario.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Cliente implements Serializable{
	
	private static final long serialVersionUID = 1L;
	String cpf;
	String nome;
	
	//CONTAS
	private List<Conta> contas = new ArrayList<>();
	
	public List<Conta> listaContas(){
		return contas;
	}
	
	//CONSTRUTORES
	public Cliente() {
		
	}
	
	public Cliente(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public Cliente(String cpf){
		this.cpf = cpf;
	}
	
	//HASHCODE
	public int hashCode() {
		return Objects.hash(cpf);
	}
	
	//EQUALS
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(cpf, other.cpf);
	}

	
	
	//TOSTRING
	public String toString() {
		return "CLIENTE [CPF = " + cpf + ", NOME = " + nome +" ] "+  contas ;
	}
	
	public void adicionarConta(Conta c) throws Exception {
		if(contas.contains(c)) {
			throw new Exception (" CONTA JÁ CADASTRADA!");}
		else {
			contas.add(c);
		}
	}
	private List<Cliente> cadastrosClientes2  = new ArrayList<>();
	public List<Cliente> listaCliente2(){
		return cadastrosClientes2;
	}
	
	public void removerConta(Conta c)throws Exception{
		if(contas.contains(c))
			contas.remove(c);
		else
			throw new Exception(" CONTA NÃO CADASTRADA!");
		}
	
	
	public Conta localizarConta(String numeroConta)throws Exception{
		Conta temp = new Conta(numeroConta);
		if(contas.contains(temp)){	
			int index = contas.indexOf(temp);
			temp = contas.get(index);
			return temp;
		}else {
			throw new Exception(" CONTA NÃO ENCONTRADA ");
		}
	}
	
	public boolean containsConta(Conta c){
		if(contas.contains(c))
			return true;
		else
			return false;
	}
	public List<Conta> listarContas (){
		return contas;
	}
}
