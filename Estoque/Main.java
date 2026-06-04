package Estoque;
import java.util.Scanner;
import Estoque.Entidade.Produto;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do produto ");
        System.out.printf("Nome: ");
        String nome = sc.nextLine();
        System.out.printf("Preço: ");
        double preco= sc.nextDouble();
        System.out.printf("Quantidade no estoque: ");
        int quantidadeEstoque = sc.nextInt();

        Produto p = new Produto(nome, preco, quantidadeEstoque);

        System.out.println(p.toString());

        System.out.println("Valor Total do Estoque: " + p.ValorTotalEstoque());
        
        System.out.printf("Digite o número de produtos a ser adicionado ao estoque: ");
        int quantidade = sc.nextInt();
        p.AdicionarProdutos(quantidade);

        System.out.println(p.toString());

        System.out.printf("Digite o número de produtos a ser removido do estoque: ");
        int quantidadeRemovida = sc.nextInt();
        p.RemoverProdutos(quantidadeRemovida);

        System.out.println(p.toString());

        sc.close();
    }
    
}
