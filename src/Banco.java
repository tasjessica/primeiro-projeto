import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        String nome;
        String tipoConta;
        double extrato = 1621;
        int opcao = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = input.nextLine();

        System.out.println("Obrigado, "+ nome +"! Agora informe o seu tipo de conta: ");
        tipoConta = input.nextLine();



        System.out.println("""
    Escolha a opção que deseja:
    1. Saque
    2. Depósito
    3. Extrato
    """);
            opcao = input.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Qual valor deseja sacar?");
                double valorSaque = input.nextDouble();
                if (valorSaque > extrato){
                    System.out.println("Valor indisponível. Seu saldo atual é: "+ extrato);
                } else if (valorSaque <= 0){
                    System.out.println("Valor inválido. Digite um valor acima de 0.");
                } else {
                System.out.println("Saque realizao com sucesso.");
                extrato = extrato - valorSaque;
                System.out.println("Seu novo saldo é de: R$" + extrato);
            }
                break;

            case 2:
                System.out.println("Qual valor deseja depositar?");
                double valorDeposito = input.nextDouble();
                if (valorDeposito <= 0){
                    System.out.println("Valor inválido. Digite um valor acima de 0.");
                } else {
                    System.out.println("Depósito realizado com sucesso.");
                    extrato = extrato + valorDeposito;
                System.out.println("Seu novo saldo é de: R$" + extrato);
                }
                break;

            case 3:
                System.out.println("Seu saldo é de: R$" + extrato);
                break;
        }


    }
}
