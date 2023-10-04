package newProcess;

public class Person{
	// インスタンスフィールドを定義
	public String name;
	public int age;
	public double height;
	public double weight;
	// 人数を表すインスタンスフィールドを定義
	public static int count;
	// コンストラクタを定義しインスタンスフィールドに値をセット
	public Person(String name, int age, double height, double weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		// 人数を増やす
		count++;
	}
	
	// bmiメソッドの作成
	public double bmi() {
		return this.weight / this.height / this.height;
	}
	
	// printメソッドの作成(BMIは四捨五入して出力する)
	public void print() {
		System.out.println("名前は" + this.name + "です\r\n年は" + this.age + "です\r\nBMIは" + Math.floor(this.bmi()) + "です");
	}
}