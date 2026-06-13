package Herança.Entidades;

public class Account {

    private Integer numero;
    private String titular;
    protected double balance; //saldo

    public Account(){}
    
    public Account(Integer numero, String titular, double balance){
        this.numero = numero;
        this.titular = titular;
        this.balance = balance;
    }

    public Integer getNumero(){
        return numero;
    }

    public void setNumero(Integer numero){
        this.numero = numero;
    }

    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
            this.balance = balance;
    }

    public void Retirar(double valor){
        balance -= valor + 5.0; //taxa de saque
    }

    public void Depositar(double valor){
        balance += valor;
    }
    
}
