public class Returnvalue {
	public static void main(String[] args) {
		int num = add(100,200);
		System.out.println(num);
	}
	public static int add(int x,int y) {
		int num = x + y;
		return num;
	}
}
