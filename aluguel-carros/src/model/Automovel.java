package model;

public class Automovel {
    
    private String marca; 
    private String modelo; 
    private int ano; 
    private String placa; 
    private String tipo; //carro ou caminhão 


    public Automovel(){}


    public Automovel(String marca, String modelo, int ano, String placa, String tipo){
        this.marca = marca;
        this.modelo = modelo; 
        this.ano = ano; 
        this.placa = placa; 
        this.tipo = tipo; 

    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }


    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }



}
