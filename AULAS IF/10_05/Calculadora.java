class Calculadora{
	public float somar(float n1, float n2){
		float resultado = n1+n2;
		return resultado;
	}
	
	public float sub(float n1, float n2){
		float resultado = n1 -n2;
		return resultado;
	}
		
	public static void main(String[] args){
		Calculadora calcComum = new Calculadora();
		
		float resultSoma = calcComum.somar(161, 158);
		System.out.printf("O resultado soma eh: %.2f", resultSoma);
		float resultSub = calcComum.sub(15, 5);
		System.out.printf("\nO resultado div eh %.2f", resultSub);
		
		//calcComum.somar(16, 15);
	}	
		
	
}
