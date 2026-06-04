package Exercicios_Composicao.Entidades;
import Exercicios_Composicao.Entidades.NivelDoTrabalhador;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class Trabalhador {

    private String nome;
    private NivelDoTrabalhador level;
    private Double salarioBase;

    private Departamento departamento; // associação
    private List<Contrato> contratos = new ArrayList<>(); // associação, não coloca ele no construtor quando é uma associação com lista

    public Trabalhador() {
    }

    public Trabalhador(String nome, NivelDoTrabalhador level, Double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.level = level;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelDoTrabalhador getLevel() {
        return level;
    }

    public void setLevel(NivelDoTrabalhador level) {
        this.level = level;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<Contrato> getContratos() {
        return contratos;
    }

    public void AddContrato(Contrato contrato){
        this.contratos.add(contrato);
    }

    public void RemoveContrato(Contrato contrato){
        this.contratos.remove(contrato);
    }

    public Double Renda(Integer ano, Integer mes){
        double soma = salarioBase;
        Calendar cal = Calendar.getInstance();
       for (Contrato c : contratos) {
        cal.setTime(c.getData());
        int c_ano = cal.get(Calendar.YEAR);
        int c_mes = 1 + cal.get(Calendar.MONTH);
        if(ano == c_ano && mes == c_mes){
            soma += c.valorTotal();
        }
       }
       return soma;
    }

    
}
