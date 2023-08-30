package curriculum_A;

public class Qes1_13 {
	public static void main(String[] args) {
		
		// 改行用の変数を作成する
		String br = System.getProperty("line.separator");

// 問1	
		// バイト型を宣言する
		byte number;
		
		// 短整数型を宣言する
		short shortInt;
		
		// 整数型を宣言する
		int integerNum;
		
		// 長整数型を宣言する
		long longInt;
		
		// 単精度浮動小数点型を宣言する
		float floatNum;
		
		// 倍精度浮動小数点型を宣言する
		double doubleNum;
		
		// 文字型を宣言する
		char alphabet;
		
		// 文字列型を宣言する
		String greet;
		
		// ブーリアン型を宣言する
		boolean bool;
		
// 問2
		// バイト型を初期化する
		number = 0;
		
		// 短整数型を初期化する
		shortInt = 0;
		
		// 整数型を初期化する
		integerNum = 0;
		
		// 長整数型を初期化する
		longInt = 0L;
		
		// 単精度浮動小数点型を初期化する
		floatNum = 0.0f;
		
		// 倍精度浮動小数点型を宣言初期化する
		doubleNum = 0.0d;
		
		// 文字型を初期化する
		alphabet = '\u0000';
		
		// 文字列型を初期化する
		greet = null;
		
		// ブーリアン型を初期化する
		 bool = false;
		 
//問3 
		// バイト型に 10を代入する
		number = 10;
		
		// 短整数型に 100を代入する
		shortInt = 100;
		
		// 整数型に 1000を代入する
		integerNum = 1000;
		
		// 長整数型に 10000を代入する
		longInt = 10000L;
		
		// 単精度浮動小数点型に 9.5を代入する
		floatNum = 9.5f;
		
		// 倍精度浮動小数点型に 10.5を代入する
		doubleNum = 10.5d;
		
		// 文字型に 'a'を代入する
		alphabet = 'a';
		
		// 文字列型に "ハロー"を代入する
		greet = "ハロー";
		
		// ブーリアン型に trueを代入する
		bool = true;
		
// 問4
		// 11110 をコンソール出力する
		System.out.println(longInt + integerNum + shortInt + number + br);
		
		// 20 をコンソール出力する
		System.out.println(number * 2 + br);
		
		// "a ハロー true" をコンソール出力する
		System.out.println(alphabet + " " + greet + " " + bool + br);
		
		// 数字の合計を整数型に変換する
		int sum = (int)(number + shortInt + integerNum + longInt + floatNum + doubleNum);
		// 整数型に変換した数字の合計をコンソール出力する
		System.out.println(sum + br);
		
		// バイト型、短整数型、整数型、長整数型を全てかけた値をコンソール出力する
		System.out.println(number * shortInt * integerNum * longInt + br);
		
		// 倍精度浮動小数点型を、短整数型で割った値をコンソール出力する
		System.out.println(doubleNum / shortInt + br);
		
		// バイト型から短整数型を引いた値をコンソール出力する
		System.out.println(number - shortInt + br);
		
// 問5
		// "ハローJAVA43"をコンソール出力する
		int num = 20;
		int num1 = 23;
		System.out.println("ハローJAVA" + (num + num1) + br);
		
// 問6
		// 文字列型の変数を宣言し、山田太郎を代入する
		String name = "山田太郎";
		
		// 整数型の変数を宣言し、18を代入する
		int age = 18;
		
		// 倍精度浮動小数点型の変数を宣言し、170.5を代入する
		double height = 170.5;
		
		// 倍精度浮動小数点型の変数を宣言し、62.2を代入する
		double weight = 62.2;
		
		// 文字列型の変数を宣言し、寿司を代入する
		String food = "寿司";
		
		// 「初めまして○○です」をコンソール出力する
		System.out.println("初めまして" + name + "です" + br);
		
		// 「年齢は○○歳です」をコンソール出力する
		System.out.println("年齢は" + age + "歳です" + br);
		
		// 「身長は○○cmです」をコンソール出力する
		System.out.println("身長は" + height + "cmです" + br);
		
		// 「体重は○○kgです」をコンソール出力する
		System.out.println("体重は" + weight + "kgです" + br);
		
		// 「好きな食べ物は○○です」をコンソール出力する
		System.out.println("好きな食べ物は" + food + "です" + br);
		
// 問7
		// BMI(体重÷身長÷身長×10000）の算出
		double bmi = weight / height / height * longInt;
		// BMIをコンソール出力する(小数第一位まで表示)
		System.out.println("BMIは" + String.format("%.1f", bmi) + "です" + br);
		
// 問8
		// 変数 nameに 鈴木一郎を代入する
		name = "鈴木一郎";
		// 「初めまして鈴木一郎です」をコンソール出力する
		System.out.println("初めまして" + name + "です" + br);
		
		// 変数 ageに 24を代入する
		age = 24;
		//「年齢は24歳です」をコンソール出力する
		System.out.println("年齢は" + age + "歳です" + br);
		
		// 変数 heightに 168.5を代入する
		height = 168.5;
		// 「身長168.5cmです」をコンソール出力する
		System.out.println("身長は" + height + "cmです" + br);
		
		// 変数 weightに 64.2を代入する
		weight = 64.2;
		// 「体重は64.2kgです」をコンソール出力する
		System.out.println("体重は" + weight + "kgです" + br);
		
		// 変数 foodに オムライスを代入する
		food = "オムライス";
		// 「好きな食べ物はオムライスです」をコンソール出力する
		System.out.println("好きな食べ物は" + food + "です" + br);
		
		// BMI(体重÷身長÷身長×10000）の算出
		bmi = weight / height / height * longInt;
		// BMIをコンソール出力する(小数第一位まで表示、文末で改行)
		System.out.printf("BMIは%.1fです%n", bmi);
		
// 問9 
		// 年齢を和算で自己代入する
		age += age;
		// 身長を和算で自己代入する
		height += height;
		// 体重を和算で自己代入する
		weight += weight;
		
		// 「初めまして鈴木一郎です」をコンソール出力する
		System.out.println(br + "初めまして" + name + "です" + br);
		
		// 変数 ageを用いて、年齢の紹介文をコンソール出力する
		System.out.println("年齢は" + age + "歳です" + br);
		
		// 変数 heightを用いて、身長の紹介文をコンソール出力する
		System.out.println("身長は" + height + "cmです" + br);
		
		// 変数 weightを用いて、体重の紹介文をコンソール出力する
		System.out.println("体重は" + weight + "kgです" + br);
		
		// 「好きな食べ物はオムライスです」をコンソール出力する
		System.out.println("好きな食べ物は" + food + "です" + br);
		
		// BMIを自己代入で算出する(問8で算出した値を用いて算出)
		bmi = bmi / 2;
		// BMIをコンソール出力する(小数第一位まで表示、文末で改行)
		System.out.printf("BMIは%.2fです%n", bmi);
		
// 問10
		// 年齢を問8の値に戻す
		age = 24;
		// 年齢が 25歳以上の場合は、 trueを出力する
		System.out.println(br + (age >= 25));
		
// 問11
		// 年齢を文字列型へ変換する
		String ageStr = String.valueOf(age);
		
		// 身長を問8の値に戻す
		height = 168.5;
		// 身長を文字列型へ変換する
		String heightStr = String.valueOf(height);
		
		// 体重を問8の値に戻す
		weight = 64.2;
		// 体重を文字列型へ変換する
		String weightStr = String.valueOf(weight);
		
		// 文字列型に変換した年齢と身長と体重をつなげて出力する
		System.out.println(br + ageStr +  heightStr + weightStr + br);
		
// 問12
		// 文字列型に変換した年齢を整数型へ変換する
		int ageInt = Integer.parseInt(ageStr);
		// 文字列型に変換した身長を倍精度浮動小数点型型へ変換した後、整数型に変換する
		int heightInt = (int)Double.parseDouble(heightStr);
		
		// 整数型に変換した年齢を出力する
		System.out.println(ageInt + br);
		
		// 整数型に変換した身長を出力
		System.out.println(heightInt + br);
		
// 問13
		// 年齢が25もしくは身長が160以上であればtrueを出力する
		System.out.println(ageInt == 25 || heightInt >= 160);
	}
}
