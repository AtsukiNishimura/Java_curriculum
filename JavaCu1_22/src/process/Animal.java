package process;

public class Animal {
	// メンバ変数の作成
	private String animalName;
	private double length;
	private int speed;
	
	// ゲッターメソッドの作成
	public String getAnimalName() {
		return this.animalName;
	}
	public double getLength() {
		return this.length;
	}
	public int getSpeed() {
		return this.speed;
	}
	
	// セッターメソッドの作成
	public void setAnimal(String animalName, double length, int speed) {
		this.animalName = animalName;
		this.length = length;
		this.speed = speed;
	}
	
	// 出力用のメソッドの作成
	public void info() {
		System.out.println("動物名 : " + getAnimalName());
		System.out.println("体長 : " + getLength() + "m");
		System.out.println("速度 : " + getSpeed() + "km/h");
	}

}
