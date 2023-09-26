public class Calculadora {
	private double num1;
	private double num2;
	private double resultado;

	public Calculadora(double x, double y) {
		this.num1 = x;
		this.num2 = y;
	}
	
	public void somar() {
		this.resultado=this.num1+this.num2;
	}
	
	public void sub() {
		this.resultado=this.num1-this.num2;
	}
	
	public void multi() {
		this.resultado=this.num1*this.num2;
	}
	
	public void div() {
		this.resultado=this.num1/this.num2;
	}
	
	public void contSoma() {
		this.resultado+=this.num1;
	}
	public void contSub() {
		this.resultado-=this.num1;
	}
	public void contMulti() {
		this.resultado*=this.num1;
	}
	public void contDiv() {
		this.resultado/=this.num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public String toString() {
		return "O é resultado: " + this.resultado;
	}
	
}
