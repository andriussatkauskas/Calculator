package calc;

public class Calculator {

	private double one;
	private double two;

	public static void calculateSin(double a) {
		// Convert degrees to radian
		a = Math.toRadians(a);
		System.out.println("Sin: " + Math.sin(a));

	}

	public static void calculateCos(double a) {
		// Convert degrees to radian
		a = Math.toRadians(a);
		System.out.println("Cos: " + Math.cos(a));

	}

	public static void calculateTn(double a) {
		// Convert degrees to radian
		a = Math.toRadians(a);
		System.out.println("Tng: " + Math.tan(a));

	}

	public static void calculateCtn(double a) {
		// Convert degrees to radian
		a = Math.toRadians(a);
		System.out.println("Ctg: " + 1 / Math.tan(a));

	}

}
