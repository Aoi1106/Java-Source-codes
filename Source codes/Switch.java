public class Switch {
	public static void main (String[] args) {
		int a = 1;
		switch(a){
			case 1:
				System.out.println("true!");
				break;
			case 2:
			case 3:
				System.out.println("false!");
				break;
			default:
				System.out.println("so false!");
				break;
		}
	}
}
