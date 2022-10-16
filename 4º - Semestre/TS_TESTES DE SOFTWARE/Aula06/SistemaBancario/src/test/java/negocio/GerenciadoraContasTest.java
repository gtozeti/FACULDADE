package negocio;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GerenciadoraContasTest {

    private GerenciadoraContas gerConta;
    private int idCc1 = 1;
    private int idCc2 = 2;

    private int saldo = 0;
    private int transferencia = 0;


    @BeforeEach
    void setUp() {
        ContaCorrente cc1 = new ContaCorrente(idCc1, 0,true);
        ContaCorrente cc2 = new ContaCorrente(idCc2, 0,true);

        List<ContaCorrente> contasCorrentesTeste = new ArrayList<>();

        contasCorrentesTeste.add(cc1);
        contasCorrentesTeste.add(cc2);

        gerConta = new GerenciadoraContas(contasCorrentesTeste);
    }

    @AfterEach
    void tearDown() {
        gerConta.removeConta(idCc1);
        gerConta.removeConta(idCc2);
    }


    /*
     * Teste de transferência de um valor da conta de um cliente para outro
     * Saldo suficiente em ambas as contas
     * */
    @Test
    void cenario_1() {

        //* ------------ Montagem do Cenário --------------- * /
        saldo = 200;
        transferencia = 100;
        gerConta.pesquisaConta(idCc1).setSaldo(saldo);

        //* ------------ Execução --------------- * /
        double valor_inicial = gerConta.pesquisaConta(idCc2).getSaldo();
        boolean resultado = gerConta.transfereValor(idCc1,transferencia,idCc2);

        //* ------------ Verificações --------------- * /
        assertTrue(resultado);
        assertEquals(gerConta.pesquisaConta(idCc1).getSaldo(), saldo - transferencia);
        assertEquals(gerConta.pesquisaConta(idCc2).getSaldo(),valor_inicial + transferencia );

    }


    /*
     * Teste de transferência de um valor da conta de um cliente para outro
     * Saldo insuficiente e positivo na Conta 1
     * */
    @Test
    void cenario_2() {

        //* ------------ Montagem do Cenário --------------- * /
        saldo = 100;
        transferencia = 200;
        gerConta.pesquisaConta(idCc1).setSaldo(saldo);

        //* ------------ Execução --------------- * /
        double valor_inicial = gerConta.pesquisaConta(idCc2).getSaldo();
        boolean resultado = gerConta.transfereValor(idCc1,transferencia,idCc2);

        //* ------------ Verificações --------------- * /
        assertFalse(resultado);
        assertEquals(gerConta.pesquisaConta(idCc1).getSaldo(), saldo);
        assertEquals(gerConta.pesquisaConta(idCc2).getSaldo(),valor_inicial);

    }

    /*
     * Teste de transferência de um valor da conta de um cliente para outro
     * Saldo insuficiente e negativo na Conta 1
     * */
    @Test
    void cenario_3() {

        //* ------------ Montagem do Cenário --------------- * /
        saldo = -100;
        transferencia = 200;
        gerConta.pesquisaConta(idCc1).setSaldo(saldo);

        //* ------------ Execução --------------- * /
        double valor_inicial = gerConta.pesquisaConta(idCc2).getSaldo();
        boolean resultado = gerConta.transfereValor(idCc1,transferencia,idCc2);

        //* ------------ Verificações --------------- * /
        assertFalse(resultado);
        assertEquals(gerConta.pesquisaConta(idCc1).getSaldo(), saldo);
        assertEquals(gerConta.pesquisaConta(idCc2).getSaldo(),valor_inicial);

    }

    /*
     * Teste de transferência de um valor da conta de um cliente para outro
     * Saldo insuficiente em ambas as contas
     * */
    @Test
    void cenario_4() {

        //* ------------ Montagem do Cenário --------------- * /
        saldo = -100;
        transferencia = 200;
        gerConta.pesquisaConta(idCc1).setSaldo(saldo);
        gerConta.pesquisaConta(idCc2).setSaldo(-100);

        //* ------------ Execução --------------- * /
        double valor_inicial = gerConta.pesquisaConta(idCc2).getSaldo();
        boolean resultado = gerConta.transfereValor(idCc1,transferencia,idCc2);

        //* ------------ Verificações --------------- * /
        assertFalse(resultado);
        assertEquals(gerConta.pesquisaConta(idCc1).getSaldo(), saldo);
        assertEquals(gerConta.pesquisaConta(idCc2).getSaldo(),valor_inicial);

    }

}