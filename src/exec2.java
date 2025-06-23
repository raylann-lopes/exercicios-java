import java.util.Scanner;

public class exec2 {
    public static void main(String[] args) {
        // IMC = PESO (ALTURA x ALTURA)
        Scanner scanner = new Scanner(System.in);
        System.out.println("IMC");
        System.out.println("Insira o seu peso:");
        float peso = scanner.nextFloat();
        System.out.println("Insira a sua altura:");
        float altura = scanner.nextFloat();

        float IMC = (peso / (altura * altura));
        {

            if (IMC < 18.5) {
                System.out.println(IMC + " - Abaixo do peso");
            }
            if (IMC >= 18.5 && IMC <= 24.9) {
                System.out.println(IMC + " - Peso normal");
            }
            if (IMC >= 25 && IMC <= 29.9) {
                System.out.println(IMC + " - Sobrepeso");
            }
            if (IMC >= 30 && IMC <= 34.9) {
                System.out.println(IMC + " - Obesidade grau 1");
            }
            if (IMC >= 35 && IMC <= 39.9) {
                System.out.println(IMC + " - Obesidade grau 2");
            }
            if (IMC >= 40) {
                System.out.println(IMC + " - Obesidade grau 3");
            }
        }
    }
}