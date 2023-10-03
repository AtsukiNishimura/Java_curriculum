package execution;

// パッケージのインポート
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

import process.Prefectures;

public class Qes1_29 {
	public static void main(String[] args) {
		
		// 都道府県の情報を格納するに次元配列の作成
		String preInfo[][];
		
		preInfo = new String[11][];
		for(int i = 0; i < 11; i++) {
			preInfo[i] = new String[3];
		}

		preInfo[0][0] = "北海道";
		preInfo[0][1] = "札幌市";
		preInfo[0][2] = "83424";

		preInfo[1][0] = "青森県";
		preInfo[1][1] = "青森市";
		preInfo[1][2] = "9646";

		preInfo[2][0] = "岩手県";
		preInfo[2][1] = "盛岡市";
		preInfo[2][2] = "15275";

		preInfo[3][0] = "宮城県";
		preInfo[3][1] = "仙台市";
		preInfo[3][2] = "7282";

		preInfo[4][0] = "秋田県";
		preInfo[4][1] = "秋田市";
		preInfo[4][2] = "11638";

		preInfo[5][0] = "山形県";
		preInfo[5][1] = "山形市";
		preInfo[5][2] = "9323";

		preInfo[6][0] = "福島県";
		preInfo[6][1] = "福島市";
		preInfo[6][2] = "13784";

		preInfo[7][0] = "茨城県";
		preInfo[7][1] = "水戸市";
		preInfo[7][2] = "6097";

		preInfo[8][0] = "栃木県";
		preInfo[8][1] = "宇都宮市";
		preInfo[8][2] = "6408";

		preInfo[9][0] = "群馬県";
		preInfo[9][1] = "前橋市";
		preInfo[9][2] = "6362";

		preInfo[10][0] = "埼玉県";
		preInfo[10][1] = "さいたま市";
		preInfo[10][2] = "3798";
		
		Scanner scnNum = new Scanner(System.in);
		Scanner scnSort = new Scanner(System.in);
		
		// 番号の入力結果を格納する変数の作成
		String orderNum = "";
		// 表示方法の入力結果を格納する変数の作成
		String orderSort = "";
		
		// インスタンス化
		Prefectures pre = new Prefectures();

		// コンソールに入力を要求
		System.out.print("番号を入力してください(例 8,5,9,.....)：");
		
		while(true) {
			// コンソールの入力結果を変数に格納
			orderNum = scnNum.nextLine();
			
			// 受け取った変数を","で区切って配列に格納
			String arrNum[] = orderNum.split(",");
			
			// 文字列が数字かどうかを判断するための変数を作成
			Pattern pattern = Pattern.compile("^[0-9]+$");
			
			// 入力結果が空欄の場合のエラー文表示
			if(orderNum.equals(null) || orderNum.equals("")) {
				System.out.print("1文字以上入力してください：");
			// 入力結果が空欄でない場合の処理
			}else {
				System.out.print("表示方法を入力してください（【昇順】or【降順】）：");
				// コンソールの入力結果を変数に格納
				orderSort = scnSort.nextLine();
				// 配列の要素数分繰り返し処理を行う
				for(int y = 0; y < arrNum.length; y++) {
					
					// 入力結果が半角数字かどうかを判定する
					Matcher matcher = pattern.matcher(arrNum[y]);
					// 入力された文字列が半角数字の場合の処理
					if(matcher.find()) {
						
						// 配列を整数型に変換
						int[] intArrNum = Stream.of(arrNum).mapToInt(Integer::parseInt).toArray();
						
						// 入力された数字が11以上の場合のエラー文表示
						if(intArrNum[y] > preInfo.length) {
							System.out.println("10以下の数字を入力してください");
							
						// 表示方法の入力結果に昇順と降順の両方が含まれる場合のエラー文表示
						}else if(orderSort.contains("昇順") && orderSort.contains("降順")){
							System.out.println("表示方法はどちらか1つだけ指定してください");
							System.out.print("\r\n番号を入力してください(例 8,5,9,.....)：");
						
						// 表示方法の入力結果に昇順と降順のどちらも含まれない場合のエラー文表示
						}else if(!(orderSort.contains("昇順")) && !(orderSort.contains("降順"))) {
							System.out.println("昇順 もしくは 降順 と入力してください\r\n");
							System.out.print("\r\n番号を入力してください(例 8,5,9,.....)：");
							
						// 表示方法の入力結果が昇順の場合の処理
						}else if (orderSort.contains("昇順")) {
							// 昇順に並び替え
							Arrays.sort(intArrNum);
							// 入力された都道府県番号の分繰り返し処理を行う
							for(int k : intArrNum) {
								pre.setPrefectures(preInfo[k][0], preInfo[k][1], preInfo[k][2]);
								// 出力用メソッドの呼び出し
								pre.printData();
							}
							// スキャナを閉じる
							scnNum.close();
							scnSort.close();
							
						}else if(orderSort.contains("降順")) {
							Integer[]integerNum = new Integer[intArrNum.length];
							for(int f = 0; f < intArrNum.length; f++) {
								integerNum[f] = intArrNum[f];
							}
							// 降順に並び替え
							Arrays.sort(integerNum,Collections.reverseOrder());
							// Integer型に変更する
							for(int k = 0; k < intArrNum.length; k++) {
								intArrNum[k] = integerNum[k];
							}
							// 入力された都道府県番号の分繰り返し処理を行う
							for(int n : intArrNum) {
								pre.setPrefectures(preInfo[n][0], preInfo[n][1], preInfo[n][2]);
								// 出力用メソッドの呼び出し
								pre.printData();
							}
							// スキャナを閉じる
							scnNum.close();
							scnSort.close();
						}
						// 無限ループから脱出
						break;
						
					}else {
						// 入力された文字列が半角数字以外の場合のエラー文表示
						System.out.println("半角数字を入力してください");
					}
				}
			}
			
		}
	}
}