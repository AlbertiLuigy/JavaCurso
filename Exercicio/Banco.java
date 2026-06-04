package Exercicio;

public class Banco {

    private String nome;
    private double numeroDaConta;
    private double saldo;

    public Banco(String nome, double numeroDaConta, double saldo){
        this.nome = nome;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    public Banco(String nome, double numeroDaConta){
        this.nome = nome;
        this.numeroDaConta = numeroDaConta;
        saldo = 0.0;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getNumeroDaConta(){
        return numeroDaConta;
    }

    public double getSaldo(){
        return saldo;
    }

    public void Depositar(double valor){
        saldo = saldo + valor;
    }

    public void Saque(double valor){
        saldo = saldo - (valor + 5.0);
    }

    public String toString(){
        return "Conta: " + numeroDaConta + ", Titular: " + nome + ", Saldo: R$ " + String.format("%.2f", saldo);
    }
    
}
