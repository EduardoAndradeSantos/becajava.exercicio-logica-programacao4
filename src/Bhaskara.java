import java.util.Scanner;

public class Bhaskara {
	public Scanner Ler = new Scanner(System.in);
	public double A;
	public double B;
	public double C;
	public double Delta;
	public double X1;
	public double X2;

	public void InsereA() {
		System.out.printf("Valor a: ");
		A = (double) Ler.nextDouble();
	}

	public void InsereB() {
		System.out.printf("Valor b: ");
		B = (double) Ler.nextDouble();
	}

	public void InsereC() {
		System.out.printf("Valor c: ");
		C = (double) Ler.nextDouble();
	}

	public void CalculaDelta() {
		Delta = ((Delta = B * B) - (4 * A * C));
	}

	public void CalculaX1() {
		X1 = ((-B) + (Math.sqrt(Delta))) / 2 * A;
	}

	public void CalculaX2() {
		X2 = ((-B) - (Math.sqrt(Delta))) / 2 * A;
	}

	public void ImprimeResultado() {
		System.out.println("delta:" + Delta);
		System.out.println("x1:" + X1);
		System.out.println("x2:" + X2);
	}
}
