package exDI_IOC;

public class Main {
	public static void main(String[] args) {
		Driver p1 = new Driver();
		Moveable m = new Plane();
		
		p1.setMoveable(m); //Setter를 통한 주입.
		p1.drive();
	}
}
