package ch01;

public class TypeConversion {

	public static void main(String[] args) {
		// 형 변환
		int iNum = 20;
		float fNum = iNum;
		System.out.println(iNum);
		System.out.println(fNum);
		
		double dNum;
		dNum = iNum + fNum;
		System.out.println(dNum);
		
		double dNum2 = 1.2;
		float fNum2 = 0.9F;
		
		int iNum2 = (int)dNum2 + (int)fNum2;
		int iNum3 = (int)(dNum2 + fNum2);
		
		System.out.println(iNum2);
		System.out.println(iNum3);

	}

}
