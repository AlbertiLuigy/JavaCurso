package Empresa;
import java.util.Scanner;
import Empresa.Entidades.Funcionario;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Funcionario Cleber = new Funcionario();

        System.out.println("Digite os dados do funcionário: ");
        System.out.printf("Nome: ");
        Cleber.nome = sc.nextLine();

        System.out.printf("Salário bruto: ");
        Cleber.salarioBruto = sc.nextDouble();

        System.out.printf("Imposto: ");
        Cleber.imposto = sc.nextDouble();

        System.out.println(Cleber.toString());

        System.out.printf("Digite a porcentagem para aumentar o salário: ");
        double porcentagem = sc.nextDouble();
        Cleber.AumentarSalario(porcentagem);

        System.out.println(Cleber.toString());
        
        sc.close();
    }
    
}
