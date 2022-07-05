package interfaceex.calculator;

public interface Calculator {
	
	int ERROR = -99999;
	
	// 추상 메서드
	int add(int n1, int n2);
	int subtract(int n1, int n2);
	int times(int n1, int n2);
	int divide(int n1, int n2);
}
