import java.util.Scanner;

public class exec4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um numero:");
        int numeroInicial = scanner.nextInt();

        for (int i = 1; i <= numeroInicial; i++) {
            System.out.println("Insira outro numero:");
            int numero = scanner.nextInt();
            if (numero % numeroInicial != 0) {
                System.out.println(numero);
            }
        }
    }
}
