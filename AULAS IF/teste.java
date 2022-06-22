import java.util.Scanner;

class teste{
	public static void main (String args[]){
		
		float nota = 0;
		float somatoria = 0;
		int notasLidas = 0;
		for(int i = 0; i<3; i++){
			System.out.printf("Por favor, informe a nota %d: ", (i+1));
			Scanner sc = new Scanner(System.in);
			nota = sc.nextFloat();
			
			// codicao para nota valida
			if(nota >= 0 && nota <=10 ){
				somatoria = somatoria +nota;
				notasLidas++;
			}	
		}
		float media= somatoria/notasLidas;
		System.out.printf("Foram lidas %d e a media é: %.2f", notasLidas, media);
	}		
}
