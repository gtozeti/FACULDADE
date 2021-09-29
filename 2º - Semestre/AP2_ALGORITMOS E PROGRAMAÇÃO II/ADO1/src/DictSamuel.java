import java.io.BufferedReader;
import java.io.FileReader;

public class DictSamuel {

	//Cria��o do vetor do dicion�rio do Samuel com 1000 posi��es
	public static String dictSamuel[] = new String[1000];
	
	//Contabiliza��o do total de palavras cadastradas
	public static int totalPalavras = 0;

	public static void main(String[] args) throws Exception {
		
		analiseArquivo("Arquivo.txt");
		
		for (int i = 0; i < totalPalavras; i++) {
			System.out.println(dictSamuel[i]);
		}
		System.out.println("total de palavras diferentes no dicionario = " + totalPalavras);

	}

	// Fun��o para ler as palavras do arquivo "Arquivo.txt"
	public static void analiseArquivo(String nomeArquivo) throws Exception {

		FileReader arquivo = new FileReader(nomeArquivo);
		BufferedReader leitor = new BufferedReader(arquivo);

		boolean cond = true;	//Variav�l para controle do total de palavras
		String linha; 			//Variav�l para receber cada palavra de uma frase
		String frase[];			//Variav�l para receber as frases de cada linha do documento

		//Enquanto o documento n�o retonar null, o la�o l� as linhas dispon�veis
		while (cond) {
			linha = leitor.readLine();
			if (linha == null) {
				break;
			}

			frase = linha.toLowerCase().split(" ");

			//Ao armazenar cada palavra da frase de cada linha, se inicia a verifica��o de cada palavra armazenada no vetor
			for (int i = 0; i < frase.length; i++) {

				//Por conta da ocorr�ncia de gerar palavras vazias com o m�todo split(), foi inclu�da essa verifica��o
				if (!frase[i].isEmpty()) {
					
					//Caso n�o exista nenhuma palavra no dicion�rio, ela � inclu�da diretamente
					if (totalPalavras == 0) {
						dictSamuel[totalPalavras] = frase[i];
						totalPalavras++;
					} else {
						
						//Verifica se o total de palavras j� foi preenchido
						if (totalPalavras == dictSamuel.length) {
							cond = false;
							break;
						}
						
						//Verifica��o se a palavra j� consta no dicion�rio, atrav�s da busca bin�ria
						if (!verificaDict(frase[i])) {
							
							//Caso a a palavra n�o conte no dicion�rio ela � inserida 
							populaDict(dictSamuel, frase[i]);
						}
					}

				}
			}

		}

		leitor.close();

	}

	//Fun��o de busca bin�ria para verificar se a palavra j� consta no dicion�rio
	public static boolean verificaDict(String palavra) {

		int inicio = 0;
		int fim = totalPalavras - 1;
		int meio;
		
		//Manipula��o da "setoriza��o" do vetor para encontrar se o elemento est� ou n�o dentro do vetor
		while (inicio <= fim) {
			meio = (inicio + fim) / 2;
			
			//Para obter um valor n�merico para a quest�o de maior ou menor da String, foi utilizado o m�todo compareTo 
			//para identificar se a String � "maior" ou "menor" que a posi��o do "meio"
			
			if (palavra.compareTo(dictSamuel[meio]) < 0) {
				fim = meio - 1;
			}
			else if (palavra.compareTo(dictSamuel[meio]) > 0) {
				inicio = meio + 1;
			} else {
				return true;
			}
		}
		return false;
	}

	//Fun��o para fazer a inser��o da nova palavra de forma ordenada
	public static void populaDict(String[] v, String frase) {

		//Inser��o da nova palavra na �ltima posi��o
		dictSamuel[totalPalavras] = frase;

			//Reacoloca��o da nova palavra no posi��o ordenada
			int j = totalPalavras;
			String x = v[j];
			while (j > 0 && x.compareTo(v[j - 1]) < 0) {
				v[j] = v[j - 1];
				j--;

			}
			v[j] = x;
		
		totalPalavras++;

	}

}
