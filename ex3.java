import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		double num, soma = 0;
		Scanner leitor = new Scanner(System.in);
		int cont = 0;
		while (cont <20) {
			System.out.print("Digite um n�mero:");
			num = leitor.nextDouble();
			cont++;
			soma=num+soma;
			}
System.out.println("Soma dos 20 n�meros: " +soma);
System.out.println("M�dia dos 20 n�meros: " +soma/20);
		}
	
	}
