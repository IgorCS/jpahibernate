package com.algaworks.curso.jpa2.modelo;

import java.math.BigDecimal;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.algaworks.curso.jpa2.persistProducer.contextPersist.VeiculoId;

@Entity
@Table(name = "tab_veiculo")
public class Veiculo {
	
	private String fabricante;
	private String modelo;
	private Integer anoFabricacao;
	private Integer anoModelo;
	private BigDecimal valor;
	private VeiculoId chaveComposta;
	

	public void setChaveComposta(VeiculoId chaveComposta) {
		this.chaveComposta = chaveComposta;
	}
	
	@EmbeddedId
	public VeiculoId getChaveComposta() {
		return chaveComposta;
	}


	
	public String getFabricante() {
		return fabricante;
	}

	
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	
	public String getModelo() {
		return modelo;
	}

	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	
	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}

	
	public void setAnoFabricacao(Integer anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	
	public Integer getAnoModelo() {
		return anoModelo;
	}

	
	public void setAnoModelo(Integer anoModelo) {
		this.anoModelo = anoModelo;
	}

	
	public BigDecimal getValor() {
		return valor;
	}

	
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	

	

}
// getters, setters, hashCode e equals