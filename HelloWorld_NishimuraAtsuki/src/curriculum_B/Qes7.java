package curriculum_B;

import java.util.Scanner;

public class Qes7 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in) ;
		
		// 生徒の人数の入力結果を取得する
		System.out.print("生徒の人数を入力してください（2以上）: " );
		int student = scanner.nextInt();
		
		/**********************************************************************************									
		* [概要] 生徒ごとに各科目の点数入力欄の作成処理
		**********************************************************************************/	
		
		// 教科名を配列に格納する
		String[] subjects = {"英語", "数学", "理科", "社会"};
		
		// 生徒ごとの成績を2次元配列に格納する
		int[][] score = new int[student][subjects.length];
		
		// 生徒の人数が2人以上の場合のみ作動する
		if(student >= 2) {
			// 生徒数分繰り返し処理
			for(int i = 0; i < score.length; i++) {
				// 教科数分繰り返し処理
				for(int j = 0; j < subjects.length; j++) {
					System.out.println(i + 1 + "人目の『" + subjects[j] + "』の点数を入力してください : ");
					// 点数の入力結果を取得する
					score[i][j] = scanner.nextInt();
				}
				System.out.println();
			}
			
			System.out.println();
			
			/**********************************************************************************									
			* [概要] 生徒ごとの平均点の算出処理
			**********************************************************************************/	
			
			
			int j = 1;
			for(int [] a : score) {
				// 合計点を表す変数を用意する
				int sum = 0;
				for(int n : a) {
					// 合計点に各教科の点数を加算する
					sum += n;
				}
				// 平均点の算出する
				double average = sum / a.length;
				System.out.println(j + "人目の平均点は" + average + "点です");
				
				// 次の生徒へ
				j++;
			}
			
			System.out.println();
			System.out.println();
			
			/**********************************************************************************									
			* [概要] 教科ごとの平均点の算出処理
			**********************************************************************************/	
			
			// 配列内の教科を表す変数を用意する
			int b = 0;
			// 教科名をひとつずつ取り出す
			for(String f: subjects) {
				// 合計点を表す変数を用意する
				double sumSub = 0.0;
				// 人数分繰り返し処理を行う
				for(int k = 0; k < score.length; k++) {
					// 教科ごとの合計点を算出する
					sumSub += score[k][b];
				}
				// 算出した合計点を用いて、平均点を算出する
				double subAvg = sumSub / score.length;
				
				// 小数第2位まで表示
				System.out.printf(f + "の平均点は%.2f点です%n", subAvg);
				
				// 合計点を初期化
				sumSub = 0.0;
				// 次の教科へ
				b++;
			}
		}
		scanner.close();
	}
}
