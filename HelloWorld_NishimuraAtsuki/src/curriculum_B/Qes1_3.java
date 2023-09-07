package curriculum_B;

import java.util.Random;
// java.utilのパッケージ読み込み
import java.util.Scanner;

public class Qes1_3 {
	public static void main(String[] args) {
		


// 問1.2
		/**********************************************************************************									
		* [概要] 入力値取得と入力結果判定処理	
		**********************************************************************************/	
		// ユーザー名の入力結果取得
		Scanner scan = new Scanner(System.in);
		// 入力結果を変数に代入する
		String name = scan.nextLine();
		
		// ユーザー名の文字数が10文字より大きい場合、「名前を10文字以内にしてください」を出力する
		if(name.length() > 10) {
			System.out.println("「名前を10文字以内にしてください」");
		// ユーザー名の文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力する
		}else if(name == "" || name == null){
			System.out.println("「名前を入力してください」");
		// 入力結果が半角英数字ではない場合、「半角英数字のみで名前を入力してください」を出力する
		}else if(!name.matches("^[A-Za-z0-9]+$")) {
			System.out.println("「半角英数字のみで名前を入力してください」");			
		//ユーザー名が正常な値だった場合「ユーザー名「 入力したユーザー名 」を登録しました」と出力する
		}else{
			System.out.println("「ユーザー名" + name + "を登録しました」");
			System.out.println("");
		}
		
// 問3
		/**********************************************************************************	
		* [概要] じゃんけんシステム作成処理	
		**********************************************************************************/
		// 勝利数を算出する
		int winCount = 0;
		// じゃんけんを行った回数を算出する
		int count = 1;
		
		// ユーザーがじゃんけんで勝利するまで繰り返す
		while(winCount < 1){
			Random random = new Random();
			// ユーザーがじゃんけんで出す手を生成する(0 - 2 の乱数)
			int getUser = random.nextInt(3);
			// 相手がじゃんけんで出す手を生成する(0 - 2 の乱数)
			int getCpu = random.nextInt(3);
			
			// ユーザーの手を出力する
			if(getUser == 0) {
				System.out.println("");
				System.out.println(name + "の手は「グー」");
				System.out.println("");
			}else if(getUser == 1) {
				System.out.println("");
				System.out.println(name + "の手は「チョキ」");
				System.out.println("");
			}else if(getUser == 2) {
				System.out.println("");
				System.out.println(name + "の手は「パー」");
				System.out.println("");
			}
			
			// 相手の手を出力する
			if(getCpu == 0) {
				System.out.println("相手の手は「グー」");
			}else if(getCpu == 1) {
				System.out.println("相手の手は「チョキ」");
			}else if(getCpu == 2) {
				System.out.println("相手の手は「パー」");
			}
			
			// じゃんけんで勝利した場合の処理(勝利数に1加算する)
			if((getUser == 0 && getCpu == 1) || (getUser == 1 && getCpu == 2) || (getUser == 2 && getCpu == 0)) {
				System.out.println("");
				System.out.println("やるやん。");
				System.out.println("次は俺にリベンジさせて");
				System.out.println("勝つまでにかかった合計回数は" + count +"回です");
				winCount++;
			// ユーザーが「グー」に負けた場合の処理(じゃんけんの回数に1加算する)
			}else if(getUser == 1 && getCpu == 0) {
				System.out.println("");
				System.out.println("俺の勝ち！");
				System.out.println("負けは次につながるチャンスです！");
				System.out.println("ネバーギブアップ！");
				System.out.println("");
				count++;
			// ユーザーが「チョキ」に負けた場合の処理(じゃんけんの回数に1加算する)
			}else if(getUser == 2 && getCpu == 1) {
				System.out.println("");
				System.out.println("俺の勝ち！");
				System.out.println("たかがじゃんけん、そう思ってないですか？");
				System.out.println("それやったら次も、俺が勝ちますよ");
				System.out.println("");
				count++;
			// ユーザーが「パー」に負けた場合の処理(じゃんけんの回数に1加算する)
			}else if(getUser == 0 && getCpu == 2) {
				System.out.println("");
				System.out.println("俺の勝ち！");
				System.out.println("なんで負けたか、明日まで考えといてください。");
				System.out.println("そしたら何かが見えてくるはずです");
				System.out.println("");
				count++;
			// あいこの場合の処理(じゃんけんの回数に1加算する)
			}else if(getUser == getCpu) {
				System.out.println("");
				System.out.println("DRAW あいこ もう一回しましょう！");
				System.out.println("");
				count++;
			}
		}
		scan.close();
		
	}
}