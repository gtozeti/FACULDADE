import java.io.BufferedReader;
import java.io.FileReader;

public class Aula03_Ex02_VariosDados {

	public static void main(String[] args) throws Exception {
		String v = lerVetor("ex02.txt");
		System.out.println("*** TEXTO LIDO ***");
        System.out.println(v);
    }
	
	public static String lerVetor(String nomeArquivo) throws Exception {
	    FileReader arquivo = new FileReader(nomeArquivo);
	    BufferedReader leitor = new BufferedReader(arquivo);
	    StringBuilder sb = new StringBuilder();
	    
	    String linha;
        while ((linha = leitor.readLine()) != null) {
            sb.append(linha);
            sb.append("\n");
        }
        leitor.close();
        return sb.toString();
	    	  
	  }
	}


