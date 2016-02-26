package com.algaworks.curso.jpa2.service;

import java.io.Serializable;

import javax.inject.Inject;

import com.algaworks.curso.jpa2.dao.CarroDAO;
import com.algaworks.curso.jpa2.modelo.Carro;
import com.algaworks.curso.jpa2.util.jpa.Transactional;

public class CadastroCarroService implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private CarroDAO carroDAO;
	
	@Transactional
	public void salvar(Carro carro) throws NegocioException {
		
		if (carro.getPlaca() == null || carro.getPlaca().trim().equals("")) {
			throw new NegocioException("A placa é obrigatória!");
		}
		
		if (carro.getModelo() == null) {
			throw new NegocioException("O modelo do carro é obrigatório!");
		}
		
		this.carroDAO.salvar(carro);
	}
	

}
