package process;

public class Animals {
	// メンバ変数の作成
	private String animalName;
	private String length;
	private String speed;
	private String scName;
	
	// ゲッターメソッドの作成
	public String getAnimalName() {
		return this.animalName;
	}
	public String getLength() {
		return this.length;
	}
	public String getSpeed() {
		return this.speed;
	}
	public String getScName() {
		return this.scName;
	}
	
	// セッターメソッドの作成
	public void setAnimals(String animalName, String length, String speed, String scName) {
		this.animalName = animalName;
		this.length = length;
		this.speed = speed;
		this.scName = scName;
	}
	
	// 出力用メソッドの作成
	public void printData() {
		System.out.println("動物名：" + getAnimalName());
		System.out.println("体長：" + getLength() + "m");
		System.out.println("速度：" + getSpeed() + "km/h");
		System.out.println("学名：" + getScName());
	}
}
