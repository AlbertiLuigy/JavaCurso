package Outros;
import java.util.Scanner;

public class re {
    public static void main(String[] args) {

        System.out.printf("Digite seu ano de nascimento: ");

        Scanner sc = new Scanner(System.in);

        int nascimento = sc.nextInt();

        int idade = max(nascimento);

        System.out.println(idade);
        sc.close();
        
    }

    public static int max(int nascimento) {

        int idade = 0;
        
        if(nascimento > 2026){
            System.out.println("Ano de nascimento inválido.");
        }
        else{
                int anoAtual = 2026;
                idade = anoAtual - nascimento;
        }
        

        return idade;
    }
    
}
