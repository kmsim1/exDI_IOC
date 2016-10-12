package exDI_IOC;

public class Driver {
	private Moveable m;

//	//������ ����(�����ڸ� ���ؼ�)
//	Driver(Moveable m) {
//		this.m = m;
//	}
	//������ ����(Setter�� ���ؼ�)
	public void setMoveable(Moveable m) {
		this.m = m;
	}
	public void drive() {
		m.engineOn();
		m.go();
		m.engineOff();
	}
}
