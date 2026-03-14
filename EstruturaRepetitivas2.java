import java.util.Scanner;

void main() {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite quantas vezes voce quer adcionar um numero");
    int n = sc.nextInt();

    System.out.println("Agora coloque valores na quantidade que voce determinou");
    int somar = 0;
    for (int i=0; i < n; i=i+1 ){
        int x = sc.nextInt();
        somar = somar + x;
    }

    System.out.println("E a soma dos numeros é: " + somar);

    sc.close();
}