/* Teste de Classe Aluno Gustavo Tozeti Herculano - 1142275851 */
/* Teste de Classe Aluno Matheus Cavalcanti de Arruda - 1142097286 */

package negocio;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GerenciadoraClientesTest {

	private GerenciadoraClientes gerCliente;
	private int idCli1 = 1;
	private int idCli2 = 2;

	@Before
	public void setUp() {
		Cliente cli1 = new Cliente(idCli1, "Pedro", 34, "pedro@teste.com", 43465645, true);
		Cliente cli2 = new Cliente(idCli2, "João", 54, "jose@teste.com", 4507740, false);

		List<Cliente> clientesDoBancoTeste = new ArrayList<>();

		clientesDoBancoTeste.add(cli1);
		clientesDoBancoTeste.add(cli2);

		gerCliente = new GerenciadoraClientes(clientesDoBancoTeste);
	}

	@After
	public void tearDown() {
		gerCliente.removeCliente(idCli1);
		gerCliente.removeCliente(idCli2);
	}

	/*
	 * Teste de pesquisa de um cliente a partir do ID
	 */
	@Test
	public void pesquisaCliente() {

		// * ------------ Execução --------------- * /
		Cliente cliente = gerCliente.pesquisaCliente(idCli1);

		// * ------------ Verificações --------------- * /
		assertTrue(cliente.getId() == idCli1);

	}

	/*
	 * Teste de remoção de um cliente a partir do ID
	 */
	@Test
	public void removeCliente() {

		// * ------------ Execução --------------- * /
		boolean removido = gerCliente.removeCliente(idCli2);

		// * ------------ Verificações --------------- * /
		assertTrue(removido);
		assertTrue(gerCliente.getClientesDoBanco().size() == 1);
		assertNull(gerCliente.pesquisaCliente(idCli2));

	}

	/*
	 * Teste para validar um conjunto de idades válidas
	 */
	@Test
	public void validaIdade_validas() throws IdadeNaoPermitidaException {
		int[] idades = { 18, 19, 65, 64 };

		for (int idade : idades) {

			// * ------------ Execução --------------- * /
			gerCliente.pesquisaCliente(idCli1).setIdade(idade);

			// * ------------ Verificações --------------- * /
			assertTrue(gerCliente.validaIdade(gerCliente.pesquisaCliente(idCli1).getIdade()));

		}

	}

	/*
	 * Teste para validar uma idade inválida no limite mínimo
	 * Idade = 17
	 */

	@Test(expected = IdadeNaoPermitidaException.class)
	public void validaIdadeLimiteMin() throws IdadeNaoPermitidaException {
		int idade = 17;

		// * ------------ Execução --------------- * /
		gerCliente.pesquisaCliente(idCli1).setIdade(idade);

		// * ------------ Verificações --------------- * /
		assertTrue(gerCliente.validaIdade(gerCliente.pesquisaCliente(idCli1).getIdade()));

	}
	
	/*
	 * Teste para validar uma idade inválida no limite máximo
	 * Idade = 66
	 */

	@Test(expected = IdadeNaoPermitidaException.class)
	public void validaIdadeLimiteMax() throws IdadeNaoPermitidaException {
		int idade = 66;

		// * ------------ Execução --------------- * /
		gerCliente.pesquisaCliente(idCli1).setIdade(idade);

		// * ------------ Verificações --------------- * /
		assertTrue(gerCliente.validaIdade(gerCliente.pesquisaCliente(idCli1).getIdade()));

	}
	
	/*
	 * Teste para validar uma idade zerada
	 * Idade = 0
	 */

	@Test(expected = IdadeNaoPermitidaException.class)
	public void validaIdadeZerada() throws IdadeNaoPermitidaException {
		int idade = 0;

		// * ------------ Execução --------------- * /
		gerCliente.pesquisaCliente(idCli1).setIdade(idade);

		// * ------------ Verificações --------------- * /
		assertTrue(gerCliente.validaIdade(gerCliente.pesquisaCliente(idCli1).getIdade()));

	}
	
	/*
	 * Teste para validar uma idade negativa
	 * Idade = -1
	 */

	@Test(expected = IdadeNaoPermitidaException.class)
	public void validaIdadeNegativa() throws IdadeNaoPermitidaException {
		int idade = -1;

		// * ------------ Execução --------------- * /
		gerCliente.pesquisaCliente(idCli1).setIdade(idade);

		// * ------------ Verificações --------------- * /
		assertTrue(gerCliente.validaIdade(gerCliente.pesquisaCliente(idCli1).getIdade()));

	}
	
}