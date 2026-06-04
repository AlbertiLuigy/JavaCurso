package Exercicios_Composicao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Exercicios_Composicao.Entidades.Contrato;
import Exercicios_Composicao.Entidades.Departamento;
import Exercicios_Composicao.Entidades.NivelDoTrabalhador;
import Exercicios_Composicao.Entidades.Trabalhador;

public class Main {

    public static void main(String[] args) throws ParseException{
        
        Locale.setDefault(Locale.US); // para formatar os números com ponto ao invés de vírgula, por exemplo: 1000.00 ao invés de 1000,00
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // para formatar a data no formato dia/mês/ano

        System.out.printf("Entre com o nome do departamento: ");
        String nomeDepartamento = sc.nextLine();

        System.out.println("Entre com os dados do trabalhador:");

        System.out.printf("Nome: ");
        String nomeTrabalhador = sc.nextLine();

        System.out.printf("Nivel (JUNIOR, MEDIO ou SENIOR): ");
        String nivelTrabalhador = sc.nextLine();

        System.out.printf("Salário base: ");
        Double salario =  sc.nextDouble();

        Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, NivelDoTrabalhador.valueOf(nivelTrabalhador), salario, new Departamento(nomeDepartamento));

        System.out.printf("Entre com o número de contratos do trabalhador: ");
        int numeroContratos = sc.nextInt();

        for(int i = 0; i < numeroContratos; i++){
            System.out.println("Entre com os dados do contrato #" + (i+1) + ":");

            System.out.printf("Data (DD/MM/YYYY): ");
            Date dataDeContrato = sdf.parse(sc.next());

            System.out.printf("Valor por hora: ");
            Double valorPorHora = sc.nextDouble();

            System.out.printf("Duração (horas): ");
            Integer duracaoEmHoras = sc.nextInt();

            Contrato contrato = new Contrato(dataDeContrato, valorPorHora, duracaoEmHoras);

            trabalhador.AddContrato(contrato);
        }

        System.out.printf("Entre com o mês e ano para calcular o salário (MM/YYYY): ");
        String mesEAno = sc.next();
        
        int mes = Integer.parseInt(mesEAno.substring(0,2)); // pega os dois primeiros caracteres da string, que correspondem ao mês, e converte para inteiro
        int ano = Integer.parseInt(mesEAno.substring(3)); // pega os caracteres a partir do índice 3, que correspondem ao ano, e converte para inteiro

        System.out.println("Nome: " + trabalhador.getNome());
        System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
        System.out.println("Salário para " + mesEAno + ": " +  trabalhador.Renda(mes, ano));
        sc.close();
    }
    
}
