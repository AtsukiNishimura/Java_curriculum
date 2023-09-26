package execution;

import java.util.Scanner;

import process.Animals;

public class Qes1_27 {
	public static void main(String[] args) {
		// 入力欄の作成
		System.out.println("コンソールに文字を入力してください");
		Scanner scn = new Scanner(System.in);
		
		// 無限ループを行う
		while(true) {
			String animalFamily = scn.nextLine();
			// nullチェック
			if(animalFamily == null || animalFamily == "") {
				System.out.println("文字を入力してください");
			}else if(!(animalFamily.contains(":"))){
				// エラーメッセージの表示
				System.out.println("「:」を用いて情報を区切って入力してください");
			}else {
				
				// 入力結果を動物ごとに「,」で区切る
				String[] animalList = animalFamily.split(",",0);
				
				// インスタンス化
				Animals animal = new Animals();
				
				// 入力された動物の数だけ繰り返し処理を行う
				for(int i = 0; i < animalList.length; i++) {
					// 入力結果を情報ごとに「:」で区切る
					String[]  animalInfo = animalList[i].split(":");
					System.out.println();
					// 入力された各動物の情報が3個以外の場合
					if(animalInfo.length != 3) {
						System.out.println("指定の形式で入力してください");
					
					// 動物名が「ライオン」の場合
					}else if(animalInfo[0].equals("ライオン")) {
						// セッターメソッドに値を渡す
						animal.setAnimals(animalInfo[0], animalInfo[1], animalInfo[2], "パンテラ レオ");
						// 出力用メソッドの呼び出し
						animal.printData();
					
					// 動物名が「ゾウ」の場合
					}else if(animalInfo[0].equals("ゾウ")) {
						// セッターメソッドに値を渡す
						animal.setAnimals(animalInfo[0], animalInfo[1], animalInfo[2], "ロキソドンタ・サイクロティス");
						// 出力用メソッドの呼び出し
						animal.printData();
					
					// 動物名が「パンダ」の場合
					}else if(animalInfo[0].equals("パンダ")) {
						// セッターメソッドに値を渡す
						animal.setAnimals(animalInfo[0], animalInfo[1], animalInfo[2], "アイルロポダ・メラノレウカ");
						// 出力用メソッドの呼び出し
						animal.printData();
					
					// 動物名が「チンパンジー」の場合
					}else if(animalInfo[0].equals("チンパンジー")) {
						// セッターメソッドに値を渡す
						animal.setAnimals(animalInfo[0], animalInfo[1], animalInfo[2], "パン・トゥログロディテス");
						// 出力用メソッドの呼び出し
						animal.printData();
					
					// 動物名が「シマウマ」の場合
					}else if(animalInfo[0].equals("シマウマ")) {
						// セッターメソッドに値を渡す
						animal.setAnimals(animalInfo[0], animalInfo[1], animalInfo[2], "チャップマンシマウマ");
						// 出力用メソッドの呼び出し
						animal.printData();
					
					// 動物名が上記以外の場合
					}else{
						// セッターメソッドに値を渡す
						animal.setAnimals(animalInfo[0], animalInfo[1], animalInfo[2], "不明");
						// 出力用メソッドの呼び出し
						animal.printData();
					}
				}
				// 無限ループから脱出
				break;
			}
		}
		scn.close();
	}
}
