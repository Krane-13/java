class IMC{
    private String nome;
    private float peso;
    private float altura;

    public IMC(String nome, float peso, float altura){
        setNome(nome);
        setPeso(peso);
        setAltura(altura);
    }

    public void setNome(String nome){
		// remover todos os espaços em branco e depois contar os caracteres
	
		// cria uma variavel temporária para armazenar o nome sem os espaços
		String str = nome.replace(" ", "");
		
		if (str.length() >= 2){
			this.nome = nome;
		} else {
			System.out.printf("Preencha um nome válido\n");
		}
	}

    public String getNome(){
        return nome;
    }

    public void setPeso(float p){
        if(p > 0){
            this.peso = p;
        } else{
            System.out.printf("Preencha com um peso válido\n");
        }
    }

    public float getPeso(){
        return peso;
    }

    public void setAltura(float a){
        if(a > 0){
            this.altura = a;
        }else{
            System.out.printf("Preencha com uma altura válido\n");
        }
    }

    public float getAltura(){
        return altura;
    }

    /*public void result(float re) {
        this.result = re;
		re = peso / (altura*altura);
    }

    public void setResult(float r){
        //this.result = r;
        r = peso / (altura*altura);
        //this.result = r;

    }

    public float getResult(){
        return result;
    }*/
    
     
    public void mostrar(){
        float result = peso / (altura*altura);
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Peso: %s\n", peso);
        System.out.printf("Altura: %s\n", altura);
        //System.out.printf("imc: %.2f\n", result);


        if(result < 18.5){
            System.out.printf("Seu IMC é: %.2f\n está em estado de MAGREZA", result);
        }
        if(result >= 18.5 && result < 24.9){
            System.out.printf("Seu IMC é: %.2f\n está em estado NORMAL", result);
        }
        if(result > 24.9 && result < 29.9){
            System.out.printf("Seu IMC é: %.2f\n está em estado SOBREPESO", result);
        }
        if(result > 30 && result < 34.9){
            System.out.printf("Seu IMC é: %.2f\n está em estado OBESIDADE GRAU 1", result);
        }
        if(result > 35 && result < 39.9){
            System.out.printf("Seu IMC é: %.2f\n está em estado OBESIDADE GRAU 2", result);
        }
        if(result > 40 ){
            System.out.printf("Seu IMC é: %.2f\n está em estado OBESIDADE GRAU 3", result);
        }
        System.out.printf("\n--------------------\n");
    }
}