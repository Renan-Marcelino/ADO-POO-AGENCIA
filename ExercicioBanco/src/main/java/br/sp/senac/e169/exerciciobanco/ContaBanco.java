package br.sp.senac.e169.exerciciobanco;

public class ContaBanco {
    protected String cliente;
    protected int numConta;
    protected double saldo;
    
    public ContaBanco(String cliente, int numConta, double saldo) {
        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }
    
    public void sacar(double valor){
        if(this.saldo - valor < 0) {
            System.out.println("Saldo Insuficiente");
        }else{
            this.saldo -= valor;
        }
    }
    
    public void depositar(int valor){
        this.saldo += valor;
    }
    
    public void mostrarExtrato(){
        System.out.println("Cont: " + numConta + "\tSaldo: " + saldo);
    }
}
