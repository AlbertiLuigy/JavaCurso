package Mecanica;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import Mecanica.Entidades.Veiculos;
import Mecanica.Entidades.Contrato;
import Mecanica.Entidades.Departamento;
import Mecanica.Entidades.Funcionario;
import Mecanica.Enum.Beneficio;
import Mecanica.Enum.Cargo;

public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.printf("Entre com o nome do Derpartamento:");
        String nomeDepartamento = sc.nextLine();

        System.out.println("Entre com os dados do funcionário:");

        System.out.printf("Nome: ");
        String nomeFuncionario = sc.nextLine();

        System.out.printf("Cargo (MECANICO, AUXILIAR ou GERENTE): ");
        String cargoFuncionario = sc.nextLine();

        System.out.printf("Salário base: ");
        double salario = sc.nextDouble();

        Funcionario funcionario1 = new Funcionario(nomeFuncionario,Cargo.valueOf(cargoFuncionario), salario, new Departamento(nomeDepartamento));

        System.out.printf("Entre com o numero de contratos do funcionário: ");
        int numeroContratos = sc.nextInt();

        for(int i = 0; i < numeroContratos; i++){
            System.out.printf("Contrato #" + (i+1) + ":");

            System.out.printf("Entre com a data do contrato DD/MM/AAAA: ");
            Date dataContrato = sdf.parse(sc.next());

            System.out.printf("Entre com o valor por hora: ");
            double valorPorHora = sc.nextDouble();

            System.out.printf("Entre com as Horas do contrato: ");
            int horas = sc.nextInt();

            Contrato contrato1 = new Contrato(dataContrato, valorPorHora, horas);

            funcionario1.AddContrato(contrato1);
        }

        System.out.println("Entre com o mês e ano para calcular o salário (MM/YYYY): ");
        String mesEAno = sc.next();

        int mes = Integer.parseInt(mesEAno.substring(0, 2));
        int ano = Integer.parseInt(mesEAno.substring(3));

        System.out.println("Salário de " + funcionario1.getNome() + " para " + mesEAno + ": " + String.format("%.2f", funcionario1.Renda(mes, ano)));

        
        System.out.printf("Quantos beneficios você possui? VALEVT, VALEVR, VALEVA: ");
        int numeroBeneficios = sc.nextInt();

        for(int i = 0; i < numeroBeneficios; i++){
            System.out.printf("Beneficio #" + (i+1) + ": ");
            String bene = sc.next();

            Beneficio beneficio1 = Beneficio.valueOf(bene);
            System.out.println("Benefício adicionado: " + beneficio1);
        }

        for(int i = 0; i < funcionario1.getBeneficios().size(); i++){
            System.out.println("Benefício #" + (i+1) + ": " + funcionario1.getBeneficios().get(i));
        }

        System.out.println("Quantos veículos você possui? ");
        int numeroVeiculos = sc.nextInt();

        for(int i = 0; i < numeroVeiculos; i++){
            System.out.println("Veículo #" + (i+1) + ":");
            
            System.out.printf("Qual o modelo do veículo? ");
            String modelo = sc.next();

            System.out.printf("Qual a placa do veículo? ");
            String placa = sc.next();

            System.out.printf("Qual a marca do veículo? ");
            String marca = sc.next();

            System.out.printf("Qual o chassi do veículo? ");
            double chassi = sc.nextDouble();

            System.out.printf("Qual o ano do veículo? ");
            int anoVeiculo = sc.nextInt();

            System.out.printf("Qual a cor do veículo? ");
            String cor = sc.next();

            Veiculos veiculo1 = new Veiculos(modelo, placa, marca, chassi, anoVeiculo, cor);

            funcionario1.AddVeiculo(veiculo1);
        }

        for(int i = 0; i < funcionario1.getVeiculos().size(); i++){
            System.out.println("Veículo #" + (i+1) + ": " + funcionario1.getVeiculos().get(i).getModelo() + " - " + funcionario1.getVeiculos().get(i).getPlaca() + " - " + funcionario1.getVeiculos().get(i).getMarca() + " - " + funcionario1.getVeiculos().get(i).getChassi() + " - " + funcionario1.getVeiculos().get(i).getAno() + " - " + funcionario1.getVeiculos().get(i).getCor());
        }


        sc.close();
    }
    
}
