import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		int num, soma = 0;
		Scanner leitor = new Scanner(System.in);
		int a = 0, maior = 0, cont = 0;
		while (cont <15) {
			System.out.print("Digite um n�mero:");
			num = leitor.nextInt();
			cont++;
			if(num > maior){		
				maior = num;
			}
			
			else if(num < maior){	
				maior = maior;
			}
		
		}
		System.out.println("Maior n�mero fornecido: "+ maior);
	}}