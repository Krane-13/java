import java.util.Scanner;

public class Desafio01 {
    public static void main(String args[]){
        /*float saldo = 10;
        float reajuste = saldo * 0.1f;
        float atual = saldo + reajuste;
        System.out.println("O seu reajuste foi de " + reajuste + " Você está com " + atual); 
        */

        /*float a = 1;
        float b = 1;
        float c = 1;
        float soma = a+b+c;
        float media = soma/3;
        System.out.println("Soma = " + soma + "\nmedia = " + media);
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um dia do mes");
        int dia = sc.nextInt();

        System.out.println("Digite um numero referente a um mes");
        int mes = sc.nextInt();
        //0=janeiro
        //11=dezembro
        switch(mes){
            case 0:
                System.out.println("Janeiro");
                break;
            case 1:
                System.out.println("Fevereiro");
                break;
            case 2:
                System.out.println("Março");
                break;
            case 3:
                System.out.println("Abril");
                break;
            case 4:
                System.out.println("Maio");
                break;
            case 5:
                System.out.println("Junho");
                break;
            case 6:
                System.out.println("Julho");
                break;
            case 7:
                System.out.println("Agosto");
                break;
            case 8:
                System.out.println("Setembro");
                break;
            case 9:
                System.out.println("Outrobro");
                break;
            case 10:
                System.out.println("Novembro");
                break;
            case 11:
                System.out.println("Dezembro");
                break;
        }
    System.out.println("Digite um valor referente ao ANO");
    int ano = sc.nextInt();
    System.out.print(ano);
    System.out.println(dia + " de "+ mes + " de " + ano);
    }
}
