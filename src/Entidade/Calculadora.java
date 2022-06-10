package Entidade;

public class Calculadora {
	private Double resultado=0.0;
	private Double entrada=0.0;
	private String op="";
	
public void somar() {
	resultado = resultado+entrada;
	
}

public void subtrair() {
	resultado = resultado-entrada;
	
}

public void multiplicar() {
	resultado = resultado*entrada;
	
}

public void dividir() {
	resultado = resultado/entrada;
	
}

public void operação() {
	if(op.equals("X")) {
		multiplicar();
	} else if(op.equals("/")) {
		dividir();
	} else if(op.equals("-")) {
		subtrair();
	} else if(op.equals("+")) {
		somar();
	
	}
}



	public Calculadora(double resultado) {
		this.resultado=resultado;
	}

	public Double getResultado() {
		return resultado;
	}

	public void setResultado(Double resultado) {
		this.resultado = resultado;
	}

	public Double getEntrada() {
		return entrada;
	}

	public void setEntrada(Double entrada) {
		this.entrada = entrada;
	}

	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		this.op = op;
	}

	
}
