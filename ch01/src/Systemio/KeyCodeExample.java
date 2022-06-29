package Systemio;

import java.lang.Exception;

public class KeyCodeExample {

	public static void main(String[] args) throws Exception {
		int keyCode;
		
		System.out.println("딱 한글자만 쳐보세요.");
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);

	}

}
