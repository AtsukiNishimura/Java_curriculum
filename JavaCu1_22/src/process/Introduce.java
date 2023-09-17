package process;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Introduce {
	public String place;
	public String food;
	public String kind;
	
	public Introduce(String place, String food, String kind) {
		this.place = place;
		this.food = food;
		this.kind = kind;
	}
	
	public void hello() {
		System.out.println("こんにちは!ここは" + this.place + "です!");
		System.out.println("ここの" + this.food + "はうまい");
		System.out.println(this.food + "は" + this.kind + "です");
	}
	
	public void date() {
		// オブジェクトを生成する
		Calendar cl = Calendar.getInstance();
				
		//フォーマットを変更する
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd H:m:s");
		System.out.println(sdf.format(cl.getTime()) + "です");
	}
}
