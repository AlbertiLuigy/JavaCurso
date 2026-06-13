package Herança.Entidades;

public class SavingsAccount extends Account {

    private double interestRate; //taxa de juros

    public SavingsAccount(){
        super();
    }

    public SavingsAccount(Integer numero, String titular, double balance, double interestRate){
        super(numero, titular, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate(){
        return interestRate;
    }

    public void setInterestRate(double interestRate){
        this.interestRate = interestRate;
    }

    public void UpdateBalance(){
        balance += balance * interestRate; //atualiza o saldo com os juros
    }


    @Override
    public void Retirar(double valor){
        balance -= valor; //sem taxa de saque
    }

    
}
