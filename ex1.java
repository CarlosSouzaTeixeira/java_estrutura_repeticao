import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		double num;
		Scanner leitor = new Scanner(System.in);
		int cont = 0;
		while (cont <10) {
			cont++;
			System.out.print("Digite um n�mero:");
			num = leitor.nextDouble();

			if (num >= 0) {
				System.out.println("O n�mero " + num + " � positivo");
			}else {
				System.out.println("O n�mero " + num + " � negativo");
			}

		}
	}}
