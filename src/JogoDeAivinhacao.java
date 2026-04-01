import java.util.Random;
import java.util.Scanner;

public class JogoDeAivinhacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int tentativas = 0;
        int numeroUsuario = 0;

        System.out.println("Adivinhe o número entre 0 e 100. Você tem 5 tentativas!");

        while (tentativas < 5) {
            System.out.println("Tentativa " + (tentativas + 1) + " - Digite seu palpite: ");
            numeroUsuario = leitor.nextInt();
            tentativas++;

            if (numeroUsuario == numeroGerado) {
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
                break;
            } else if (numeroUsuario < numeroGerado) {
                System.out.println("O número é MAIOR.");
            } else {
                System.out.println("O número é MENOR.");
            }

            // Verificação de fim de jogo fora dos ifs de maior/menor
            if (tentativas == 5 && numeroUsuario != numeroGerado) {
                System.out.println("Suas tentativas acabaram!");
                System.out.println("O número era: " + numeroGerado);
            }
        }
        leitor.close();
    }
}
