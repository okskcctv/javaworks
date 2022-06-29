package Statics;

public class Student {
	static int serialNum = 100;	// 기준번호
	int id;		// 학번
	String name;// 이름
	
	public Student() {}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}