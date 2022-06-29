package ScoreArray;

public class SortEx {

	public static void main(String[] args) {
		// 버블정렬
		int[] arr = new int[99999];
		int[] arr2 = new int[99999];
//			{3, 6, 9, 2, 5, 4, 10, 40, 30, 20, 15, 1};
		int i, j, temp;
		long start, end, start2, end2;
		for(i=0;i<99999;i++) {
			arr[i]=(int)(Math.random()*99999);
			arr2[i]=(int)(Math.random()*99999);
		}
		
		// 앞에서부터 인접한 항목끼리 비교를 arr 크기만큼 반복
		start = System.currentTimeMillis();
		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr.length-1;j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		end = System.currentTimeMillis();

		
		// 왼쪽에서부터 자기보다 왼쪽에있는 항목만 비교 길어질수록 횟수가 늘어남
		start2 = System.currentTimeMillis();
		for(i=0; i<arr2.length; i++) {
			for(j=0; j<i; j++) {
				if(arr2[i] < arr2[j]) { // 고정된 쪽이 작을때 바꿔야 왼쪽으로 감(왼쪽부터 비교하기 때문)
					temp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = temp;
				}
			}
		}
		end2 = System.currentTimeMillis();
		
		long passedTime = end - start;
		long passedTime2 = end2 - start2;
		System.out.println(passedTime);
		System.out.println(passedTime2);
		
//		for(int a : arr) {
//			System.out.print(a + " ");
//		}
		
	}

}
