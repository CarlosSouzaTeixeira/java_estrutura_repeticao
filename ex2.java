import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int a = 1;
		System.out.print("Digite um número: ");
		int num = leitor.nextInt();
		while (a <= num) {
			System.out.println(a);
			a++;
		}
	}

}
