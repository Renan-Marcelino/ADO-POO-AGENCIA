package br.sp.senac.e169.exerciciobanco;

public class ContaEspecial extends ContaBanco {
    
    private double limite;

    public ContaEspecial(String cliente, int numConta, double saldo){
        super(cliente, numConta, saldo);
    }
    
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }    
}
