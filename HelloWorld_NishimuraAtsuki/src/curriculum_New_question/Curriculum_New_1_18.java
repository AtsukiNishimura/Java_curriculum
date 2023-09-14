package curriculum_New_question;

import java.util.Arrays;
import java.util.Random;

public class Curriculum_New_1_18 {
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	public static void greet(String hello, int num) {
		// 結果の出力
		System.out.println(hello + " " + num);
	}
	
	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	public static void multi(int num1, int num2) {
		// 乗算処理
		int answer = num1 * num2;
		// 結果の出力
		System.out.println("乗算結果:" + answer);
	}
		
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	public static void num(int [] number) {
		for(int i: number) {
			System.out.println(i);
		}
	}
			
	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	public static void multi(double num1, double num2) {
		// 和算処理
		double answer = num1 + num2;
		// 結果の出力
		System.out.println("和算結果:" + answer);
	}
		
	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	
	// 戻り値の型に配列を指定
	public static int[] intNum(int rdmNum) {
		// ランダムな数字を生成する
		Random rdm = new Random();
		// 配列を宣言する
		int [] arr;
		// 配列の要素数を、引数として受け取った要素数に設定する
		arr = new int[rdmNum];
		// 配列の要素数分処理を繰り返す
		for(int f = 0; f < rdmNum; f++) {
			// ランダムな数字(1 - 100)を配列に格納する
			arr[f] = rdm.nextInt(101) + 1;
			// 格納した値を出力する
			System.out.println(arr[f]);
		}
		return arr;
	}
	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	
	// Q5で作成したメソッドの返り値を、呼び出し時に引数として渡す
	public static double aveNum(int[] newArr) {
		
		// 受け取った配列の要素の平均値を算出
		double average = Arrays.stream(newArr).average().getAsDouble();
		System.out.println("平均値:" + average);
		// 平均値を返す
		return average;
	}
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	
	// Q6で作成したメソッドの返り値を、呼び出し時に引数として渡す
	public static boolean boo(double ave) {
		// 受け取った値が50以上の場合の処理
		if(ave >= 50) {
			System.out.println("true");
			// 真偽値を返す
			return true;
		// 受け取った値が49以下の場合の処理
		}else {
			System.out.println("false");
			// 真偽値を返す
			return false;
		}
	}

	public static void main(String[] args) {
    // 作成したメソッドをここで呼び出してください
		// Q1 呼び出し
		System.out.println("Q1----------------------------------------------------------------------\r\n");
		greet("Hello JavaSE", 11);
		
		// Q2 呼び出し
		System.out.println("\r\nQ2----------------------------------------------------------------------\r\n");
		multi(2,43);
		
		// Q3 呼び出し
		System.out.println("\r\nQ3----------------------------------------------------------------------\r\n");
		int [] number = {1,2,5};
		num(number);
		
		// Q4 呼び出し
		System.out.println("\r\nQ4----------------------------------------------------------------------\r\n");
		multi(2.14, 43.55);
		
		// Q5 呼び出し、戻り値を変数に代入(変数は Q6呼び出し時に使用する)
		System.out.println("\r\nQ5----------------------------------------------------------------------\r\n");
		int[] newArray = intNum(5);
		
		// Q6 呼び出し、戻り値を変数に代入(変数は Q7呼び出し時に使用する)
		System.out.println("\r\nQ6----------------------------------------------------------------------\r\n");
		double average = aveNum(newArray);
		
		// Q7 呼び出し
		System.out.println("\r\nQ7----------------------------------------------------------------------\r\n");
		boo(average);
	}
}
