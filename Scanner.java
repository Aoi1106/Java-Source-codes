public class Scanner {
	public static void main(String[]args) {
		System.out.println("Please enter a number.");
		int a = new java.util.Scanner(System.in).nextInt();
		System.out.println("Please enter a sentence.");
		String b = new java.util.Scanner(System.in).nextLine();
		System.out.println(a);
		System.out.println(b);
	}
}
