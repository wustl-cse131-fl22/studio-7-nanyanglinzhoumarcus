package studio7;

public class complex {
	private double a;
	private double b;
	
	public complex(double nn, double mm) {
		a = nn;
		b = mm;
	}
	
	public String add(double c, double d) {
		String result = a+c + "+" + b+d +"i";
		return result;
	}
	
	public String multiply(double c, double d) {
		String result2 = (a*c-b*d) + "+" + (a*d+b*c) + "i";
		return result2;
	}
	
	public static void main(String[] args) {
		complex cc = new complex(3.0, 4.0); 
		System.out.println(cc.add(1.0, 2.0));
		System.out.println(cc.multiply(3.0,4.0));
	}

}
