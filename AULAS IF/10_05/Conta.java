//importar a class para gerar o numero aleatorio
import java.util.Random;

class Conta {
	String nome;
	String cpf;
	float saldo;
	int numero; // refere-se ao numero da conta
	
	public void imprimirExtrato(){
		System.out.printf("Cliente: %s ", nome);
		System.out.printf("\nCPF: %s ", cpf);
		System.out.printf("\nSaldo %.2f", saldo);
		System.out.printf("\nN. conta: %d ", numero);
		System.out.printf("\n------------------\n");
		}
		
	//metodo depositar adiciona dinheiro ao saldo do cliente
	public boolean depositar(float valor){
		if(valor > 0){
			saldo = saldo + valor; //efetivando o deposito
			return true;
		}else {
			//vai retornar false ao tentar depositar um valor inválido
			return false;
		}
	}
	//TO-DO metodo sacar
	
	// criando um metodo construtor para a conta
	public Conta(String parametro_nome, String parametro_cpf){
		//copiando os parametros que estao sendo recebidos pra dentro
		//dos atributos da classe
		nome = parametro_nome;
		cpf = parametro_cpf;
		
		saldo = 0; //saldo xerado ao abrir a conta
		
		//geramdo o numero de conta aleatorio
		Random gerador = new Random();
		numero = gerador.nextInt(1000);
	}
		
	public static void main(String args []){
		Conta contaRogerinho = new Conta("Rogérinho da Silva",  "002.334.723-63");
		//contaRogerinho.nome = "Rogérinho da Silva";
		//contaRogerinho.cpf = "002.334.723-63";
	//	contaRogerinho.saldo = 0; // saldo zerado pq a o conta foi aberta agora...
	//	contaRogerinho.numero = 63432; // numero aleatorio para a conta
		
		contaRogerinho.imprimirExtrato(); 
		if(contaRogerinho.depositar(2578.25f) ==true){
			System.out.println("Deposito efetivado com sucesso\n");
			}
		else {
			//vai retornar false ao tentar depositar um valor inválido
			System.out.println("Erro ao realizar o deposito. Verifique se os dados estão corretos");			
		}
		
		contaRogerinho.imprimirExtrato(); 
		
		Conta contaSamuka = new Conta("Samukinha Jardim", "777.777.777-77");
		if(contaSamuka.depositar(7777.77f) ==true){
			System.out.println("Deposito efetivado com sucesso\n");
			}
		else {
			//vai retornar false ao tentar depositar um valor inválido
			System.out.println("Erro ao realizar o deposito. Verifique se os dados estão corretos");			
		}
		contaSamuka.imprimirExtrato();
		
		
		}
}

