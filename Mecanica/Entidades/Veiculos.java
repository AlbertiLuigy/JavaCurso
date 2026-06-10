package Mecanica.Entidades;

public class Veiculos {
    
    private String modelo;
    private String placa;
    private String marca;
    private double chassi;
    private Integer ano;
    private String cor;

    public Veiculos(){}

    public Veiculos(String modelo, String placa, String marca, double chassi, Integer ano, String cor) {
        this.modelo = modelo;
        this.placa = placa;
        this.marca = marca;
        this.chassi = chassi;
        this.ano = ano;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getChassi() {
        return chassi;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double valorDoCarro(){
        double valor = 0.0;
        if(ano >= 2015){
            valor = 50000.00;
        } else if(ano >= 2010){
            valor = 30000.00;
        } else {
            valor = 15000.00;
        }
        return valor;
    }
}
