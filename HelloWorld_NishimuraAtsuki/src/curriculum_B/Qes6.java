package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {
	public static void main(String[] args) {
		// 入力結果の取得
		Scanner scn = new Scanner(System.in);
		String product = scn.next();
		// 入力結果は「、」で区切る
		String[] pdList = product.split("、",0);
		
		for(String i:pdList) {
			// 残り台数は0〜11までのランダムな値が出力されるように設定
			Random rdm = new Random();
			int amount = rdm.nextInt(11) + 1;
			switch(i) {
			// 入力結果が「パソコン」の場合の残り台数表示
			case "パソコン":
				System.out.println("パソコンの残り台数は" + amount + "台です");
				break;
			// 入力結果が「冷蔵庫」の場合の残り台数表示
			case "冷蔵庫":
				System.out.println("冷蔵庫の残り台数は" + amount + "台です");
				break;
			// 入力結果が「扇風機」の場合の残り台数表示
			case "扇風機":
				System.out.println("扇風機の残り台数は" + amount + "台です");
				break;
			// 入力結果が「洗濯機」の場合の残り台数表示
			case "洗濯機":
				System.out.println("洗濯機の残り台数は" + amount + "台です");
				break;
			// 入力結果が「加湿器」の場合の残り台数表示
			case "加湿器":
				System.out.println("加湿器の残り台数は" + amount + "台です");
				break;
			// 入力結果が「テレビ」または「ディスプレイ」場合の処理
			case "テレビ":
			case "ディスプレイ":
				// テレビとディスプレイは同じ商品扱いとし、ディスプレイが出た場合は最大個数の11個からランダムで出た数字を引いて出力する
				System.out.println(
					(i.equals("テレビ"))   ? "テレビの残り台数は" + amount + "台です":"ディスプレイの残り台数は" + (11 - amount) + "台です"
				);
				break;
			// 指定の文字以外が入力された場合の表示
			default:
				System.out.println("『 " + i + " 』は指定の商品ではありません");
				break;
			}
		}
		scn.close();
	}	
}
