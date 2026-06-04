package Vetores;
import java.util.Scanner;

import Vetores.Entidades.Produto;

public class Array {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Produto [] vect = new Produto[n];

        for(int i = 0; i < vect.length; i++){

            System.out.println("Entre com os dados do produto: ");
            sc.nextLine(); // Consumir a quebra de linha pendente
            
            System.out.printf("Nome: ");
            String nome = sc.nextLine();

            System.out.printf("Preço: ");
            double preco = sc.nextDouble();

            System.out.printf("Quantidade: ");
            int quantidade = sc.nextInt();

            vect[i] = new Produto(nome, preco, quantidade);

        }

        double soma = 0;

        for(int i = 0;  i < vect.length; i++){

            soma = soma + vect[i].getPreco();
        }

        double media = soma / n;

        System.out.printf("Preço médio: %.2f \n", media);

        for(int i = 0; i < vect.length; i++){

            System.out.printf(vect[i].toString());
            
        }
            sc.close();
        }
    
}
