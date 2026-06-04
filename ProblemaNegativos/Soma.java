package ProblemaNegativos;

import java.util.Scanner;

public class Soma {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Double [] vect = new Double[n]; 

        for(int i = 0; i < n; i++){
            System.out.printf("Digite um número: ");
            vect[i] = sc.nextDouble();
        }

        for(int i = 0; i < n; i++){
            System.out.printf("Valores: " + vect[i] + "\n");
        }
        
        double soma = 0;

        for(int i = 0; i < n; i++){
            soma = soma + vect[i];
        }

        double media = soma / n;

        System.out.printf("Soma: %.2f \n", soma);
        System.out.printf("Média: %.2f \n", media);



        sc.close();
    }
    
}
