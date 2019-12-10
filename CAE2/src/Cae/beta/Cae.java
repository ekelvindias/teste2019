package Cae.beta;

import javax.persistence.Entity;

import org.hibernate.mapping.Set;

@Entity
public class Cae {
	
	
	private Long id;
	private String cnpj;
	private String local;
	private String gerente;
	private Set funcioCAE;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getGerente() {
		return gerente;
	}
	public void setGerente(String gerente) {
		this.gerente = gerente;
	} 
	public Set getFuncioCAE() {
		return funcioCAE;
	}
	public void setFuncioCAE(Set funcioCAE) {
		this.funcioCAE = funcioCAE;
	}
	
	
}
