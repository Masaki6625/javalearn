public class Hero {
  //フィールドはオーバーライドしてはいけない。親クラスと子クラスで同名のフィールドがあると誤った動作をする可能性があるため。
  String name = "ミナト";
  int hp = 100;
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
}