package Outros;
import java.util.Scanner;

public class Aulas {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite uam idade: ");
        int idade = sc.nextInt();

        System.out.print("Digite seu numero de Celular: ");
        double celular = sc.nextDouble();

        System.out.print("Digite seu peso: ");
        double peso = sc.nextDouble();

        sc.nextLine(); // Limpar o buffer do scanner

        System.out.print("Digite um texo: ");
        String texto = sc.nextLine();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Celular: " + celular);
        System.out.println("Peso: " + peso);
        System.out.println("Texto: " + texto);
        sc.close();
        
    }
    
}
