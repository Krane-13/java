//criar um método construtor para a classse aluno. Ométodo deve inicializar todos os atributos da classe

//lembrando: método construtor não tem retorno & sempre têm o mesmo nome que a classe.

// importanto o random para usar na matricula

class aluno{
	String nome;
	String nasc;
	String cpf ;
	int matricula;
	String curso;
	
	public void dadosAluno(){
		System.out.printf("Aluno(a) %s", nome);
		System.out.printf("\nData de nascimento %s", nasc);
		System.out.printf("\nCPF; %s", cpf);
		System.out.printf("\nMatricula %s", matricula);
		System.out.printf("\nCurso: %s", curso);
	}
	
	public aluno(String parametro_nome, String parametro_nasc, String parametro_cpf, String parametro_curso, int parametro_matricula){
		nome = parametro_nome;
		nasc = parametro_nasc;
		cpf = parametro_cpf;
		curso = parametro_curso;
		matricula = parametro_matricula;
	}
	
	public static void main(String ars[]){
		aluno dadosSamuka = new aluno("Samuka", "07/07/2005", "777.777.777-77", "Informatica", 77777 );
		
	dadosSamuka.dadosAluno();
	}
}
