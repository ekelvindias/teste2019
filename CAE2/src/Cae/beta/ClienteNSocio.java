package Cae.beta;

import java.util.Calendar;
import java.util.Set;

public class ClienteNSocio {

	private Long idCNS;
	private String nomeEmpresaNS;
	private String cnpj;
	private String gerente;
	private Calendar dataCria��o;
	private Set<FunCnS> funcionariosCnSocios;
	
	public Long getIdCNS() {
		return idCNS;
	}
	public void setIdCNS(Long idCNS) {
		this.idCNS = idCNS;
	}
	public String getNomeEmpresaNS() {
		return nomeEmpresaNS;
	}
	public void setNomeEmpresaNS(String nomeEmpresaNS) {
		this.nomeEmpresaNS = nomeEmpresaNS;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getGerente() {
		return gerente;
	}
	public void setGerente(String gerente) {
		this.gerente = gerente;
	}
	public Calendar getDataCria��o() {
		return dataCria��o;
	}
	public void setDataCria��o(Calendar dataCria��o) {
		this.dataCria��o = dataCria��o;
	}
	public Set<FunCnS> getFuncionariosCnSocios() {
		return funcionariosCnSocios;
	}
	public void setFuncionariosCnSocios(Set<FunCnS> funcionariosCnSocios) {
		this.funcionariosCnSocios = funcionariosCnSocios;
	}
	
}
