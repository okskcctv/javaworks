package generic.printer;

public class GenericPrinterTest {

	public static void main(String[] args) {
		// Powder 자료형 사용
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
		powderPrinter.setMaterial(new Powder());
		System.out.println(powderPrinter);

		//Plastic 자료형 사용
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
		plasticPrinter.setMaterial(new Plastic());
		System.out.println(plasticPrinter);
	}

}
