package Reference;

public class Circle {
	
	Point point; // 객체 메모리
	int radius; // 반지름
	
	public Circle(int x, int y, int radius) {
		point = new Point(x, y);
		this.radius = radius;
	}
	
	public String showInfo() {
		return "중심점은 " + point.x + ", " + point.y + ", 반지름은 " +
				radius + "입니다.";
	}
}
