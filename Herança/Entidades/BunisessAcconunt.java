package Herança.Entidades;

public class BunisessAcconunt extends Account {
   
    private double loanLimit; //limite de empréstimo

    public BunisessAcconunt(){
        super();
    }

    public BunisessAcconunt(Integer numero, String titular, double balance, double loanLimit){
        super(numero, titular, balance);
        this.loanLimit = loanLimit;
    }

    public double getLoanLimit(){
        return loanLimit;
    }

    public void setLoanLimit(double loanLimit){
        this.loanLimit = loanLimit;
    }

    public void emprestimo(double valor){
        if(valor <= loanLimit){
            balance += valor; 
        }
    }

}