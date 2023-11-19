package model;

public class Cliente extends Pessoa{
    
    private String cpf; 


    public Cliente(){}
    

    public Cliente(String cpf){
        super();
        this.cpf = cpf;       
    }


    public String getCpf(){
        return this.cpf; 
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf; 
    }


}
