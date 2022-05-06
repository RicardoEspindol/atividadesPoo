package bancario.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Conta implements Serializable {

	private static final long serialVersionUID = 1L;
	private String numeroConta;
	private float saldo;
	private Date dataAbertura;
	private boolean status;
	
	public Conta(){	
		
	}
	
	public Conta(String numeroConta){
		this.numeroConta = numeroConta;
		this.saldo = 0f;
		this.status = true;
		this.dataAbertura = new Date();
	}

	public int hashCode() {
		return Objects.hash(numeroConta);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		return Objects.equals(numeroConta, other.numeroConta);
	}

	@Override
	public String toString() {
		return "CONTA [NUMERO CONTA = " + numeroConta + ", SALDO = " + saldo + ", DATA DE ABERTURA = " + dataAbertura + ", STATUS = "
				+ status + " ]";
	}
	public void depositarC(String numeroConta,float valor) throws Exception {
		if(this.status && valor > 0) {
			this.saldo += valor;
		}else if(valor <= 0){
			throw new Exception(" VALOR INVÁLIDO!");
		}else if(this.status == false) {
			throw new Exception(" CONTA DESATIVADA ");
		}
	}
	public void sacarQuant (String numeroConta2, float valor2) throws Exception {
		if(this.status && valor2 > 0 && valor2< this.saldo) {
			this.saldo -= valor2;			
		}else if (valor2 > this.saldo) {
			throw new Exception(" VALOR DO SAQUE INDISPONÍVEL NA SUA CONTA ");
		}else if(this.status == false) {
			throw new Exception(" CONTA DESATIVADA ");
		}else if(valor2 <= 0) {
			throw new Exception(" VALOR INVIÁVEL ");
		}
	}
	public String consultaSaldo (String numeroCT) throws Exception  {
		if(this.status) {
			return (Float.toString(this.saldo));
			}else {
				throw new Exception  (" CONTA NÃO ENCONTRADA ");
			}
		
	}
	

}
