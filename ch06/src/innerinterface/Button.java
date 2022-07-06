package innerinterface;

public class Button {
	
	// 인터페이스형 멤버 변수 (필드)
	private OnClickListener listener;
	
	// 내부 인터페이스
	interface OnClickListener{
		public void onClick();
	}
	
	public void setListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	public void touch() {
		listener.onClick();
	}
}
