package curriculum_B;

// 問5
/**********************************************************************************									
* [概要] 掛け算表の作成処理
**********************************************************************************/	
public class Qes5 {
	public static void main(String[] args) {
		System.out.println("課題5");
		System.out.println("");
		System.out.println("");
		// かけられる数をループさせる(9まで)
		for(int i = 0; i < 10; i++) {
			// かける数をループ(20まで)させ、結果を表示(数値は3桁で0埋めして表示させる)、最後に改行を入れる
			for(int n =1; n < 21; n++) {
				System.out.printf(String.format("%03d",i) + " * " + String.format("%03d", n) + " _ " + String.format("%03d",(i * n)) + ( n != 20 ? " || " : "\r\n" ));
			}
			// 改行を入れる
			System.out.println();
		}
	}
}
