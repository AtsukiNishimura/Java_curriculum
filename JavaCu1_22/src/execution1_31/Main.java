package execution1_31;

import process1_31.Person;

public class Main {
	public static void main(String[] argos){
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		person1.print();

		Person person2 = new Person("山田花子", 22, 1.5, 40);
		person2.print();
		// 人数の出力
	    System.out.println("\r\n合計" + Person.count + "人です\r\n");
	    // クラスメソッドの呼び出し
	    Person.printCount();
	}
}