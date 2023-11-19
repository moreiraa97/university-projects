package model;

public class Caminhao extends Automovel{
    
    private float capacidadeCarga; 


    public Caminhao(){}


    public Caminhao(float capacidadeCarga){
        super();
        this.capacidadeCarga = capacidadeCarga; 
    }


    public float getCapacidadeCarga(){
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(float capacidadeCarga){
        this.capacidadeCarga = capacidadeCarga;
    }

    

}
