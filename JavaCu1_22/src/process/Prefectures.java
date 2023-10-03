package process;

public class Prefectures {
	// メンバ変数の作成
	private String name;
	private String capital;
	private String area;
	
	// ゲッターメソッドの作成
	public String getName() {
		return this.name;
	}
	public String getCapital() {
		return this.capital;
	}
	public String getArea() {
		return this.area;
	}
	
	// セッターメソッドの作成
	public void setPrefectures(String name, String capital, String area) {
		this.name = name;
		this.capital = capital;
		this.area = area;
	}
	
	// 出力用メソッドの作成
	public void printData() {
		System.out.println("\r\n都道府県名：" + getName());
		System.out.println("県庁所在地：" + getCapital());
		System.out.println("面積：" + getArea() + ".0km2\r\n");
	}
}
