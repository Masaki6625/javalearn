//自分で初めに書いたコード。
public class PoisonMatango extends Matango {
  int poison = 5;
  
  //コンストラクタを記述できていない。これではPoisonMatangoを正しく初期化して使うことができない。詳しくはjava勉強用メモを参照。
  
  public void attack(Hero h) {
    super.attack(h);
    //poison > 0 「ポイズンがゼロより大きかったら」が表現するべきこと。
    if (poison >= 1 ) {
      System.out.println("さらに毒の胞子をばら撒いた！");
      //ここは h.hp / 5　と書くことで勇者のhpの1/5と表現することができる。
      int poisonDamage = h.hp /= 
      System.out.println(poisonDamage + "ポイントのダメージ！");
      //数を減らしたいときは変数に--をつける。もしイメージしずらかったらfor条件式の最後の部分（i++）の逆をすればいいとイメージする。
      poison -= 1
    }
  } 
}

//正解のコード
public class PoisonMatango extends Matango {
  int poisonCount = 5;
  
  public poisonMatango(char suffix) {
    super(suffix);
  }
  
  public void attack(Hero h) {
    super.attack(h);
    if (this.poisonCount > 0) {
      System.out.println("さらに毒の胞子をばら撒いた！");
      int dmg = h.hp / 5;
      h.hp -= dmg;
      System.out.println(dmg + "ポイントのダメージ！");
      this.poisonCount--;
    }
  }
} 