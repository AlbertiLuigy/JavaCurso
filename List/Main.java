package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import List.Entidades.Pessoa;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos funcionários serão registrados? ");
        int n = sc.nextInt();


        List<Pessoa> list = new ArrayList<>(); // Criando a lista de pessoas

        for(int i = 0; i < n; i++){
            System.out.println("Funcionario #" + (i+1));
            System.out.printf("Id: ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.printf("Nome: ");
            String nome = sc.nextLine();

            System.out.printf("Salário: ");
            double salario = sc.nextDouble();

            Pessoa pessoa = new Pessoa(id, nome, salario); // Criando um objeto pessoa com os dados inseridos e adicionando na lista

            list.add(pessoa); // Adicionando a pessoa na lista
        }

        Pessoa pessoa = list.stream().filter(x -> x.getId() == 333).findFirst().orElse(null); // Buscando na lista a pessoa com o id 333, se não encontrar retorna null

        if(pessoa == null){
            System.out.println("Esse id não existe!");
        } else {
            System.out.println("Digite a porcentagem para aumentar o salário: ");
            double porcentagem = sc.nextDouble();
            pessoa.aumentoSalario(porcentagem); // Aumentando o salário da pessoa encontrada com a porcentagem inserida
        }

        for (Pessoa emt : list) {
            System.out.println(emt.toString()); // Imprimindo a lista de pessoas, o método toString foi sobrescrito na classe Pessoa para imprimir os dados formatados
        }


        sc.close();
    }
    
}
