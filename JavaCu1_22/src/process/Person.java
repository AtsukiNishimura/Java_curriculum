package process;

public class Person {
	// メンバ変数の作成
	// 名前
	private String name;
	// HP
	private int hp;
	// MP
	private int mp;
	// 攻撃力
	private int attack;
	// 素早さ
	private int speed;
	// 防御力
	private int difence;
	
	// コンストラクタの作成
		Person(String name, int hp, int mp, int attack, int speed, int difence) {
			// メンバ変数に値をセットする
			this.name = name;
			this.hp = hp;
			this.mp = mp;
			this.attack = attack;
			this.speed = speed;
			this.difence = difence;
		}
		
	
	// ゲッターメソッドの作成
	public String getName() {
		return this.name;
	}
	public int getHp() {
		return this.hp;
	}
	public int getMp() {
		return this.mp;
	}
	public int getAttack() {
		return this.attack;
	}
	public int getSpeed() {
		return this.speed;
	}
	public int getDifence() {
		return this.difence;
	}
	
	// セッターメソッドの作成
	public void setName(String name) {
		this.name = name;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public void setSpeed(int speed) {
		this.speed =speed;
	}
	public void setDifence(int difence) {
		this.difence = difence;
	}
	
	// 出力用メソッドの作成
	public void printData() {
		System.out.println("\r\nこんにちは 「"  + this.name +" 」 さん");
		System.out.println("ステータス");
		System.out.println("HP：" + this.hp);
		System.out.println("MP：" + this.mp);
		System.out.println("攻撃力：" + this.attack);
		System.out.println("素早さ：" + this.speed);
		System.out.println("防御力：" + this.difence);
		System.out.println("\r\nさあ冒険に出かけよう！");
	}
}
