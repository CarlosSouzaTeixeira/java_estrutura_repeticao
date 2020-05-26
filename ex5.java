import java.util.Scanner;
public class ex5 {

	public static void main(String[] args) {
		 double  ssalario=1000, salario=0, altura, media, soma =0, maior=0, menor =3;
		 String sexo;
		 int cont =1, cont1000=0;
		 Scanner leitor = new Scanner (System.in);
		 
		 do {
			 System.out.print("Digite o sexo (M ou F): ");
			 sexo=leitor.next();
			 System.out.print("Digite o salario em R$: ");
			 salario= leitor.nextDouble();
			 System.out.print("Digite a altura em metros(Ex: 1,7): ");
			 altura= leitor.nextDouble();
			 cont++;
			 soma =soma + salario;
			 media=soma/20;
			  if (altura>maior) {
				 maior =altura;}
			  
			 
			 if (altura<menor ) {
				 menor=altura;}
			 
		 	if (salario < ssalario && sexo.contentEquals("F")) {
					 cont1000++;}
					 
				 
			 }
			 while(cont<=20);
		 	 System.out.printf("Media de sálario do grupo: %.2f: \n",media);
			 System.out.println("Maior altura do grupo: "+ maior+" metros e menor altura do grupo: "+menor+" metros");
			 System.out.println("Mulheres com sálario até 1000R$: "+cont1000);
		 }
}
		