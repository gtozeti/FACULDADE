
/* Teste de Classe Aluno Gustavo Tozeti Herculano - 1142275851 */
/* Teste de Classe Aluno Matheus Cavalcanti de Arruda - 1142097286 */


package negocio;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.List;

public class GerenciadoraContasTest {

    private GerenciadoraContas gerConta;
    private int idCc1 = 1;
    private int idCc2 = 2;

    private double saldo = 0;
    private double transferencia = 0;


    @Before
    public void setUp() {
        ContaCorrente cc1 = new ContaCorrente(idCc1, 0,true);
        ContaCorrente cc2 = new ContaCorrente(idCc2, 0,true);

        List<ContaCorrente> contasCorrentesTeste = new ArrayList<>();

        contasCorrentesTeste.add(cc1);
        contasCorrentesTeste.add(cc2);

        gerConta = new GerenciadoraContas(contasCorrentesTeste);
    }

    @After
    public void tearDown() {
        gerConta.removeConta(idCc1);
        gerConta.removeConta(idCc2);
    }


    /*
     * Teste de transferência de um valor da conta de um cliente para outro
     * Saldo suficiente em ambas as contas
     * */
    @Test
    public void cenario_1() {

        //* ------------ Montagem do Cenário --------------- * /
        saldo = 200;
        transferencia = 100;
        gerConta.pesquisaConta(idCc1).setSaldo(saldo);

        //* ------------ Execução --------------- * /
        double valor_inicial = gerConta.pesquisaConta(idCc2).getSaldo();
        boolean resultado = gerConta.transfereValor(idCc1,transferencia,idCc2);

        //* ------------ Verificações --------------- * /
        assertTrue(resultado);
        assertThat(gerConta.pesquisaConta(idCc1).getSaldo(), is(saldo - transferencia));
        assertThat(gerConta.pesquisaConta(idCc2).getSaldo(), is(valor_inicial + transferencia));

    }


    /*
     * Teste de transferência de um valor da conta de um cliente para outro
     * Saldo insuficiente e positivo na Conta 1
     * */
    @Test
    public void cenario_2() {

        //* ------------ Montagem do Cenário --------------- * /
        saldo = 100;
        transferencia = 200;
        gerConta.pesquisaConta(idCc1).setSaldo(saldo);

        //* ------------ Execução --------------- * /
        double valor_inicial = gerConta.pesquisaConta(idCc2).getSaldo();
        boolean resultado = gerConta.transfereValor(idCc1,transferencia,idCc2);

        //* ------------ Verificações --------------- * /
        assertTrue(resultado);
        assertThat(gerConta.pesquisaConta(idCc1).getSaldo(), is(saldo - transferencia));
        assertThat(gerConta.pesquisaConta(idCc2).getSaldo(), is(valor_inicial + transferencia));

    }

    /*
     * Teste de transferência de um valor da conta de um cliente para outro
     * Saldo insuficiente e negativo na Conta 1
     * */
    @Test
    public void cenario_3() {

        //* ------------ Montagem do Cenário --------------- * /
        saldo = -100;
        transferencia = 200;
        gerConta.pesquisaConta(idCc1).setSaldo(saldo);

        //* ------------ Execução --------------- * /
        double valor_inicial = gerConta.pesquisaConta(idCc2).getSaldo();
        boolean resultado = gerConta.transfereValor(idCc1,transferencia,idCc2);

        //* ------------ Verificações --------------- * /
        assertTrue(resultado);
        assertThat(gerConta.pesquisaConta(idCc1).getSaldo(), is(saldo - transferencia));
        assertThat(gerConta.pesquisaConta(idCc2).getSaldo(), is(valor_inicial + transferencia));

    }

    /*
     * Teste de transferência de um valor da conta de um cliente para outro
     * Saldo insuficiente em ambas as contas
     * */
    @Test
    public void cenario_4() {

        //* ------------ Montagem do Cenário --------------- * /
        saldo = -100;
        transferencia = 200;
        gerConta.pesquisaConta(idCc1).setSaldo(saldo);
        gerConta.pesquisaConta(idCc2).setSaldo(-100);

        //* ------------ Execução --------------- * /
        double valor_inicial = gerConta.pesquisaConta(idCc2).getSaldo();
        boolean resultado = gerConta.transfereValor(idCc1,transferencia,idCc2);

        //* ------------ Verificações --------------- * /
        assertTrue(resultado);
        assertThat(gerConta.pesquisaConta(idCc1).getSaldo(), is(saldo - transferencia));
        assertThat(gerConta.pesquisaConta(idCc2).getSaldo(), is(valor_inicial + transferencia));

    }

}