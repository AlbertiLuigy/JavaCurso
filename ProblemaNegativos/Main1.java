package ProblemaNegativos;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite um número inteiro: ");
        int n = sc.nextInt();

        int [] vect = new int[n];

        for(int i = 0; i < n; i++){

            System.out.printf("Digite um número inteiro: ");
            vect[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            System.out.println(vect[i]);
        }

        for(int i = 0; i<n; i++){
            if(vect[i] < 0){
                System.out.println("Números negativos: " + vect[i]);
            }
        }

        sc.close();

    }
    
}
