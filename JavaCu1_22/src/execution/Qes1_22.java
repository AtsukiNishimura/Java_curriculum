package execution;

// パッケージのインポート
import process.Introduce;

public class Qes1_22 {
	public static void main(String[] args) {
		// インスタンスの生成(引数として指定の値を渡す)
		Introduce sushi = new Introduce("日本", "寿司", "和食");
		
		// メソッドの呼び出し
		sushi.hello();
		sushi.date();
	}
}
