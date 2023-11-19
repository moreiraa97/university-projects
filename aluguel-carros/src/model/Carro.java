package model;

public class Carro extends Automovel{
    
    private int numeroPortas; 
    

    public Carro(){}


    public Carro(int numeroPortas){
        super(); 
        this.numeroPortas = numeroPortas; 
    }


    public int getNumeroPortas(){
        return this.numeroPortas; 
    }

    public void setNumeroPortas(int numeroPortas){
        this.numeroPortas = numeroPortas; 
    }



}
