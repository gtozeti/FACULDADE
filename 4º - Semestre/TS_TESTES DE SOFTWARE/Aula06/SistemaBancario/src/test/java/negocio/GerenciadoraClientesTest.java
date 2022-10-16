package negocio;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GerenciadoraClientesTest {

    private GerenciadoraClientes gerCliente;
    private int idCli1 = 1;
    private int idCli2 = 2;


    @BeforeEach
    void setUp() {
        Cliente cli1 = new Cliente(idCli1, "Pedro",34, "pedro@teste.com",43465645,true);
        Cliente cli2 = new Cliente(idCli2, "José",54, "jose@teste.com",4507740,false);

        List<Cliente> clientesDoBancoTeste = new ArrayList<>();

        clientesDoBancoTeste.add(cli1);
        clientesDoBancoTeste.add(cli2);

        gerCliente = new GerenciadoraClientes(clientesDoBancoTeste);
    }

    @AfterEach
    void tearDown() {
        gerCliente.removeCliente(idCli1);
        gerCliente.removeCliente(idCli2);
   }

    /*
     * Teste de pesquisa de um cliente a partir do ID
     * */
    @Test
    void pesquisaCliente() {

        //* ------------ Execução --------------- * /
        Cliente cliente =  gerCliente.pesquisaCliente(idCli1);

        //* ------------ Verificações --------------- * /
        assertTrue(cliente.getId() == idCli1);

    }

    /*
    * Teste de remoção de um cliente a partir do ID
    * */
    @Test
    void removeCliente() {

        //* ------------ Execução --------------- * /
        boolean removido = gerCliente.removeCliente(idCli2);

        //* ------------ Verificações --------------- * /
        assertTrue(removido);
        assertTrue(gerCliente.getClientesDoBanco().size() == 1);
        assertNull(gerCliente.pesquisaCliente(idCli2));
    }

    /*
     * Teste para validar um conjunto de idades
     * */
    @Test
    void validaIdade(){
        int[] idades = {17,18,19,66,65,64,0,-1};

        for (int idade: idades) {
            //* ------------ Execução --------------- * /
            gerCliente.pesquisaCliente(idCli1).setIdade(idade);

            //* ------------ Verificações --------------- * /
            try {
                assertTrue(gerCliente.validaIdade(gerCliente.pesquisaCliente(idCli1).getIdade()));
            }
            catch (IdadeNaoPermitidaException ex){
                assertThrows(ex.getClass(),() -> gerCliente.validaIdade(gerCliente.pesquisaCliente(idCli1).getIdade()));

            }
        }

    }
}