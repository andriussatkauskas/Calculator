package calc;

public class QuadraticEquation {
	private int a;
	private int b;
	private int c;
	private int d;
	
	public QuadraticEquation(int a, int b, int c, int d){
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	public void ats(){
		int  dis =(b*b) - 4*a*c;
		if (dis > 0){
			double x1 =(-b + Math.sqrt(dis)) / 2*a;
			double x2 =(b - Math.sqrt(dis)) / 2*a;
			System.out.printf("Iksas pirmas = %d\n Iksas antras = %d\n", x1, x2);
		}else {
			double x = -(b)/2*a;
			System.out.println("Atsakymas = " +x);
		}
		
	}

}