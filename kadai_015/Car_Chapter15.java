package kadai_015;

public class Car_Chapter15 {

	private int gear; // 1速から5速のギアを表す	
	private int speed; // ギアチェンジ後の速度を表す
	
	
	public Car_Chapter15( int gear, int speed ) {
		
		this.gear = gear;
		this.speed = speed;
		
	}
	
	
	// ギアの値により速度を変えるメソッド
	public void gearChange( int afterGear) {
		
		switch(afterGear) {
			case 1 -> this.speed = 10;
			case 2 -> this.speed = 20;
			case 3 -> this.speed = 30;
			case 4 -> this.speed = 40;
			case 5 -> this.speed = 50;
		default -> this.speed = 10;
		}
		
		this.gear = afterGear;
	}
	
	
	//ギアチェンジ後の速度を表示するメソッド
	public void run() {
		
		System.out.println("ギア1から" + this.gear + "に切り替えました");
		System.out.println("速度は時速" + this.speed + "kmです");
		
	};
	
	
}
