import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        
        Scanner produtos = new Scanner(System.in);
        System.out.println("Digite o número de produtos vendidos: ");
        int quantDeProd = produtos.nextInt();

        Scanner preco = new Scanner(System.in);
        System.out.println("Digite o preço unitário do produto vendido: ");
        double precoDeProd = preco.nextDouble();

        int frete = 20;
        double valorDaVenda = quantDeProd * precoDeProd + frete;

        System.out.println("O custo desta venda foi de " + valorDaVenda + ".");

        produtos.close();
        preco.close();
    }
}
