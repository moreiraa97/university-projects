package model;

public class Diaria extends AluguelDeAutomovel{
 
    private int valorDiarias; 
    private int numeroDiarias; 


    public Diaria(){}


    public Diaria(int valorDiarias, int numeroDiarias){
        super();
        this.valorDiarias = valorDiarias;
        this.numeroDiarias = numeroDiarias;
    }


    public int getValorDiarias(){
        return this.valorDiarias;
    }

    public void setValorDiarias(int valorDiarias){
        this.valorDiarias = valorDiarias;
    }


    public int getNumeroDiarias(){
        return this.numeroDiarias;
    }

    public void setNumeroDiarias(int numeroDiarias){
        this.numeroDiarias = numeroDiarias;
    }


    @Override
    public void calcularValorTotal(int valorDiarias, int numeroDiarias) {
        
        super.calcularValorTotal(valorDiarias, numeroDiarias);

    }


}
