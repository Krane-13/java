//import para ler os dados do teclado
import java.util.Scanner;
class Peso{
	public static void main(String args []){
		//declaracao das variaveis necessarias
		float peso = 0;
		String nome = "";
		
		float menorPeso = 0; //vou inicializar 
		String nomeMenor = "";
		
		for(int i =0; i<3; i++){
			//lendo as inf do teclado
			Scanner sc = new Scanner(System.in);
			System.out.println("digite o nome");
			nome = sc.nextLine();
			
			System.out.println("Digite o peso");
			peso = sc.nextFloat();
			
			//validacao do peso (Só impede valores)
			if(peso > 0 ){
				// inicializando o menor peso com
				if(i == 0){
					nomeMenor = nome;
					menorPeso = peso;
					}
				// compara os pesos lidos em busca 
				if(peso < menorPeso){
					menorPeso =peso;
					nomeMenor = nome;
					
					}
				}
			}
			System.out.printf("O menor peso encontrado foi %.2f e pertence a %s", menorPeso, nomeMenor);
	}
}
