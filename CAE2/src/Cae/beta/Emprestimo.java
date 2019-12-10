package Cae.beta;

import java.util.Set;

public class Emprestimo {

	private Long codEmpre;
	private String valorEmpre;
	private Integer parcelas;
	private String porceJuros;
	private Set<Cae> empresaCAE;
	private Set<ClienteSocio> empresaSocio;
	private Set<ClienteNSocio> empresaNSocio;
	
	public Long getCodEmpre() {
		return codEmpre;
	}
	public void setCodEmpre(Long codEmpre) {
		this.codEmpre = codEmpre;
	}
	public String getValorEmpre() {
		return valorEmpre;
	}
	public void setValorEmpre(String valorEmpre) {
		this.valorEmpre = valorEmpre;
	}
	public Integer getParcelas() {
		return parcelas;
	}
	public void setParcelas(Integer parcelas) {
		this.parcelas = parcelas;
	}
	public String getPorceJuros() {
		return porceJuros;
	}
	public void setPorceJuros(String porceJuros) {
		this.porceJuros = porceJuros;
	}
	public Set<Cae> getEmpresaCAE() {
		return empresaCAE;
	}
	public void setEmpresaCAE(Set<Cae> empresaCAE) {
		this.empresaCAE = empresaCAE;
	}
	public Set<ClienteSocio> getEmpresaSocio() {
		return empresaSocio;
	}
	public void setEmpresaSocio(Set<ClienteSocio> empresaSocio) {
		this.empresaSocio = empresaSocio;
	}
	public Set<ClienteNSocio> getEmpresaNSocio() {
		return empresaNSocio;
	}
	public void setEmpresaNSocio(Set<ClienteNSocio> empresaNSocio) {
		this.empresaNSocio = empresaNSocio;
	}
	
	
	
}
