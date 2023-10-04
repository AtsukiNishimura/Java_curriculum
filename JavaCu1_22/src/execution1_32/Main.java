package execution1_32;

import process1_32.Bicycle;
import process1_32.Car;
import process1_32.Person;

public class Main {
	public static void main(String[] args){
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
		person1.print();
		
		Person person2 = new Person("山田", "花子", 22, 1.5, 40);
		person2.print();
		
		// クラスメソッドの呼び出し
		Person.printCount();
		
		// インスタンスの生成
		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		
		// 所有者を設定
		car.setOwner(person1.fullName());
		bicycle.setOwner(person2.fullName());
		
		// 所有者を出力する
		System.out.println(car.getOwner());
		System.out.println(bicycle.getOwner());
		
		// 購入者を出力する
		person1.buy(car);
		person2.buy(bicycle);
	}
}
