
package com.eventoapp.models;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;


import org.hibernate.validator.constraints.NotEmpty;



@SuppressWarnings("deprecation")
@Entity
public class Convidado {
	
	
	
	/*
	 * @NotNull (message = "Campo não deve estar vazio")
	 * 
	 * @Size(min=7, max=7, message="O nome deve possuir pelo menos 2 letras")
	 */
	@Id
	@NotEmpty
	private String rg;
	
	/*
	 * @NotNull (message = "Campo não deve estar vazio")
	 * 
	 * @Size(min=2, max=100, message="O nome deve possuir pelo menos 2 letras")
	 */
	@NotEmpty
	private String nomeConvidado;
	
	@ManyToOne
	private Evento evento;
	
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getNomeConvidado() {
		return nomeConvidado;
	}
	public void setNomeConvidado(String nomeConvidado) {
		this.nomeConvidado = nomeConvidado;
	}
	public Evento getEvento() {
		return evento;
	}
	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	
	
}
