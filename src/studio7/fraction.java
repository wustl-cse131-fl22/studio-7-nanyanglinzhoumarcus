package studio7;

public class fraction {
	private int numerator;
	private int denominator;
	
	public fraction(int n1, int d1) {
		numerator = n1;
		denominator = d1;
	}
	
	public double add(int n2, int d2) {
		double result = (double) numerator/(double) (denominator) + (double) (n2)/(double) (d2);
		return result;
	}
	
	public double multiply(int n3, int d3) {
		return (double) (numerator)/(double)(denominator) * (double)(n3)/d3;
	}
	
	public String recip() {
		return denominator + "/" + numerator;
	}
	
	public String simplify() {
		
		for (int i = (int) Math.min(denominator, numerator); i > 0; i--) {
			if (denominator % i == 0 && numerator % i == 0) {
				denominator = denominator / i;
				numerator = numerator / i;
			}
			
		}
		return  numerator+ "/" + denominator;
	}
	
	public static void main(String[] args) {
		fraction f = new fraction(5,20);
		System.out.println(f.add(3,6));
		System.out.println(f.multiply(3,6));
		System.out.println(f.recip());
		System.out.println(f.simplify());
		
	}

}
