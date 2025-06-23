import java.util.Scanner;

public class exec1 {
    public static void main(String[] args) {
        //Escreva uma tabuada
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tabuada");
        System.out.println("Insira o numero que deseja calcular:");
        int numero = scanner.nextInt();

        for  (int i = 1; i <= 9; i++) {
            var multiplicacao = numero * i;
            System.out.println(numero + " X " + i + " = " + multiplicacao);
            }
        }
    }

