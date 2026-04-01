public class Desconto {
    public static void main(String[] args) {
        double precoOriginal = 120.5;
        double percentualDesconto = 10.0;
        double valordesconto = (percentualDesconto / 100) * precoOriginal;
        double novoPreco = precoOriginal - valordesconto;
        System.out.print("o novo preço com desconto é: " + novoPreco);
    }
}