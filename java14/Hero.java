public class Hero {
  //フィールドはオーバーライドしてはいけない。親クラスと子クラスで同名のフィールドがあると誤った動作をする可能性があるため。
  String name = "ミナト";
  int hp = 100;
  static int money;  //staticをつけることで「すべての勇者で１つ」と設定することができる
  public Hero() {
    System.out.println("Heroのコンストラクタが動作");
  }
  //戦う
  //public final voidとすることでこのメソッドは継承できないように設定することができる。
  public void attack(Matango m) {
    System.out.println(this.name + "の攻撃！");
    m.hp -= 5;
    System.out.println("5ポイントのダメージを与えた");
  }
  //逃げる
  public void run() {
    System.out.println(this.name + "は逃げ出した！");
  }
  //toStringを意図した動作にさたい場合はクラスで指示する
  public String toString() {
    return "名前" + this.name + "/hp:" + this.hp;
  }
  
  //equalsを使って比較を行うときはクラスに指示をする
  public boolean equals(Object o) {
    if (this == o) {return true;}
    if (o instanceof Hero) {
      Hero h = (Hero)o;
      if (this.name.equals(h.name)) {
        return true;
      }
    }
    return false;
  }
  
  //勇者の所持金をランダムに設定する
  public static void setRandomMoney() {
    Hero.money = (int)(Math.random() * 1000);
  }
}