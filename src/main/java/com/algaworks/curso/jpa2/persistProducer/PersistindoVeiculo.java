package com.algaworks.curso.jpa2.persistProducer;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.algaworks.curso.jpa2.modelo.Acessorio;
import com.algaworks.curso.jpa2.modelo.Aluguel;
import com.algaworks.curso.jpa2.modelo.Carro;
import com.algaworks.curso.jpa2.modelo.ModeloCarro;
import com.algaworks.curso.jpa2.modelo.Veiculo;
import com.algaworks.curso.jpa2.persistProducer.contextPersist.VeiculoId;
import com.algaworks.curso.jpa2.util.jpa.JpaUtil;

public class PersistindoVeiculo {

	public static void main(String[] args) throws IOException {
		//F:\java
		Path path = FileSystems.getDefault().getPath("F:/java/PALIO.jpg");
		byte[] foto = Files.readAllBytes(path);
		
		EntityManager manager = JpaUtil.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		
		Veiculo veiculo = new Veiculo();
		veiculo.setChaveComposta(new VeiculoId("ABC-0002", "teste2"));
		veiculo.setFabricante("CHEVROLET");
		veiculo.setModelo("CHEVET");
		veiculo.setAnoFabricacao(1980);
		veiculo.setAnoModelo(1982);
		veiculo.setValor(new BigDecimal(10_000));
		veiculo.setDataCadastro(new Date());
		veiculo.setFoto(foto);
		manager.persist(veiculo);

		
		tx.commit();
		manager.close();
		JpaUtil.close();
	}

}
