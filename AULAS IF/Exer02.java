import java.util.Scanner;

class Exer02{
	public static void main (String args[]){
			/*int num = 22;
			int sec = num + 1;
			int ant = num - 1;
			System.out.println("O numero escolhido: " + num + "\n SUCESSOR: " + sec + "\n ANTECESSOR: " + ant);
			*/
			
		Scanner sc = new Scanner(System.in);
		
		/*System.out.println("Digite 1� valor: ");
		float num1 = sc.nextFloat();
			if (num1 < 0 || num1 >10){
				num1=0;
	System.out.println("Op��o invalida");
			}
			
		System.out.println("Digite 2� valor: ");
		float num2 = sc.nextFloat();
			if (num2 < 0 || num2>10){
				num2=0;
	System.out.println("Op��o invalida");		
			}
			
		System.out.println("Digite 3� valor: ");
		float num3 = sc.nextFloat();
			if (num3 < 0 || num3>10){
				num3=0;
	System.out.println("Op��o invalida");
			}
		
		float soma = num1 + num2 + num3;
		//float media = soma / 3;
		
		
		
		System.out.println("1� valor: " + num1 + "\n2� valor: " + num2 + "\n3� valor: " + num3 );
		System.out.println("A soma dos valores � igual a: " + soma);
		System.out.println("A media dos valores � igual a: " +soma / 3);
		*/
		
		String [] lista;
		for(int i=0; i<10;i++){
		System.out.println("Digite um nome");
		String nome = sc.next();
		System.out.println("Digite um peso");
		float peso = sc.nextFloat();
		
		for(int i = 0; i < valor.length; i++){
			System.out.print("Digite o " +(i+1)+"º valor: ");
			valor[i] = sc.nextInt();
			if(valor[i] > maior){ 
				maior = valor[i];
			}
		}
		for (int j = 0; j < valor.length; j++) {
			if(valor[j] < menor){
				menor = valor[j];
			}
		}
		System.out.println("Maior valor = "+ maior);
		System.out.println("Menor valor = "+ menor);
	}
		
			
	
}

