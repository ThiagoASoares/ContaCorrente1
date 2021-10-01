/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacorrente;

import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author aluno
 */
public class Teste {
public static void main(String[] args){
  ContaCorrente c1 = new ContaCorrente();
  c1.getDataAberturaFormatada();
  c1.getSaldoFormatado();
  c1.depositar(1000.00);
  c1.sacar(500.00);
  c1.depositar(-150);
  c1.sacar(600.00);
 

               
        
        
        
    }
}
