package type;

public class PrintFormat {

	public static void main(String[] args) {
		//
		int year = 2022;
		System.out.printf("년도는 %d\n", year);
		
		float weight =63.7F;
		System.out.printf("몸무게는 %.2f\n", weight);
		
		String nick = "얼음 공주";
		System.out.printf("별명은 %s\n", nick);
		
		System.out.println("---------------");
		System.out.println("이름\t나이\t나라");
		System.out.println("---------------");
		
		String table = "";
		table += "---------------\n";
		table += "이름\t나이\t나라\n";
		table += "강감찬\t83\t고려\n";
		table += "이순신\t53\t조선\n";
		table += "---------------\n";
		System.out.println(table);
		
	}

}
