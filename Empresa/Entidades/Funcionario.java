package Empresa.Entidades;

public class Funcionario {

    public String nome;
    public Double salarioBruto;
    public Double imposto;

    public Double SalarioLiquido(){

        double salarioLiquido = salarioBruto - imposto;
        return salarioLiquido;
       
    }

    public void AumentarSalario(double porcentagem){

        salarioBruto = salarioBruto + salarioBruto * (porcentagem/ 100);

    }

    public String toString(){
        return "Funcionário: " + nome + ", Salario Liquido: $" + SalarioLiquido() + ", Imposto: $" + imposto;
    }
    
}
