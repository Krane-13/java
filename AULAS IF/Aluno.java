class Aluno{

	String nome;
	String nasc;
	String cpf;
	int matricula;
	String curso;
	
	public void mostrarAluno(){
		System.out.printf("Nome: %s \n Nascimento %s \n CPF: %s \n Matricula %s \n Curso: %s -----------------\n");
	}
	
	public static void main (String[] args){
		
		//criando um primeiro aluno usando Orientado a objetos
		Aluno aluno1= new Aluno();
		
		//preencher os atributos do aluno01
		aluno1.nome = "Emilio";
		aluno1.nasc = "16/06/2005";
		aluno1.cpf = "000.000.00-00";
		aluno1.matricula = 456734;
		aluno1.curso = "tecnico informatica"; 
		
		Aluno aluno2= new Aluno();

		
		//criando os atributos do aluno02
		aluno2.nome = "Matheus";
		aluno2.nasc = "13/05/2005";
		aluno2.cpf = "100.000.00-00";
		aluno2.matricula = 456774;
		aluno2.curso = "tecnico informatica";
		
		Aluno aluno3= new Aluno();

		
		//criando aluno03
		aluno3.nome = "Samuel";
		aluno3.nasc = "07/07/2005";
		aluno3.cpf = "000.050.00-00";
		aluno3.matricula = 856734;
		aluno3.curso = "tecnico informatica";
		
		//mostrando os dados do aluno na tela
		aluno1.mostrarAluno();
		
		//mostrar os dados do aluno2 na tela
		aluno2.mostrarAluno();
		
		//mostrar aluno3
		aluno3.mostrarAluno();
		}
}
