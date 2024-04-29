package br.sp.senac.e169.exerciciobanco;

public class ContaPoupanca extends ContaBanco {
    
    private int diaRendimento;
    
    public ContaPoupanca(String cliente, int numConta, double saldo){
        super(cliente, numConta, saldo);
    }
    
    public void calcularNovoSaldo(double taxa) {
        this.saldo = (saldo * taxa/100) + taxa;
        
    }
    
}
