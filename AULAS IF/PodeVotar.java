public class PodeVotar {
    public static void main(String args[]){
        int idade = 19;

        //teste
        if(idade >= 16 && idade < 18){
            System.out.println("Voto opcional, mas eh importante que exerça seu direito");
        } else if (idade >= 18){
            System.out.println("O voto é obrigatorio");
        } else{
            System.out.println("Você ainda não pode vota");
        }
    }
}
