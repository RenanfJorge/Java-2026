import java.util.Scanner;

void main (){

    Scanner sc = new Scanner(System.in);

    System.out.println("Coloque 2 numeros e irei somar, depois mais 2 e irei somar tambem \n" +
            "E por fim, falarei a diferença entre os resultaos!\n: ");

    int w = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();
    int z = sc.nextInt();

    System.out.println((w * x) - (y * z));

}