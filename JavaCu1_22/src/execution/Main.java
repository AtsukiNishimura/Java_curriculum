package execution;

import newProcess.Person;

class Main {
	  public static void main(String[] args) {
		// 人数を初期化する
		Person.count = 0;
	    Person person1 = new Person("鈴木太郎", 20, 1.7, 60.0);
	    System.out.println(person1.name);
	    System.out.println(person1.age);
	    System.out.println(person1.height);
	    System.out.println();
	    // printメソッドの呼び出し
	    person1.print();
	    // 人数の出力
	    System.out.println("人数は" + Person.count + "人です");
	  }
	} 