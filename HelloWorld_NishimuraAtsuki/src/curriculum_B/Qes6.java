package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {
	public static void main(String[] args) {
		// 入力結果の取得
		Scanner scn = new Scanner(System.in);
		String product = scn.nextLine();
		// 入力結果は「、」で区切る
		String[] pdList = product.split("、",0);
		
		// テレビ、ディスプレイの一回目の出力結果を格納する変数を定義し、初期化する
		// 初期値については、ランダムで出力される値(0 - 11)以外の値で設定する
		int tv = -1;
		
		// 無限ループを行う
		while(true) {
			// 文字が入力されなかった場合、エラー文を表示
			if(product == "" || product == null) {
				System.out.println("値を入力してください");
				product = scn.nextLine();
				pdList = product.split("、",0);
			}else {
				for(String i:pdList) {
					// 残り台数は0〜11までのランダムな値が出力されるように設定
					Random rdm = new Random();
					int amount = rdm.nextInt(11) + 1;
					switch(i) {
					// 入力結果がテレビ、ディスプレイ以外の指定の商品の場合の残り台数表示
					case "パソコン","冷蔵庫","扇風機","洗濯機","加湿器":
						System.out.println(i + "の残り台数は" + amount + "台です");
						break;
					
					// 入力結果が「テレビ」または「ディスプレイ」場合の処理
					// テレビとディスプレイは同じ商品扱いとし、  ディスプレイが出た場合は最大個数の11個からランダムで出た数字を引いて出力する
					case "テレビ":
					case "ディスプレイ":
						// テレビもしくはディスプレイが一度入力されていた(変数の値が更新された)場合の処理と初めて入力される場合の処理で分岐させる
						System.out.println(
						tv != -1 ? i + "の残り台数は" + (11 - tv) + "です" : i + "の残り台数は" + amount + "です"
						);
						// テレビもしくはディスプレイの一回目の出力結果を変数に代入する
						tv = amount;
						break;
						
					// 指定の文字以外が入力された場合の表示
					default:
						System.out.println("『 " + i + " 』は指定の商品ではありません");
						break;
					}
				// 無限ループから脱出
				}break;
			}
		}
	}	
}