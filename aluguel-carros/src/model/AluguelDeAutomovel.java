package model;

public abstract class AluguelDeAutomovel {
    
    private Cliente cliente; 
    private Automovel automovel; 
    private String dataInicio; 
    private String dataFim; 
    private float valorTotal; 
    private String status; //pendente ou concluído
    
    
    public AluguelDeAutomovel(){}


    public AluguelDeAutomovel(Cliente cliente, Automovel automovel, String dataInicio, String dataFim, float valorTotal, String status){
        this.cliente = cliente; 
        this.automovel = automovel; 
        this.dataInicio = dataInicio; 
        this.dataFim = dataFim; 
        this.valorTotal = valorTotal; 
        this.status = "Pendente"; 
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public Automovel getAutomovel() {
        return automovel;
    }

    public void setAutomovel(Automovel automovel) {
        this.automovel = automovel;
    }


    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }


    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }


    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public void calcularValorTotal(int valorTipo, int quantidadeTempo){

        this.valorTotal = valorTipo * quantidadeTempo; 

        //método a ser sobreposto nas subclasses
        //valorTipo >> valorDiarias ou valorMes
        //quantidadeTempo >> numeroDiarias ou numeroMeses

    }

    public void confirmarReserva(){
        this.status = "Concluído";
    }

    public void cancelarReserva(){
        this.status = "Cancelado"; 
    }


}
