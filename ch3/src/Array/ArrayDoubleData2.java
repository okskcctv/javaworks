package Array;

public class ArrayDoubleData2 {

	public static void main(String[] args) {
		// double
		double[] data = new double[5];
		int size = 0;
		
		data[0] = 10.0;
		size++;
		data[1] = 20.0;
		size++;
		data[2] = 30.0;
		size++;
		
		// 유효한 값만 출력가능
		for(int i=0; i<size; i++) {
			System.out.println(data[i]);
		}

	}

}
