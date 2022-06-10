package Aplicação;



import javax.swing.JOptionPane;

import Entidade.Calculadora;

public class Programa {
	
	
public static void main(String[] args) {
	    String resultado = JOptionPane.showInputDialog("Digite um número");
	    double resultadoFormatado = Double.parseDouble(resultado);
	    Calculadora cal = new Calculadora(resultadoFormatado);
	   String op = JOptionPane.showInputDialog("(-) Subtrair , (+) Somar , (/) Dividir , (X) Multiplicar , (*) Para sair").toUpperCase();
	    while(op.equals("X") || op.equals("-") ||  op.equals("+") ||  op.equals("/")) {
	    	cal.setOp(op);
	    	String entrada = JOptionPane.showInputDialog("Digite um número");
		    double entradaFormatada = Double.parseDouble(entrada);
	    	cal.setEntrada(entradaFormatada);
	    	cal.operação();
	    	op = JOptionPane.showInputDialog("Resultado : "+cal.getResultado()+"\n " 
	    	+ "(-) Subtrair , (+) Somar , (/) Dividir , (X) Multiplicar , (*) Para sair").toUpperCase();
	      
	 	   
	    }
	    if(op.equals("*")) {
	       JOptionPane.showInputDialog(null, "Programa Finalizado!");
	    } else {
	       JOptionPane.showInputDialog(null, "Comando inválido!");
	    }
	
	}

}
