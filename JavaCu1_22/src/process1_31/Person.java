package process1_31;

public class Person {
		public String name;
		public int age;
		public double height;
		public double weight;
	
	// クラスフィールドの作成
	public static int count;

	public Person(String name, int age, double height, double weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		count++;
	}

	public double bmi(){
		return this.weight / this.height / this.height;
	}

	public void print(){
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
	}
	// クラスメソッドの作成
	public static void printCount() {
		System.out.println("合計" + count + "人です");
	}
}
