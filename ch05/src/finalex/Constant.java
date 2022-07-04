package finalex;

public class Constant {
	int num = 20;
	final int NUM = 100;

	public static void main(String[] args) {
		Constant cons = new Constant();
		cons.num = 10;
		System.out.println(cons.NUM);

	}

}
