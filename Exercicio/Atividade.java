package Exercicio;
import java.util.Scanner;

public class Atividade {

        public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entre com os dados do banco: ");
        System.out.printf("Nome: ");
        String nome = sc.nextLine();

        System.out.printf("Número da conta: ");
        double conta = sc.nextDouble();
                        
        if (conta == 0 || conta < 0 || conta < 5) {
                        
                System.out.println("Número da conta não pode ser zero. Por favor, tente novamente com a numeração de 4 casas.");

                while(conta == 0 || conta < 0 || conta < 500){

                        System.out.printf("Número da conta: ");
                        conta = sc.nextDouble();
                }
                
        }
        
        System.out.printf("Digite o valor inicial: ");
        double valor = sc.nextDouble();

        if(valor == 0){
                System.out.println("Valor inicial zero.");
        }

        Banco pessoa = new Banco(nome, conta);

        System.out.println(pessoa.toString());
        
        System.out.printf("Digite o valor a ser depositado: ");
        double valorDeposito = sc.nextDouble();

        pessoa.Depositar(valorDeposito);

        System.out.println(pessoa.toString());

        System.out.printf("Digite o valor a ser sacado: ");
        double valorSaque = sc.nextDouble();

        pessoa.Saque(valorSaque);

        System.out.println(pessoa.toString());

        System.out.printf("Digite um novo nome: ");
        String novoNome = sc.next();

        pessoa.setNome(novoNome);

        System.out.println(pessoa.toString());
        
        
        
        
        
        
        
        sc.close();
        
        }
    
}
