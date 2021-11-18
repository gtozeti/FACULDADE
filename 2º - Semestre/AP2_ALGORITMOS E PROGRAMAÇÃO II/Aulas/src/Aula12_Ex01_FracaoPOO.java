
public class Aula12_Ex01_FracaoPOO {
	
	// atributos
	  private int numerador, denominador;

				  
			  // construtor
			  public Aula12_Ex01_FracaoPOO(int numerador, int denominador) {
			    this.numerador = numerador;
			    this.denominador = denominador;
			  }
			  // métodos
			  public Aula12_Ex01_FracaoPOO soma(Aula12_Ex01_FracaoPOO f) {
			    int num = numerador * f.denominador + f.numerador * denominador;
			    int den = denominador * f.denominador;
			    return new Aula12_Ex01_FracaoPOO(num, den);
			  }

			  public Aula12_Ex01_FracaoPOO multiplicacao(Aula12_Ex01_FracaoPOO f) {
			    int num = numerador * f.numerador;
			    int den = denominador * f.denominador;
			    return new Aula12_Ex01_FracaoPOO(num, den);
			  }



			  public void apresentar() {
			    System.out.println(numerador + "/" + denominador);
			  }

			  public int getNumerador() {
			    return numerador;
			  }

			  public void setNumerador(int numerador) {
			    this.numerador = numerador;
			  }

			  public int getDenominador() {
			    return denominador;
			  }

			  public void setDenominador(int denominador) {
			    this.denominador = denominador;
			  }
			

	}


