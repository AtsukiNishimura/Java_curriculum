package process;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Introduce {
	
	// メンバ変数の作成
	public String place;
	public String food;
	public String kind;
	
	// コンストラクタの作成
	public Introduce(String place, String food, String kind) {
		this.place = place;
		this.food = food;
		this.kind = kind;
	}
	
	// 文字列を表示するメソッドの作成
	public void hello() {
		System.out.println("こんにちは!ここは" + this.place + "です!");
		System.out.println("ここの" + this.food + "はうまい");
		System.out.println(this.food + "は" + this.kind + "です");
	}
	
	// 日付と時刻を出力するメソッドの作成
	public void date() {
		// オブジェクトを生成する
		Calendar cl = Calendar.getInstance();
				
		//フォーマットを変更する
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd H:m:s");
		System.out.println(sdf.format(cl.getTime()) + "です");
	}
}