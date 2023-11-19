package model;

public class Funcionario extends Pessoa{
    
    private String matricula; 


    public Funcionario(){}


    public Funcionario(String matricula){
        super();
        this.matricula = matricula; 
    }


    public String getMatricula(){
        return this.matricula; 
    }

    public void setMatricula(String matricula){
        this.matricula = matricula; 
    }


}
