// 実行用クラス

package execution;

// パッケージのインポート
import java.util.Random;
import java.util.Scanner;

import process.Character;

public class Qes1_25 {
	public static void main(String[] args) {
		System.out.print("名前を入力してください：");
		// 入力欄の作成
		Scanner scan = new Scanner(System.in);
		
		// 無限ループを行う
		while(true) {
			String name = scan.nextLine();
			// 入力されていない場合、再入力を促す
			if(name == null || name == "") {
				System.out.print("1文字以上で入力してください：");
			// 入力された文字が10文字より多い場合、再入力を促す
			}else if(name.length() > 10) {
				System.out.print("10文字以内で入力してください：");
			}else{
				// 各ステータスの値をランダムで作成(1-999の範囲)
				Random random = new Random();
				// HP
				int rdmHp = random.nextInt(999) + 1;
				// MP
				int rdmMp = random.nextInt(999) + 1;
				// 攻撃力
				int rdmAt = random.nextInt(999) + 1;
				// 素早さ
				int rdmSp = random.nextInt(999) + 1;
				// 防御力
				int rdmDi = random.nextInt(999) + 1;
				// インスタンスメソッドの呼び出し
				Character character = new Character(name, rdmHp, rdmMp, rdmAt, rdmSp, rdmDi);
				// 出力用メソッドの呼び出し
				character.printData();
				// 無限ループから脱出
				break;
			}
		}
		
	}
}
