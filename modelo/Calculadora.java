package modelo;

public class Calculadora {

	//Atributos
	private double num1;
	private double num2;
	private String operacion;
	private String numActual;
	private String numMemoria;
	
	//Constructor
	public Calculadora() {
		
	}
	
	//Getters and Setters
	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public String getOperacion() {
		return operacion;
	}

	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}

	public String getNumActual() {
		return numActual;
	}

	public void setNumActual(String numActual) {
		this.numActual = numActual;
	}

	public String getNumMemoria() {
		return numMemoria;
	}

	public void setNumMemoria(String numMemoria) {
		this.numMemoria = numMemoria;
	}
	
	//Metodos
	public double sumar(){
		return num1+num2;
	}
	
	public double restar(){
		return num1-num2;
	}
	
	public double multiplicar(){
		return num1*num2;
	}
//	public double dividir() throws DivisionPorCeroExcepcion{...}
}
