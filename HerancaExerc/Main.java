package HerancaExerc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import HerancaExerc.Entidades.Funcionario;
import HerancaExerc.Entidades.FuncionarioTercerizado;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Qual o número de funcionários? ");
        Integer numeroFuncionarios = sc.nextInt();

        List<Funcionario> listaFuncionarios = new ArrayList<>();

        for(int i = 0; i < numeroFuncionarios; i++){
            System.out.println("Funcionário #" + (i+1) + ";");

            System.out.println("É terceirizado? (s/n) ");
            char resposta = sc.next().charAt(0);

            System.out.println("Nome: ");
            String nome = sc.next();

            System.out.println("Horas: ");
            Integer horas = sc.nextInt();

            System.out.println("Valor por hora: ");
            Double valorPorHora = sc.nextDouble();
            if(resposta == 's' || resposta == 'S'){
                System.out.println("cobrança adicional: ");
                double cobrancaAdicional = sc.nextDouble();

                FuncionarioTercerizado funcionarioTercerizado = new FuncionarioTercerizado(nome, horas, valorPorHora, cobrancaAdicional);
                listaFuncionarios.add(funcionarioTercerizado);
            }else{
                Funcionario funcionario = new Funcionario(nome, horas, valorPorHora);
                listaFuncionarios.add(funcionario);
            }
        }

        for (Funcionario funcionario : listaFuncionarios) {
            System.out.println(funcionario.getNome() + " - $ " + String.format("%.2f", funcionario.Pagamento()));
        }

        sc.close();

    }
    
}
