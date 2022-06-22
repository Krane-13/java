import java.util.Scanner;
// o comando acima cria um scanner
class Exer3{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos cacetinhos foram vendidos?");
		
		int paes = sc.nextInt();
		
		System.out.println("Quantas broas foram vendidas?");
		
		int broas = sc.nextInt();
		
		//cada pao custa 43cents
		// cada broa custa 2,45
		float valorArrecadado = (0.43f * paes) + (2.45f * broas);
		
		System.out.printf("A padaria arrecadou %.2f reais hoje. Voce deve guardar %.2f reais, que equivale a 30 do valor arrecadaddo", valorArrecadado, (valorArrecadado * 0.3));
		}
}
	
