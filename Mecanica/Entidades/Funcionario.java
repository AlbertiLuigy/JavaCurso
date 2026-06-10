package Mecanica.Entidades;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import Mecanica.Enum.Beneficio;
import Mecanica.Enum.Cargo;

public class Funcionario {
    
    private String nome;
    private Cargo cargo;
    private double salario;

    private Departamento departamento;

    private List<Contrato> contratos = new ArrayList<>();
    private List<Beneficio> beneficios = new ArrayList<>();
    private List<Veiculos> veiculos = new ArrayList<>();


    public Funcionario(){}

    public Funcionario(String nome, Cargo cargo, double salario, Departamento departamento) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
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

    public List<Beneficio> getBeneficios() {
        return beneficios;
    }

    public List<Veiculos> getVeiculos() {
        return veiculos;
    }

    public void AddContrato(Contrato contrato){
        this.contratos.add(contrato);
    }

    public void RemoveContrato(Contrato contrato){
        this.contratos.remove(contrato);
    }

    public void AddBenecicio(Beneficio beneficio){
        this.beneficios.add(beneficio);
    }

    public void RemoveBeneficio(Beneficio beneficio){
        this.beneficios.remove(beneficio);
    }

    public void AddVeiculo(Veiculos veiculo){
        this.veiculos.add(veiculo);
    }

    public void RemoveVeiculo(Veiculos veiculo){
        this.veiculos.remove(veiculo);
    }

    public double Renda(int ano, int mes){
        
        double soma = salario;

        Calendar cal = Calendar.getInstance(); // Calendar é uma classe que permite manipular datas e horas de forma mais flexível do que a classe Date. Ela fornece métodos para obter e definir campos específicos de uma data, como ano, mês, dia, hora, minuto, segundo, etc. Além disso, a classe Calendar também suporta operações de adição e subtração de tempo, comparação de datas e formatação de datas.

        for (Contrato c : contratos) {
            cal.setTime(c.getData());
            int c_ano = cal.get(Calendar.YEAR);
            int c_mes = 1 + cal.get(Calendar.MONTH);
            if (ano == c_ano && mes == c_mes) {
                soma += c.valorTotal();
            }
        
        }
        return soma;
    }
    
}
