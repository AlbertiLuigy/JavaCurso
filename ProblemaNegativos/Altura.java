package ProblemaNegativos;

import java.util.Scanner;

import ProblemaNegativos.Entidades.Pessoaalta;

public class Altura {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite a quantidade de pessoas: ");
        int n = sc.nextInt();

        Pessoaalta [] vect = new Pessoaalta[n];

        System.out.println("Entre com os dados das pessoas: ");

        for(int i = 0; i < vect.length; i++){

            sc.nextLine(); // Consumir a quebra de linha pendente

            System.out.println("Dados da Pessoa " + (i + 1));
            System.out.printf("Nome: ");
            String nome = sc.nextLine();

            System.out.printf("Idade: ");
            int idade = sc.nextInt();

            System.out.printf("Altura: ");
            double altura = sc.nextDouble();

            vect[i] = new Pessoaalta(nome, idade, altura);
        }

        double soma = 0;

        for(int i = 0; i < vect.length; i++){

            soma = soma + vect[i].getAltura();
        }

        double media = soma / n;
        System.out.printf("Altura média: %.2f%n", media);
        
        sc.close();


    }
    
}
