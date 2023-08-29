package curriculum_B;

// java.utilのパッケージ読み込み
import java.util.Scanner;

public class Qes1_3 {
	public static void main(String[] args) {
		
		// Scanner クラスのインスタンスを作成
		Scanner scan = new Scanner(System.in);
		// 入力結果を変数nameに代入
		String name = scan.next();	

		// 文字列が半角英数字のみの変数 alphaNumを用意
		String alphaNum = "^[A-Za-z0-9]+$" ;
		
		// 入力結果が半角英数字ではない場合、「半角英数字のみで名前を入力してください」を出力
		if(name != alphaNum) {
			System.out.println("「半角英数字のみで名前を入力してください」");
		}
	}
}
