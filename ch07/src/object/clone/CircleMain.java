package object.clone;

public class CircleMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		Point point = new Point(3, 4);
		System.out.println(point);
		
		Circle circle = new Circle(5, 6, 4);
		System.out.println(circle);
		
		// circle 객체 복사
		Circle copyCircle = (Circle)circle.clone();	// 클론은 완전히 별개의 객체로 복사됨
		Circle circle2 = circle;					// 직접 넣으면 객체가 동일하여 같이 바뀜
		circle.radius = 6;
		System.out.println(copyCircle);
		System.out.println(circle2);
	}
}
