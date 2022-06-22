import java.util.Scanner;

class Imc{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite seu peso: ");
		float peso = sc.nextFloat();
		
		System.out.println("digite sua altura em metros: ");
		float altura = sc.nextFloat();
		
		float imc = peso / (altura*altura);
		
		if (imc < 18.5){
			System.out.println("Voc� est� com MAGREZA (imc inferior a 18,5)");
			
		}else if (imc > 18.5 && imc <24.9){
			System.out.println("Voc� est� NORMAL (imc entre  18,5 e 24.9)");
			
		}else if(imc > 25.0 && imc < 29.9){
			System.out.println("Voc� est� com SOBREPESO (imc entre  25,0 e 29,9)");
			
		}else if(imc > 30.0 && imc < 39.9){
			System.out.println("Voc� est� com OBESIDADE (imc entre  30,0 e 39,9)");
			
		} else{
			System.out.println("Voc� est� COM OBESIDADE GRAVE (maior que 40,0)");
		}
			
		
		System.out.printf("O IMC eh: %.2f",imc );
		}
}
