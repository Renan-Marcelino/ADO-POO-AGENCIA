package br.sp.senac.e169.exerciciobanco;

import java.util.*;

public class ExercicioBanco {

    public static void main(String[] args) {
        /*  ContaEspecial oE = new ContaEspecial();
        oE.cliente = "Pedro Alvares Cabral";
        oE.numConta = 15000422;
        oE.saldo = 9000;
        oE.setLimite(100);
        oE.sacar(5000);

        ContaPoupanca oP = new ContaPoupanca();
        oP.cliente = "Deodoro da Fonseca";
        oP.numConta = 18891511;
        oP.saldo = 1000;
        oP.calcularNovoSaldo(1);

        ContaPoupanca oP1 = new ContaPoupanca();
        oP1.cliente = "Pedro I";
        oP1.numConta = 18220907;
        oP1.saldo = 100000;
        oP1.calcularNovoSaldo(0.6);
        
        ContaBanco oB[] = new ContaBanco[3];
        oB[0] = oE;
        oB[1] = oP;
        oB[2] = oP1;
        
        oB[0].mostrarExtrato();
        oB[1].mostrarExtrato();
        oB[2].mostrarExtrato();
        
        int cont = 0;
        int contE = 0;
        int contP = 0;
       
        for (int i = 0; i < oB.length; i++) {
            oB[i].mostrarExtrato();
            if (oB[i] instanceof ContaPoupanca) {
                contP++;
            } else {
                contE++;
            }
        }
        System.out.println("% Contas Poupança: " +(contP/(cont*1.))*100);
        System.out.println("% Contas Especial: " +(contE/(cont*1.))*100);

        ContaBanco oB[] = new ContaBanco[15];
        for (int i = 0; i < oB.length; i++) {
            int sorteio = (int) (Math.random() * 1000);
            if (sorteio % 2 == 0) {
                oB[i] = new ContaBanco("alexandre", 122545, 1000);
            } else {
                oB[i] = new ContaBanco("renan", 12112, 2000);
            }
            oB[i].mostrarExtrato();
        }*/
        Agencia agencia = new Agencia("alexandre", 1212, 1000);
        agencia.gerarConta();
        agencia.calcPorcentagem();

    }
}
