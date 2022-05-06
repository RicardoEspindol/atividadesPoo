package persistencia.bancaria;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import bancario.model.Cliente;
import bancario.model.Conta;

public class PersistenciaArquivo {
	
	private List<Cliente> cadastrosClientes  = new ArrayList<>();
	public List<Cliente> listaCliente(){
		return cadastrosClientes;
	}
	
	public PersistenciaArquivo() {

		carregarDados();
	}
	
	public void adicionarCliente(Cliente c) throws Exception{
		if (!cadastrosClientes.contains(c))
		{
			cadastrosClientes.add(c);
			salvarDados();
		}else {
			throw new Exception("Cliente já cadastrado");
		}
	}
	
	public Cliente localizarClienteCPF(String cpf)throws Exception{
		Cliente temp = new Cliente(cpf);
		
		if(cadastrosClientes.contains(temp)) {
			int index = cadastrosClientes.indexOf(temp);
			temp = cadastrosClientes.get(index);
			return temp;
		}
		else {
			throw new Exception(" CLIENTE NÃO ENCONTRADO! ");
		}
	}

	private void salvarDados() {
		try {
			FileOutputStream fos = new FileOutputStream("inforContas.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(cadastrosClientes);
			oos.close();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	private void carregarDados() {
		try 
		{
			FileInputStream fis = new FileInputStream("inforContas.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			cadastrosClientes = (ArrayList<Cliente>) ois.readObject();
			ois.close();
		}
		catch(Exception ex)
		{
			System.err.println(ex.getMessage());
		}
	}
	public List<Cliente> listarClientes() {
		return cadastrosClientes;
		
	}
	public void chamadaSalvar () {
		try {
			salvarDados();
		}
		catch(Exception ex) {
			System.err.println(ex.getMessage());
			
		}
	}
	public void salvarDeposito() {
		try {
			salvarDados();
		}catch (Exception ex) {
			System.err.println(ex.getMessage());
		}
	}
	public void salvarSaque() {
		try {
			salvarDados();
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	public void removerCliente(String cpfRCL)throws Exception{
		Cliente temp=localizarClienteCPF(cpfRCL);
		if(cadastrosClientes.contains(temp)) {
			cadastrosClientes.remove(temp);
		}else {
			throw new Exception(" CLIENTE NÃO CADASTRADA!");
		}
	}
	
	
}
