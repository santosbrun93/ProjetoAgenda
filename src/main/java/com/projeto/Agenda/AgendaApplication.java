package com.projeto.Agenda;

import com.projeto.Agenda.DAO.ClienteDAO;
import com.projeto.Agenda.model.Cliente;
import com.projeto.Agenda.model.formaPagamento;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class AgendaApplication {

	public static void main(String[] args) {

		ClienteDAO manager = new ClienteDAO();

		System.out.println("Teste de gravação de Cliente");
		Cliente cliente = new Cliente();
		cliente.setNome("Bruno Silva");
		cliente.setEmail("bruno.silva@gmail.com");
		cliente.setCPF("030.313.420-54");
		cliente.setRG("4095768638");
		cliente.setDataNascimento(LocalDate.ofEpochDay(07/12/1993));
		cliente.setFormaCliente(formaPagamento.DINHEIRO);
		cliente.setClienteAntigo(false);

		manager.save(cliente);
		System.out.println("Cliente salvo com sucesso!");


	}



}
