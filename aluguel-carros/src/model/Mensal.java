package model;

public class Mensal extends AluguelDeAutomovel{
    
    private int valorMes; 
    private int numeroMeses; 


    public Mensal(){}


    public Mensal(int valorMes, int numeroMeses){
        super();
        this.valorMes = valorMes; 
        this.numeroMeses = numeroMeses; 
    }


    public int getValorMes() {
        return valorMes;
    }

    public void setValorMes(int valorMes) {
        this.valorMes = valorMes;
    }


    public int getNumeroMeses() {
        return numeroMeses;
    }

    public void setNumeroMeses(int numeroMeses) {
        this.numeroMeses = numeroMeses;
    }


    @Override
    public void calcularValorTotal(int valorMes, int numeroMeses) {
        
        super.calcularValorTotal(valorMes, numeroMeses);
        
    }



}
