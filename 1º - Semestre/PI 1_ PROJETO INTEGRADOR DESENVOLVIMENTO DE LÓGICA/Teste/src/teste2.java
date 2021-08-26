import java.util.Scanner;

public class teste2 {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		String[] nomeGeral = new String[50];

		int completos = 0;
		
		boolean condicao = true;

		while (condicao) {

			System.out.println("-------->LISTA DE NOMES<--------");
			System.out.println("1 -> ADICIONAR UM NOME NOVO");
			System.out.println("2 -> APRESENTAR OS NOMES");
			System.out.println("3 -> PESQUISAR UM NOME");
			System.out.println("4 -> REMOVER UM NOME");
			System.out.println("0 -> SAIR");

			int primeiraOpcao = leitor.nextInt();

			switch (primeiraOpcao) {
			case 1:
				System.out.println("\nPor Favor Digite o Nome a Ser Inserido: ");
				String nomeGeral2 = leitor.next();

				boolean listaCheia = true;

				for (int i = 0; i < nomeGeral.length; i++) {

					if (nomeGeral[i] == null) {
						listaCheia = false;
						break;
					}
				}

				if (listaCheia) {
					System.out.println("DESCULPE!! Sua Lista Ja Esta Cheia, Por Favor Remova Algum!");
					break;
				}

				boolean nomeJaExistente = false;
				for (int i = 0; i < nomeGeral.length; i++) {

					if (nomeGeral[i] != null) {
						if (nomeGeral[i].toLowerCase().equals(nomeGeral2.toLowerCase())) {
							System.out.println("O nome informado jÃ¡ existe na lista!");
							nomeJaExistente = true;
							break;
						}
					}
				}

				if (!nomeJaExistente) {
					nomeGeral[completos] = nomeGeral2;
					System.out.printf("%d - %s NOME Adicionado com SUCESSO!!\n", (completos + 1), nomeGeral2);
					completos++;
				}
				break;

			case 2:
				boolean listaSemNada = true;
				for (int i = 0; i < nomeGeral.length; i++) {

					if (nomeGeral[i] != null)
						listaSemNada = false;
				}
				if (listaSemNada) {
					System.out.println("A Sua Lista De Nomes Esta Vazia!");
				}

				else {
					System.out.println("MOSTRANDO Todos Os Nomes da Lista!");
					for (int i = 0; i < nomeGeral.length; i++) {
						if (nomeGeral[i] != null)
							System.out.println((i + 1) + " - " + nomeGeral[i]);
					}
				}
				break;

			case 3:
				System.out.println("\nINSIRA o Nome a Ser Procurado: ");
				String pesquisaDeNome = leitor.next();

				System.out.println("O Nome Que Encontramos Foi:");

				boolean nomeQueJaExiste = false;
				for (int i = 0; i < nomeGeral.length; i++) {

					if (nomeGeral[i] != null) {
						if (nomeGeral[i].toLowerCase().contains(pesquisaDeNome.toLowerCase())) {
							nomeQueJaExiste = true;
							System.out.println((i + 1) + " --- " + nomeGeral[i]);
						}
					}
				}

				if (!nomeQueJaExiste) {
					System.out.println(
							"DESCULPE! Esse Nome Nao foi Encontrado na Lista, Verifique Se Nao Digitou Errado");
				}
				break;

			case 4:
				String[] nomesAuxiliares = new String[nomeGeral.length];
				System.out.println("Por Favor, Digite o Nome Que Deseja Deletar da Lista: ");
				String deleteDeNome = leitor.next();

				boolean deletarNome = false;
				for (int i = 0; i < nomeGeral.length; i++) {
					if (nomeGeral[i] != null) {
						if (nomeGeral[i].toLowerCase().equals(deleteDeNome.toLowerCase())) {
							nomeGeral[i] = null;
							deletarNome = true;
							break;
						}
					}
				}

				if (deletarNome) {
					int contador = 0;

					for (int i = 0; i < nomeGeral.length; i++) {

						
							if (nomeGeral[i] == null && nomeGeral[i + 1] != null) {
								nomesAuxiliares[contador] = nomeGeral[i + 1];
								contador++;
								i++;
							} else if (nomeGeral[i] != null) {
								nomesAuxiliares[contador] = nomeGeral[i];
								contador++;
							}
						

						
					}

					nomeGeral = nomesAuxiliares;
					System.out.printf("O Nome %s Foi Apagado com Sucesso!\n", deleteDeNome);
				} else {
					System.out.printf("O Nome %s NAO Foi Encontrado!\n", deleteDeNome);
				}
				break;

			case 0:
				condicao = false; 
				break;

			default:
				System.out.println("OPCAO INVALIDA!");
				break;
			}
		}
	}

}
