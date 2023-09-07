package curriculum_B;

// 問4
/**********************************************************************************									
* [概要] 九九の作成処理
**********************************************************************************/	
public class Qes4 {
	public static void main(String[] args) {
		System.out.println("課題4");
		System.out.println("");
		System.out.println();
		// かけられる数をループさせる(9まで)
		for(int n = 1; n < 10; n++) {
			// かける数をループ(9まで)させ、結果を表示(数値は2桁で0埋めして表示させる)、最後に改行を入れる
			for(int i = 1; i < 10; i++) {
				System.out.printf(String.format("%02d",n) + " * " + String.format("%02d", i) + " = " + String.format("%02d",(n * i)) + ( i != 9 ? " || " : "\r\n" ));
			}
			// 改行を入れる
			System.out.println();
		}
			
	}
}