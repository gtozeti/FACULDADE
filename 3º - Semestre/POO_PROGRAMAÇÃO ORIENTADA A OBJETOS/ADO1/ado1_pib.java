import java.io.*;
import java.util.ArrayList;

/**
 * Class Description . . .
 *
 * @author: Gustavo Tozeti Herculano
 * @version: 1.0
 *           Main Class File: topAXX.java
 *           File: Structure.java
 *           Date: 21/02/2022
 */

public class ado1_pib {

    public static void main(String[] args) {

        // Nome dos arquivos com os caminhos relativos
        String file1 = "./pib.txt";
        String file2 = "./regioes.txt";

        // String[][] dadosPIB = leituraPIB(file1);
        // imprimePIB(dadosPIB);

        leituraRegioes(file2);

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

    public static void leituraRegioes(String file2){
        ArrayList<String> regioes = new ArrayList<>(); // ArrayList para armazenar as regioes

        
        String linha = null, frase =null;

        try {

            // Abrir o arquivo com a codificação "UTF-8"
            BufferedReader leituraBuff = new BufferedReader(new InputStreamReader(new FileInputStream(file2), "UTF-8"));

            // Loop para leitura de cada linha do arquivo e armazenamento nos ArraysList
            while ((linha = leituraBuff.readLine()) != null) {
                frase = linha;
                if(frase.isEmpty()){
                    System.out.println("aqui");
                }
                System.out.println();

            }

    }
    catch(Exception e){
        System.out.println(e);
    }

}
}