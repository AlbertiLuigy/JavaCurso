package List.Entidades;

public class Pessoa {

    private Integer id;
    private String nome;
    private double salario;

    public Pessoa(){}

    public Pessoa(Integer id, String nome, double salario){
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double aumentoSalario(double porcentagem){
        return salario += salario * porcentagem / 100;
    }

    public String toString(){
        return id + ", " + nome + ", " + salario;
    }

    
}
