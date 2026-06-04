package Triangulos;
import java.util.Scanner;

import Triangulos.entidades.Triagulos;

public class Triangulo {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com as medidas do triangulo X");

        Triagulos x = new Triagulos();
        Triagulos y = new Triagulos();

        System.out.printf("Lado A: ");
        x.a = sc.nextDouble();
        System.out.printf("Lado B: ");
        x.b = sc.nextDouble();
        System.out.printf("Lado C: ");
        x.c = sc.nextDouble();

        double areax = x.area();


        System.out.println("Entre com as medidas do triangulo Y");
        System.out.printf("Lado A: ");
        y.a = sc.nextDouble();
        System.out.printf("Lado B: ");
        y.b = sc.nextDouble();
        System.out.printf("Lado C: ");
        y.c = sc.nextDouble();

        double areay = y.area();


        if(areax > areay){
            System.out.printf("O triangulo X tem a maior área: %.4f%n", areax);
        }
        else if(areay > areax){
            System.out.printf("O triangulo Y tem a maior área: %.4f%n", areay);
        }
        else{
            System.out.printf("Os triangulos tem a mesma área: %.4f%n / %.4f%n", areax, areay);
        }

        sc.close();
        
    }

    
}
