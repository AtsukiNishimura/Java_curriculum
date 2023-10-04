package process1_32;

public class Person {
	public static int count = 0;
	public String firstName;
	public int age;
	public double height, weight;
	// インスタンスフィールドを追加
	public String lastName;

	public Person(String firstName, int age, double height, double weight){
		Person.count++;
		this.firstName = firstName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	// lastNameを含むコンストラクタの作成
	public Person(String firstName, String lastName, int age, double height, double weight){
		Person.count++;
		// 値をセット
		this.firstName = firstName;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.lastName = lastName;
	}

	public String fullName(){
		return this.firstName + this.lastName;
	}

	public void print(){
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "です");
	}

	public double bmi(){
		return this.weight / this.height / this.height;
	}
	
	public static void printCount(){
		System.out.println("合計" + Person.count + "人です");
	}
}
