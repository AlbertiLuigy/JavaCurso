package ExercicioHeranca2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import ExercicioHeranca2.Entidades.Produto;
import ExercicioHeranca2.Entidades.ProdutoImportado;
import ExercicioHeranca2.Entidades.ProdutoUsado;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de produtos: "); 
        int n = sc.nextInt();

        List<Produto> produtos = new ArrayList<>();

        for(int i = 0; i < n; i++){
            System.out.println("Produto #" + (i+1) + ":");
            System.out.printf("Qual o nome: ");
            String nome = sc.next();

            System.out.printf("Qual o preço: ");
            double preco = sc.nextDouble();

            System.out.printf("Esse produto é Importado, Usado ou Comum? (i/u/c): ");
            char tipoProduto = sc.next().charAt(0);

            if(tipoProduto == 'c' || tipoProduto == 'C'){
                Produto produto = new Produto(nome, preco);
                produtos.add(produto);
            }
            if(tipoProduto == 'u' || tipoProduto == 'U'){
                System.out.printf("Qual a data de fabricação (dd/MM/yyyy): ");
                String dataFabricacao = sc.next();

                ProdutoUsado produtoUsado = new ProdutoUsado(nome, preco, dataFabricacao);
                produtos.add(produtoUsado);
            }
            if(tipoProduto == 'i' || tipoProduto == 'I'){
                System.out.printf("Qual a tarifa desse produto: ");
                double tarifa = sc.nextDouble();

                ProdutoImportado produtoImportado = new ProdutoImportado(nome, preco, tarifa);
                produtos.add(produtoImportado);
            }
        }

        System.out.printf("Produtos cadastrados: \n");
            for (Produto produto : produtos) {
                System.out.println(produto.etiquetaPreco());
        }
        sc.close();
    }
    
}
