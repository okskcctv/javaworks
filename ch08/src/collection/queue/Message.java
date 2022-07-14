package collection.queue;

public class Message {
	
	public String command;	// 수행하기
	public String to;		// 대상
	
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
}
