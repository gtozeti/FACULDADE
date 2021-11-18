
public class Aula12_Ex01_MainPOO {

	public static void main(String[] args) {


		Aula12_Ex01_FracaoPOO f1 = new Aula12_Ex01_FracaoPOO(3, 4);
		Aula12_Ex01_FracaoPOO f2 = new Aula12_Ex01_FracaoPOO(5, 7);
		Aula12_Ex01_FracaoPOO soma = f1.soma(f2);
	    f1.apresentar();
	    f2.apresentar();
	    soma.apresentar();

	}

}
