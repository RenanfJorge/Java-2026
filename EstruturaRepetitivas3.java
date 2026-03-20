import java.util.Scanner;
import java.util.Locale;

void main() {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    char resp;

    do {
        System.out.println("Digite a temperatura em Celsius: ");
        double C = sc.nextDouble();
        double F = 9.0 * C / 5.0 + 32.0;
        System.out.printf("Equivalente em Fahrenheint: %.1fn", F);
        System.out.println("");
        System.out.printf("Deseja repetir (s/n)? ");
        resp = sc.next().charAt(0);

    } while (resp != 'n');
    sc.close();
}