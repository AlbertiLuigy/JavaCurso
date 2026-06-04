package Horario;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Horario {

    public static void main(String[] args) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Criando um formato para a data
        
        LocalDate data = LocalDate.now(); // Obtendo a data atual
        System.out.println("Data atual: " + data); // Imprimindo a data atual

        LocalDateTime dataHora = LocalDateTime.now(); // Obtendo a data e hora atual
        System.out.println("Data e hora atual: " + dataHora); // Imprimindo a data e hora atual

        Instant instante = Instant.now(); // Criando um objeto da classe Instante
        System.out.println("Instante: " + instante); // Imprimindo o instante

        LocalDate data2 = LocalDate.parse("2024-06-20"); // Criando um objeto da classe LocalDate a partir de uma string
        System.out.println("Data 2: " + data2); // Imprimindo a data 2

        LocalDateTime dataHora2 = LocalDateTime.parse("2024-06-20T15:30:00"); // Criando um objeto da classe LocalDateTime a partir de uma string
        System.out.println("Data e hora 2: " + dataHora2); // Imprimindo a data e hora 2

        Instant instante2 = Instant.parse("2024-06-20T15:30:00Z"); // Criando um objeto da classe Instante a partir de uma string
        System.out.println("Instante 2: " + instante2); // Imprimindo o instante 2

        LocalDate data3 = LocalDate.parse("20/06/2024", fmt); // Criando um objeto da classe LocalDate a partir de uma string usando o formato criado
        System.out.println("Data 3: " + data3); // Imprimindo a data 3
    }
    
}
