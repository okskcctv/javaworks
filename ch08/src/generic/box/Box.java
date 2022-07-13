package generic.box;

public class Box<T> {
	private T material;
	
	public void set(T material){
		this.material = material;
	}
	
	public T get() {
		return material;
	}
	
	@Override
	public String toString() {
		return material.toString();
	}
}
