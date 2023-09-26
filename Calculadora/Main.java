import java.util.Scanner;
public class Main {

	public static void menu(){
		System.out.println("");
			System.out.println("### Menu ###");
			System.out.println("1 - Soma");
			System.out.println("2 - Subtração");
			System.out.println("3 - Multiplicação");
			System.out.println("4 - Divisão");
			System.out.println("");
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o valor do primeiro número: ");
		double x = input.nextDouble();
		System.out.print("Digite o valor do segundo número: ");
		double y = input.nextDouble();
		
		Calculadora calc = new Calculadora(x,y);
		int	f,n=0,m=0;
		menu();
		do {
		System.out.print("Digite sua opção: ");
		f = input.nextInt();
		if(f>4||f<1) {
			System.out.println("Por favor, insira uma das quatro opções!");
		}
		
		else {
		switch(f) {
		case 1:
			calc.somar();
			break;
		case 2:
			calc.sub();
			break;
		case 3:
			calc.multi();
			break;
		case 4:
			calc.div();
			break;
			
		}
		n++;
		}}while(n==0);
		while(m==0) {
		System.out.print("Deseja adicionar outro número? (1-Sim / 2-Não)");
		int	a= input.nextInt();
		if(a==1) {
			menu();
			System.out.print("Digite sua opção: ");
			f = input.nextInt();
			System.out.print("Digite o valor do novo número: ");
			x = input.nextDouble();
			calc.setNum1(x);
			switch(f) {
			case 1:
				calc.contSoma();
				break;
			case 2:
				calc.contSub();
				break;
			case 3:
				calc.contMulti();
				break;
			case 4:
				calc.contDiv();
				break;
				
			}
		}
		else if(a==2) {
			m++;
		}
		else {
			System.out.println("Por favor, insira uma das duas opções!");
		}
	}
		System.out.println(calc.toString());
		System.out.println("Projeto encerrado com sucesso.");
		input.close();
	}

}
