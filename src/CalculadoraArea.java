import java.util.Scanner;

public class CalculadoraArea {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("1. Calcular área do quadrado");
        System.out.println("2. Calcular área do círculo");
        System.out.print("Escolha uma opção: ");

        int opcao = leitura.nextInt();

        if (opcao == 1) {
            System.out.print("Digite o valor do lado do quadrado: ");
            double lado = leitura.nextDouble();
            double areaQuadrado = lado * lado;
            System.out.println("A área do quadrado é: " + areaQuadrado);
        } else if (opcao == 2) {
            System.out.print("Digite o raio do círculo: ");
            double raio = leitura.nextDouble();
            double areaCirculo = Math.PI * raio * raio;
            System.out.printf("A área do círculo é: %.2f%n", areaCirculo);
        } else {
            System.out.println("Opção inválida!");
        }


    }
}
