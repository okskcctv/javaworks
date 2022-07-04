package virtualmethod;

public class TestA {
	int num;
	
	void aaa() {
		System.out.println("aaa() 출력");
	}
	
	public static void main(String[] args) {
		TestA a1 = new TestA();
		a1.num = 10;
		a1.aaa();
		
		TestA a2 = new TestA();
		a2.num = 20;
		a2.aaa();
		
		// a1, a2 는 heap 영역을 가르킴
		// heap에는 a1.num과 a2.num이 있음
		// aaa()는 데이터 영역에 위치
	}
}
