package Array;

public class ArrayCopy {

	public static void main(String[] args) {
		// 배열 복사
		int[] array1 = {10, 20, 30, 40};
		int[] array2 = new int[4];
		
		for(int i=0;i<array1.length;i++) {
			array2[i] = array1[i];
		}
		
		for(int array : array2) {
			System.out.println(array);
		}
		
		char[] ar1 = {'N', 'E', 'T'};
		char[] ar2 = new char[3];
		char[] ar3 = new char[3];
		
		for(int i=0;i<ar1.length;i++) {
			ar2[i]=ar1[i];
		}
		
		for(char ar : ar2) {
			System.out.println(ar);
		}
		
		// 역순
		for(int i=0;i<ar1.length;i++) {
			ar3[i]=ar1[ar1.length-i-1];
		}
		
		for(char ar : ar3) {
			System.out.println(ar);
		}
	}

}
