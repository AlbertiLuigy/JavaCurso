package Outros;
import java.util.Scanner;

public class ProgramaDeVotar {

    public static void main(String[] args) {
        boolean x = true;

        while(x == true){

            System.out.println("Digite sua idade: ");
            Scanner sc = new Scanner(System.in);
            int idade = sc.nextInt();

            if(idade < 18){
                System.out.println("Você não pode votar");
                x = false;
            }
            else{
                System.out.println("Você está permitido votar!");

                sc.nextLine(); // Limpar o buffer do scanner
                
                System.out.println("Digite seu nome: ");
                String nome = sc.nextLine();

                System.out.println("Digite seu numero de celular: ");
                double celular = sc.nextDouble();

                System.out.println("Digite seu CPF: ");
                double CPF = sc.nextDouble();

                System.out.println("Digite sua opção de voto: (1)Marcelo, (2)Lula, (3)Bolsonaro");
                int voto = sc.nextInt();

                switch (voto) {
                    case 1:
                        System.out.println("Você votou em Marcelo");
                        break;
                    case 2:
                        System.out.println("Você votou em Lula");
                        break;
                    case 3:
                        System.out.println("Você votou em Bolsonaro");
                        break;
                    default:
                        System.out.println("Opção de voto inválida");
                    break;
                }

                String Candidato;

                if(voto == 1){

                    Candidato = "Marcelo";

                    System.out.println("Seu voto foi registrado com sucesso!");
                    System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nCelular: " + celular + "\nCPF: " + CPF + "\nCandidato: " + Candidato);
                }
                else if(voto == 2){

                    Candidato = "Lula";

                    System.out.println("Seu voto foi registrado com sucesso!");
                    System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nCelular: " + celular + "\nCPF: " + CPF + "\nCandidato: " + Candidato);

                }
                else if(voto == 3){

                    Candidato = "Bolsonaro";

                    System.out.println("Seu voto foi registrado com sucesso!");
                    System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nCelular: " + celular + "\nCPF: " + CPF + "\nCandidato: " + Candidato);

                }

                System.out.println("Deseja continuar? (S/N)");
                String resposta = sc.next();

                if(resposta .equalsIgnoreCase("S")){
                    x = true;
                }
                else if(resposta.equalsIgnoreCase("N")){
                    x = false;
                }
                else{
                    System.out.println("Resposta inválida. Encerrando o programa.");
                    x = false;

                }
                sc.close();
                

            }

        }
    }
    
}
