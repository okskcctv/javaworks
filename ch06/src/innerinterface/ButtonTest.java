package innerinterface;

public class ButtonTest {

	public static void main(String[] args) {
		Button button = new Button();
		// CallListener 객체를 매개변수로 전달
		button.setListener(new CallListener());
		button.touch();
		
		button.setListener(new MessageListener());
		button.touch();
		
		// 익명 객체 구현 (구현 클래스 만들지 않음) - 사진찍기
		button.setListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("사진을 찍습니다.");
			}
		});
		button.touch();
	}

}
