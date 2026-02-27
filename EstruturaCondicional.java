import java.util.Scanner;

void main() {

    Scanner sc = new Scanner(System.in);
    int horario;

    int horarioMarcado;


    System.out.println("Que horas são??");
    horario = sc.nextInt();

    if (horario < 12){
        System.out.println("Bom dia");
    } else if (horario < 18 ) {
        System.out.println("Boa tarde");
    } else {
        System.out.println("Boa noite");
    }

    System.out.println("Qual horário marcado??");
    horarioMarcado = sc.nextInt();

    System.out.println("Falta " + (horarioMarcado - horario) + "h ainda. ");
    System.out.println("E qual dia da semana??");

    String dia = "";
    int x = sc.nextInt();

    switch (x){
        case 1:
            dia = "Domingo";
            break;
        case 2:
            dia = "Segunda";
            break;
        case 3:
            dia = "Terça";
            break;
        case 4:
            dia = "Quarta";
            break;
        case 5:
            dia = "Quinta";
            break;
        case 6:
            dia = "Sexta";
            break;
        case 7:
            dia = "Sábado";
            break;
    }

    System.out.println("Consulta marcada para " + dia);

    System.out.println("Qual a sua idade??");
    int idade = 0;
    if (idade < 18){
        idade = sc.nextInt();
        System.out.println("Favor informar um acompanhante");
    } else {
        System.out.println("Favor informar se está acompanhado");
    }
}