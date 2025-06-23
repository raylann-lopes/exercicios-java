import java.util.Scanner;

public class exec3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Par ou Ímpar");
        System.out.println("Insira um número:");
        int numeroMenor = scanner.nextInt();

        System.out.println("Insira um número maior que o anterior:");
        int numeroMaior = scanner.nextInt();
        if (numeroMaior <= numeroMenor) {
            System.out.println("O segundo número deve ser maior que o primeiro.");
            return;
        }
        if (numeroMenor < 0 || numeroMaior < 0) {
            System.out.println("Por favor, insira números positivos.");
            return;
        }

        System.out.println("Voce deseja os numeros Impares ou Pares? (Digite 'I' para Ímpares ou 'P' para Pares):");
        char escolha = scanner.next().toUpperCase().charAt(0);
        if (escolha != 'I' && escolha != 'P') {
            System.out.println("Opção inválida. Por favor, digite 'I' para Ímpares ou 'P' para Pares.");
            return;
        }

        switch (escolha) {
            case 'I': {
                for (int i = numeroMenor; i <= numeroMaior; i++) {
                    if (i % 2 != 0) {
                        System.out.println(i);
                    }
                }
                break;
            }
            case 'P': {
                for (int i = numeroMenor; i <= numeroMaior; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i);
                    }
                }
            }
        }
    }
}
