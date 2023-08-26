package curriculum_A;

public class Qes1_13 {
	public static void main(String[] args) {
		// バイト型を宣言し、初期値を設定
		byte number = 0;
		// 変数 numberに 10を代入
		number = 10;
		
		// 短整数型を宣言し、初期値を設定
		short shortInt = 0;
		// 変数 shortIntに 100を代入
		shortInt = 100;
		
		// 整数型を宣言し、初期値を設定
		int integerNum = 0;
		// 変数 integerNumに 1000を代入
		integerNum = 1000;
		
		// 長整数型を宣言し、初期値を設定
		long longInt = 0;
		// 変数 longIntに 10000を代入
		longInt = 10000;
		
		// 単精度浮動小数点型を宣言し、初期値を設定
		float floatNum = 0.0f;
		// 変数 floatNumに 9.5を代入
		floatNum = 9.5f;
		
		// 倍精度浮動小数点型を宣言し、初期値を設定
		double doubleNum = 0.0d;
		// 変数 doubleNumに 10.5を代入
		doubleNum = 10.5;
		
		// 文字型を宣言し、初期値を設定
		char alphabet = '\u0000';
		// 変数 alphabetに 'a'を代入
		alphabet = 'a';
		
		// 文字列型を宣言し、初期値を設定
		String greet = null;
		// 変数 greetに "ハロー"を代入
		greet = "ハロー";
		
		// ブーリアン型を宣言し、初期値を設定
		boolean bool = false;
		// 変数 boolに trueを代入
		bool = true;
		
		// 11110 をコンソール出力
		System.out.println(longInt + integerNum + shortInt + number);
		
		// 20 をコンソール出力
		System.out.println(number * 2);
		
		// "a ハロー true" をコンソール出力
		System.out.println(alphabet + " " + greet + " " + bool);
		
		// 数字の合計を整数型に変換し、変数 sumに代入
		int sum = (int)(number + shortInt + integerNum + longInt + floatNum + doubleNum);
		// 変数 sumをコンソール出力
		System.out.println(sum);
		
		// 変数 number, shortInt, integerNum, longIntを全てかけた値をコンソール出力
		System.out.println(number * shortInt * integerNum * longInt);
		
		// 変数 doubleNumを、変数 shortIntで割った値をコンソール出力
		System.out.println(doubleNum / shortInt);
		
		// 変数 numberから変数 shortIntを引いた値をコンソール出力
		System.out.println(number - shortInt);
		
		// "ハローJAVA43"をコンソール出力
		int num = 20;
		int num1 = 23;
		System.out.println("ハローJAVA" + (num + num1));
		
		// 変数 nameを宣言し、山田太郎を代入
		String name = "山田太郎";
		
		// 変数 ageを宣言し、18を代入
		int age = 18;
		
		// 変数 heightを宣言し、170.5を代入
		double height = 170.5;
		
		// 変数 weightを宣言し、62.2を代入
		double weight = 62.2;
		
		// 変数 foodを宣言し、寿司を代入
		String food = "寿司";
		
		// 「初めまして○○です」をコンソール出力
		System.out.println("はじめまして" + name + "です");
		
		// 「年齢は○○歳です」をコンソール出力
		System.out.println("年齢は" + age + "歳です");
		
		// 「身長は○○cmです」をコンソール出力
		System.out.println("身長は" + height + "cmです");
		
		// 「体重は○○kgです」をコンソール出力
		System.out.println("体重は" + weight + "kgです");
		
		// 「好きな食べ物は○○です」をコンソール出力
		System.out.println("好きな食べ物は" + food + "です");
		
		// 変数 bmiを宣言し、計算結果を代入
		double bmi = weight / height / height * 10000;
		// BMIをコンソール出力(小数第一位まで表示)
		System.out.println("BMIは" + String.format("%.1f", bmi) + "です");
		
		// 変数 nameに 鈴木一郎を代入
		name = "鈴木一郎";
		// 「初めまして鈴木一郎です」をコンソール出力
		System.out.println("はじめまして" + name + "です");
		
		// 変数 ageに 24を代入
		age = 24;
		//「年齢は24歳です」をコンソール出力
		System.out.println("年齢は" + age + "歳です");
		
		// 変数 heightに 168.5を代入
		height = 168.5;
		// 「身長168.5cmです」をコンソール出力
		System.out.println("身長は" + height + "cmです");
		
		// 変数 weightに 64.2を代入
		weight = 64.2;
		// 「体重は64.2kgです」をコンソール出力
		System.out.println("体重は" + weight + "kgです");
		
		// 変数 foodに オムライスを代入
		food = "オムライス";
		// 「好きな食べ物はオムライスです」をコンソール出力
		System.out.println("好きな食べ物は" + food + "です");
		
		// 変数 newBmiを宣言し、計算結果を代入
		double newBmi = weight / height / height * 10000;
		// BMIをコンソール出力(小数第一位まで表示)
		System.out.println("BMIは" + String.format("%.1f", newBmi) + "です");
		
		// 変数 ageを和算で自己代入
		age += age;
		// 変数 heightを和算で自己代入
		height += height;
		// 変数 weightを和算で自己代入
		weight += weight;
		
		// 「初めまして鈴木一郎です」をコンソール出力
		System.out.println("はじめまして" + name + "です");
		
		// 変数 ageを用いて、年齢の紹介文をコンソール出力
		System.out.println("年齢は" + age + "歳です");
		
		
		// 変数 heightを用いて、身長の紹介文をコンソール出力
		System.out.println("身長は" + height + "cmです");
		
		// 変数 weightを用いて、体重の紹介文をコンソール出力
		System.out.println("体重は" + weight + "kgです");
		
		// 「好きな食べ物はオムライスです」をコンソール出力
		System.out.println("好きな食べ物は" + food + "です");
		
		// 変数 lateBmiを宣言し、計算結果を代入
		double lateBmi = weight / height / height * 10000;
		// BMIをコンソール出力(小数第一位まで表示)
		System.out.println("BMIは" + String.format("%.1f", lateBmi) + "です");
		
		// 変数 ageの値が 25以上の場合は、 trueを出力する
		System.out.println(age >= 25);
		
		// 変数 ageをString型へ変換し、変数 ageStrに代入
		String ageStr = String.valueOf(age);
		
		// 変数 heightをString型へ変換し、変数 heightStrに代入
		String heightStr = String.valueOf(height);
		
		// 変数 weightをString型へ変換し、変数 weightStrに代入
		String weightStr = String.valueOf(weight);
		
		// 変数 ageStrと変数 heightStrと変数 weightStrをつなげて出力
		System.out.println(ageStr +  heightStr + weightStr);
		
		// 変数 ageStrをdouble型へ変換し、変数 ageDbに代入
		double ageDb = Double.parseDouble(ageStr);
		// 変数 heightStrをdouble型へ変換し、変数 heightDbに代入
		double heightDb = Double.parseDouble(heightStr);
		
		// 変数 ageDbをint型へ変換
		int ageInt = (int)ageDb;
		// 変数 ageIntを出力
		System.out.println(ageInt);
		
		// 変数 heightDbをint型へ変換
		int heightInt = (int)heightDb;
		// 変数 heightIntを出力
		System.out.println(heightInt);
		
		// 年齢が25もしくは身長が160以上であればtrueを出力
		System.out.println(ageInt == 25 || heightInt >= 160);
	}
}
