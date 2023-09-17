package execution;

// パッケージのインポート
import process.Animal;

public class Qes1_23 {
	public static void main(String[] args) {
		// クラスをインスタンス化
		Animal rion = new Animal();
		
		// セッターメソッドに値を渡す
		rion.setAnimal("ライオン", 2.1, 80);
		// 出力用メソッドの呼び出し
		rion.info();
	}

}