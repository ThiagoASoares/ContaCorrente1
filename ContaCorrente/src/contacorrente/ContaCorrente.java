/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacorrente;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ThiagoASoares
 */
public class ContaCorrente {
    private Double saldo;
    private Date dataAbertura;

    public Double getSaldo() {
        return saldo;
    }

    
    public Date getDataAbertura() {
        return dataAbertura;
    }

    public ContaCorrente() {
        this.saldo = 0.0;
        Date data =new Date();
        this.dataAbertura = data;
    }

   
public void getDataAberturaFormatada(){
    
    SimpleDateFormat sdf1= new SimpleDateFormat("dd/MM/yyyy"); 
    System.out.println("Data de Abertura desta Conta :" + sdf1.format(this.dataAbertura));
}

public void getSaldoFormatado(){
    System.out.println("Saldo atual da conta : R$"+this.saldo);
}
public void depositar(double valorDepositado){
    if(valorDepositado>0){
    this.saldo = this.saldo + valorDepositado;
        System.out.println("Valor depositado com sucesso");
        getSaldoFormatado();
    }else{
        System.out.println("Valor a ser depositado incoreto");
         }
       
}
public void sacar(double valorSacar){
    if(this.saldo>= valorSacar){
        this.saldo = this.saldo - valorSacar;
        System.out.println("Saque efetuado com sucesso");
        getSaldoFormatado();
    }else{
        System.out.println("Saldo insuficiente");
    }
    
}

}
