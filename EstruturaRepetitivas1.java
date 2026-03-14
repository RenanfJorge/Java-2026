import java.util.Scanner;
import java.util.Locale;

void main() {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Fale a largura, comprimento e o metro quadro, informaria a area e o valor.");
    double largura = sc.nextDouble();
    double comprimento = sc.nextDouble();
    double metroQuadrado = sc.nextDouble();

    double area = largura * comprimento;
    double preco = area * metroQuadrado;

    System.out.printf("AREA = %.2f%n", area);
    System.out.printf("PRECO = %.2f%n", preco);

    System.out.println("Digite alguns numeros, quando digitar 0, irei somar os numeros que digitou.");

    int x = sc.nextInt();
    int soma = 0;

    while (x != 0) {
        soma += x;
        x = sc.nextInt();
    }

    System.out.println(soma);

    sc.close();
}