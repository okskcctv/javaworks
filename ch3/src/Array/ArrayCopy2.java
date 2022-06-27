package Array;

public class ArrayCopy2 {

	public static void main(String[] args) {
		// arraycopy 함수
		
		int[] a = {1, 2, 3, 4};
		int[] a2 = new int[4];
		
		// 복사할 대상, 배열 인덱스, 복사받을 대상, 배열 인덱스, 배열의 크기
		System.arraycopy(a, 0, a2, 0, 4);
		for(int i : a2) {
			System.out.printf("%d ",i);
		}
		System.out.println();
		
		// object 클래스의 매서드 clone()
		int[] a3 = a2.clone();
		for(int i : a3) {
			System.out.printf("%d ",i);
		}

	}

}