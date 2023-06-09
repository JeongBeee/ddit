package homework;

public class NewCar {
	
	// 필드
	private double speed;
	private String color;
	private static final double MAX_SPEED  = 200.0 / 1.6; // killoToMile(200)

	// 생성자
	public NewCar() {
	}

	public NewCar(String color) {
		this.color = color;
	}

	// 메소드
	public double getSpeed() { // 외부에서
		return mileToKilo(speed);
	}

	public void setSpeed(double speed) { // 내부에서
		this.speed = killoToMile(speed);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean speedUp(double speed) {
		speed = killoToMile(speed);
		if (speed + this.speed >= 0 && speed + this.speed <= MAX_SPEED) {
			this.speed += speed;
			return true;
		} else {
			return false;
		}
	}

	static double getMaxSpeed() { // 외부에서
		return mileToKilo(MAX_SPEED);
	}

	static private double killoToMile(double distance) {
		return distance / 1.6; // km -> mile (1mile = 1.6km)
	}

	static private double mileToKilo(double distance) {
		return distance * 1.6;
	}

	public String toString() {
		return String.format("%d", speed);
	}
}
