package Cae.beta;

import java.util.Calendar;
import java.util.Set;

public class Contrato {
	
	private Long CodCont;
	private Calendar inicio;
	private Set<ClienteNSocio> idNaosocio;
	private Set<Cae> idCAE;
	private Set<Planos> Plano;
	
	public Long getCodCont() {
		return CodCont;
	}
	public void setCodCont(Long codCont) {
		CodCont = codCont;
	}
	public Calendar getInicio() {
		return inicio;
	}
	public void setInicio(Calendar inicio) {
		this.inicio = inicio;
	}
	public Set<ClienteNSocio> getIdNaosocio() {
		return idNaosocio;
	}
	public void setIdNaosocio(Set<ClienteNSocio> idNaosocio) {
		this.idNaosocio = idNaosocio;
	}
	public Set<Cae> getIdCAE() {
		return idCAE;
	}
	public void setIdCAE(Set<Cae> idCAE) {
		this.idCAE = idCAE;
	}
	public Set<Planos> getPlano() {
		return Plano;
	}
	public void setPlano(Set<Planos> plano) {
		Plano = plano;
	}
	
	
}
