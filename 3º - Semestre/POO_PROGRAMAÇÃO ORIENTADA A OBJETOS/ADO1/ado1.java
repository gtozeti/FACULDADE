import java.io.*;
import java.util.ArrayList;

/**
 * ADO1
 * Deseja-se um aplicativo capaz de tomar os dados em um arquivo de texto
 * contendo os PIBs por estado do Brasil (pib.txt) carregá-los na memória e executar
 * os seguintes itens:
 * 
 * a-) Imprimir na tela a lista de PIB por estado em percentual em relação ao total.
 * b-) Gerar um arquivo de saída (saida.txt) sumarizando (somando) o PIB por
 * regiões. 
 * 
 * Será fornecida uma lista de estados por regiões que deve ser lida do
 * arquivo regioes.txt
 * 
 * O aluno deve compilar, testar, empacotar e enviar para o instrutor nos devidos 
 * formatos
 *
 * @author: Gustavo Tozeti Herculano
 * @version: 1.0
 *           Main Class File: topAXX.java
 *           File: Structure.java
 *           Date: 21/02/2022
 */

public class ado1 {

    public static void main(String[] args) {

        // Nome dos arquivos com os caminhos relativos
        String file1 = "./pib.txt";
        String file2 = "./regioes.txt";

        String[][] dadosPIB = leituraPIB(file1);
        imprimePIB(dadosPIB);

        ArrayList<String[]> dadosRegioes = leituraRegioes(file2);
        geraArquivoSaida(dadosPIB, dadosRegioes);

    }

    /**
     * Função para realizar a leitura dos dados do arquivo pib.txt
     * 
     * @param file1 Arquivo pib
     * @return Uma matriz com os dados lidos
     */
    public static String[][] leituraPIB(String file1) {

        ArrayList<String> estados = new ArrayList<>(); // ArrayList para armazenar os estados
        ArrayList<String> valorPIB = new ArrayList<>(); // ArrayList para armazenar os valores dos PIBs

        String linha = null;
        String[] frase = new String[2];

        try {

            // Abrir o arquivo com a codificação "UTF-8"
            BufferedReader leituraBuff = new BufferedReader(new InputStreamReader(new FileInputStream(file1), "UTF-8"));

            // Loop para leitura de cada linha do arquivo e armazenamento nos ArraysList
            while ((linha = leituraBuff.readLine()) != null) {
                frase = linha.split(";");
                estados.add(frase[0]);
                valorPIB.add(frase[1]);

            }

            // Criando uma matriz com o tamanho de linhas correspondente ao tamanho de
            // estados lidos
            String[][] info = new String[estados.size()][2];

            // Inserção das informações dos estados e PIB, dentro da matriz
            for (int i = 0; i < estados.size(); i++) {
                info[i][0] = estados.get(i);
                info[i][1] = valorPIB.get(i);
            }

            leituraBuff.close();
            return info;

        }

        // Tratamento de erro, para caso o arquivo não exista
        catch (FileNotFoundException erro) {
            System.out.println("Arquivo " + file1 + " não existe: ");
        }

        // Tratamento de erro, para leitura do arquivo
        catch (IOException erro) {
            System.out.println("Erro na leitura do arquivo " + file1);
        }

        // Tratamento de algum outro erro que possa encontrar durante a execução da
        // função
        catch (Exception erro) {
            System.out.println("Foi encontrado o seginte erro na leitura do arquivo " + file1 + ": \n" + erro);
        }

        // Retorna null caso exista algum erro na leitura do arquivo
        return null;

    }

    /**
     * Função para imprimir o percentual do PIB em relação ao total
     * 
     * @param dados Dados lidos através do arquivo pib.txt
     */
    public static void imprimePIB(String[][] dados) {

        Float soma = 0.0f, percentual = 0.0f;

        // Loop para realizar o soma do PIB
        for (int i = 0; i < dados.length; i++) {

            soma += Float.parseFloat(dados[i][1]);

        }
        // Cabeçalho das informações
        System.out.printf("\n-- %-20s  --%s", "Cidade --", "Percentual do PIB em relação ao total --\n");

        // Loop para calcular e imprimir na tela o percentual de cada estado
        for (int j = 0; j < dados.length; j++) {

            percentual = (Float.parseFloat(dados[j][1]) * 100) / soma;
            System.out.printf("%-20s | %20.2f %%\n", dados[j][0], percentual);

        }
        System.out.println();

    }

