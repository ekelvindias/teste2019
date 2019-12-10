package Cae.beta;

import java.util.Calendar;
import java.util.Set;

public class ClienteSocio {
	
	private Long idCS;
	private String nomeEmpresa;
	private String locEmpresa;
	private String gerente;
	private Calendar dataCriação;
	private Set<FunCS> funcionariosCSocios;
	
	public Long getIdCS() {
		return idCS;
	}
	public void setIdCS(Long idCS) {
		this.idCS = idCS;
	}
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}
	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	
	public String getGerente() {
		return gerente;
	}
	public void setGerente(String gerente) {
		this.gerente = gerente;
	}
	public Calendar getDataCriação() {
		return dataCriação;
	}
	public void setDataCriação(Calendar dataCriação) {
		this.dataCriação = dataCriação;
	}
	public Set<FunCS> getFuncionariosCSocios() {
		return funcionariosCSocios;
	}
	public void setFuncionariosCSocios(Set<FunCS> funcionariosCSocios) {
		this.funcionariosCSocios = funcionariosCSocios;
	}
	public String getLocEmpresa() {
		return locEmpresa;
	}
	public void setLocEmpresa(String locEmpresa) {
		this.locEmpresa = locEmpresa;
	}
}
