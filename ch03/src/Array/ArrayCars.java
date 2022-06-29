package Array;

public class ArrayCars {

	public static void main(String[] args) {
		// 문자열 배열
		/* String[] cars = new String[4];
		cars[0] = "Morning";
		cars[1] = "Sonata";
		cars[2] = "Spotage";
		cars[3] = "K7"; */
		
		String[] cars = {"Morning", "Sonata", "Spotage", "K7"};
		
		for(int i=0; i<cars.length; i++) {
			System.out.printf("%s ", cars[i]);
		}

		System.out.println();
		cars[2] = "BMW";
		System.out.printf("%s\n", cars[2]);
		
		// 향상된 for문 객체방식
		for(String car : cars) {
			System.out.printf("%s ", car);
		}
	}

}
