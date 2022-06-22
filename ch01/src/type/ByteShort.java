package type;

public class ByteShort {

	public static void main(String[] args) {
		// byte 자료 범위 -128 ~ 127
		byte bData1 = -128;
		System.out.println(bData1);
		
		// byte bData2 = 128; // 범위 초과 컴파일 에러
		
		short sData1 = 32767; // short 자료 범위 -32768 ~ 32767
		System.out.println(sData1);

		// short sData2 = 32768; // 범위 초과 컴파일 에러

	}

}