    /**
     * Função para realizar a leitura dos dados do arquivo regioes.txt
     * 
     * @param file2 Arquivo regioes
     * @return Um ArrayList com os estados separados por regiões
     */
    public static ArrayList<String[]> leituraRegioes(String file2) {

        ArrayList<String[]> regioes = new ArrayList<>(); // ArrayList para armazenar as regioes
        ArrayList<String> informacoes = new ArrayList<>(); // ArrayList para armazenar os estados das regioes

        String linha = null, frase = null;

        try {

            // Abrir o arquivo com a codificação "UTF-8"
            BufferedReader leituraBuff = new BufferedReader(new InputStreamReader(new FileInputStream(file2), "UTF-8"));

            int index = 0;

            // Loop para leitura de cada linha do arquivo e armazenamento nos ArraysList
            while ((linha = leituraBuff.readLine()) != null) {
                frase = linha;
                if (frase.isEmpty()) {
                    String[] k = new String[informacoes.size()];
                    for (int i = 0; i < informacoes.size(); i++) {
                        k[i] = informacoes.get(i);
                    }
                    regioes.add(index, k);
                    informacoes.clear();
                    index++;
                } else {
                    informacoes.add(frase);
                }

            }
            String[] k = new String[informacoes.size()];
            for (int i = 0; i < informacoes.size(); i++) {
                k[i] = informacoes.get(i);
            }
            regioes.add(index, k);

            return regioes;
        }

        // Tratamento de erro, para caso o arquivo não exista
        catch (FileNotFoundException erro) {
            System.out.println("Arquivo " + file2 + " não existe: ");
        }

        // Tratamento de erro, para leitura do arquivo
        catch (IOException erro) {
            System.out.println("Erro na leitura do arquivo " + file2);
        }

        // Tratamento de algum outro erro que possa encontrar durante a execução da
        // função
        catch (Exception erro) {
            System.out.println("Foi encontrado o seginte erro na leitura do arquivo " + file2 + ": \n" + erro);
        }

        // Retorna null caso exista algum erro na leitura do arquivo
        return null;

    }

 
     /**
      * Função para gerar a escrita do arquivo saida.txt sumarizando os PIBs por regiões
      *
      * @param dadosPIB Matriz com os dados do PIB
      * @param dadosRegioes ArrayList com os dados das regiões
      */
    public static void geraArquivoSaida(String[][] dadosPIB, ArrayList<String[]> dadosRegioes) {

        // Nome do arquivo de saída com o caminho relativo
        String arquivoDeSaida = "./saida.txt";

        try {

            // Escrever o arquivo com a codificação "UTF-8"
            BufferedWriter escritaBuff = new BufferedWriter(
                    new OutputStreamWriter(new FileOutputStream(arquivoDeSaida), "UTF-8"));

            // Loop para comparação de Estado entre o ArrayList e a Matriz, para sumarização por regição                   
            for (int i = 0; i < dadosRegioes.size(); i++) {
                Float soma = 0.0f;
                for (int j = 1; j < dadosRegioes.get(i).length; j++) {
                    for (int k = 0; k < dadosPIB.length; k++) {
                        if (dadosRegioes.get(i)[j].equals(dadosPIB[k][0])) {
                            soma += Float.parseFloat(dadosPIB[k][1]);
                            break;
                        }
                    }
                }

                // Armazenando a frase para escrita do arquivo
                String info = "PIB da região " + dadosRegioes.get(i)[0] + " = " + soma.toString().format("%.2f", soma);

                // Escrita no arquivo
                escritaBuff.write(info);

                // Caso seja a última região, não adiciona uma linha vazia
                if (i != dadosRegioes.size()-1){

                    escritaBuff.newLine();
                }
            }
            // Fechar o arquivo
            escritaBuff.close();
        }

        // Tratamento de erro, para caso não seja possível a escrita no arquivo
        catch (IOException ex) {
            System.out.println("Erro de escrita em '" + arquivoDeSaida + "'");
        }

    }
}