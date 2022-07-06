package chap09;

public class Test9_1 {
	public static void main(String[] args) {
		// 1.O 2.O 3.O 4.X
		
		// 3
		
		Car myCar = new Car();
		
		Car.Tire tire = myCar.new Tire();
		
		Car.Engine engine = new Car.Engine();
		
		CheckBox checkBox = new CheckBox();
		checkBox.setOnSelectListener(new BackgroundChangeListener());
		checkBox.select();
	}
}

class Car{
	class Tire{}
	static class Engine{}
}

class Chatting{
	
	void startChat(String chatId) {
		// nickName이 final 속성을 갖게 되어 수정이 불가능함 한번에 선언해줘야함
		/* String nickName = null;
		nickName = chatId; */
		String nickName = chatId;
				
		class Chat{
			public void start() {
				while(true) {
					String inputData = "안녕하세요";
					String message = "[" + nickName + "]" + inputData;
					sendMessage(message);
				}
			}
			
			void sendMessage(String message) {
				
			}
		}
		
		Chat chat = new Chat();
		chat.start();
	}
}

class CheckBox{
	OnSelectListener listener;
	
	void setOnSelectListener(OnSelectListener listener) {
		this.listener = listener;
	}
	
	void select() {
		listener.onSelect();
	}
	
	static interface OnSelectListener{
		void onSelect();
	}
}

class BackgroundChangeListener implements CheckBox.OnSelectListener{

	@Override
	public void onSelect() {
		System.out.println("배경을 변경합니다.");
	}
	
}