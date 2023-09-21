package process;

// スーパークラスの継承
public class Character extends Person{
	// サブクラスのコンストラクタの作成
	public Character(String getName, int getHp, int getMp, int getAttack, int getSpeed, int getDifence){
		// スーパークラスのコンストラクタの呼び出し
		super(getName, getHp, getMp, getAttack, getSpeed, getDifence);
	}
}
