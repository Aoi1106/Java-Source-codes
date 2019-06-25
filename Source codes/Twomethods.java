public class Twomethods {
	public static void main(String[] args) {
		System.out.println("I started methods.");
		abcde(1,2);
		abcde(10,20);
	}
	public static void abcde(int x, int y) {
		int z = x*y;
		System.out.println(x+" * "+y+" is "+z+".");
	}
}
