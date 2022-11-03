package studio7;

public class Die {
	private int n;
	
	public Die(int side) {
		n = side;
	}
	
	public int throwDice() {
		return (int) (Math.random()*(n+1));
	}
	
	public static void main(String[] args) {
		Die dice = new Die(7);
		System.out.println(dice.throwDice());
	}
}
