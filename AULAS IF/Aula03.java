class Aula03{
    public static void main(String args[]){
        // 0 = domingo
        // 6 = sabado
        int diaSemana = 5;
    switch(diaSemana) {
        case 0:
            System.out.println("Domingo");
            break;
        case 1:
            System.out.println("Segunda");
            break;
        case 2:
            System.out.println("Terça");
            break;
        case 3:
            System.out.println("Quarta");
            break;
        case 4:
            System.out.println("Quinta");
            break;
        case 5:
            System.out.println("Sexta");
            break;
        case 6:
            System.out.println("Sábado");
            break;
        //se não cair em nenhuma das condições acima
        //vai execute o que esta dentro do default
        default:
        System.out.println("Aviso: o dia da semana informado é inválido");
    }
}
}