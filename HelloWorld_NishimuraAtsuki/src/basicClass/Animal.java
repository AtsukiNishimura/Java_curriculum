package basicClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Animal {
	
	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		Dog dog1 = new Dog();
		System.out.println("動物の名前:" + dog1.name);
		System.out.println();
		
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		
		// 引数に動物の数を入れて、値を出力する
		Dog dog2 = new Dog(5);
		System.out.println("動物の数:" + dog2.number);
		System.out.println();
		
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		
		// オブジェクトを生成する
		Calendar cl = Calendar.getInstance();
		
		//フォーマットを変更する
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd H:m:s");
		System.out.println(sdf.format(cl.getTime()));
    }
}