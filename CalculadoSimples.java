	
package calculadosimples;

import java.util.Scanner;
public class CalculadoSimples {
	
	
	public static void main(String[] args) {
		double n1, n2;
		double soma, subtracao, multiplicacao, divisao;
		int op;
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		 System.out.println("Informe o primeiro valor: ");
		 n1 = entrada.nextDouble ();
		 System.out.println("Informe o segundo valor: ");
		 n2 = entrada.nextDouble();
		 
		System.out.println("######SELECIONE UMA OPERA��O######");
		System.out.println("[1] - SOMAR");
		System.out.println("[2] - SUBTRAIR");
		System.out.println("[3] - MULTIPLICAR");
		System.out.println("[4] - DIVIDIR");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>Digite sua op��o: ");
		op = entrada.nextInt();
		
		switch(op) {
		   case 1:
			   soma = n1+n2;
			   System.out.println("A soma �: "+soma);
			   break;
			
		   case 2:
			   subtracao = n1-n2;
			   System.out.println("A subtra��o �: "+subtracao);
			   break;
			   
		   case 3:
			   multiplicacao = n1*n2;
			   System.out.println("A multiplica��o �: "+multiplicacao);
			   break;
			   
		   case 4:
			   if(n1<n2) {
				   System.out.println("Imposs�vel realizar o calculo");   
			   }
			   else {
			     divisao = n1/n2;
			     System.out.println("A divis�o �: "+divisao);
			   }
			   break;
		
			default:
				System.out.println("OPERA��O INV�LIDA!!!");
				
			  
			}
			   
		}
		
	}
