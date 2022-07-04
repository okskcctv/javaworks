package polymorphism.child;

public class ChildTest {

	public static void main(String[] args) {
		// Child child = new Child();
		
		// Parent parent = child;
		Parent child = new Child();
		
		child.method();
		child.method2(); // 자동 형변환 되어도 자식 클래스를 찾아감
		// parent.method3(); // 호출 불가(부모에 없는 메서드)
		
		// 강제 형변환
		Child child2 = (Child)child;
		child2.method3();

	}

}
