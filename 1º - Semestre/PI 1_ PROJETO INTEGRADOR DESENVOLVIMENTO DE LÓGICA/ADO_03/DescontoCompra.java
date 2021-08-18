import java.util.Scanner;

public class DescontoCompra {

	public static void main(String[] args) {

		float v_compra, t_desconto;
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o valor da compra: ");
		v_compra = entrada.nextFloat();

		if (v_compra >= 300) {

			t_desconto = ((v_compra * 20) / 100);

			System.out.printf("O valor do desconto foi de: R$ %.2f", t_desconto);
			System.out.printf("\nO valor de desconto obtido, foi de 20%%");

		} else {

			t_desconto = ((v_compra * 15) / 100);

			System.out.printf("O valor do desconto foi de: R$ %.2f", t_desconto);;
			System.out.printf("\nO valor de desconto obtido, foi de 15%%");

		}

	}

}
