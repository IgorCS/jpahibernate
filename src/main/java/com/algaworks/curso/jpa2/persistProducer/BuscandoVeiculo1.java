package com.algaworks.curso.jpa2.persistProducer;

import javax.persistence.EntityManager;

import com.algaworks.curso.jpa2.modelo.Carro;
import com.algaworks.curso.jpa2.modelo.Veiculo;
import com.algaworks.curso.jpa2.persistProducer.contextPersist.VeiculoId;
import com.algaworks.curso.jpa2.util.jpa.JpaUtil;

public class BuscandoVeiculo1 {
	
	public static void main(String[] args) {
		EntityManager manager = JpaUtil.getEntityManager();
		//Carro veiculo = manager.getReference(Carro.class, 1L);
		
		
		VeiculoId id = new VeiculoId("ABC-1235", "Altos");
		Veiculo veiculo = manager.find(Veiculo.class, id);
		System.out.println("Placa: " + veiculo.getChaveComposta().getPlaca().toString());
		System.out.println("Cidade: " + veiculo.getChaveComposta().getCidade());
		System.out.println("Fabricante: " + veiculo.getFabricante());
		System.out.println("Modelo: " + veiculo.getModelo());
		/*System.out.println("Fabricante: " + veiculoBusca.getValorDiaria());
		System.out.println("Modelo: " + veiculoBusca.getModelo());
		System.out.println("Buscou veículo. Será que já executou o SELECT?");
		/*System.out.println("Veículo de código " + veiculo.getCodigo()
		+ " é um " + veiculo.getModelo().getDescricao());*/
		manager.close();
		JpaUtil.close();
		}

}
