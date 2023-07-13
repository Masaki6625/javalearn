public class Main {
  public static void main(String[] args) {
    Hero h1 = new Hero("ミナト"); //コンストラクタに引数として文字列ミナトを渡して実行している。
    System.out.println(h1.name + "のHPは" + h1.hp + "です！");
    Hero h2 = new Hero("アサカ");
    System.out.println(h2.hp);
    Hero h3 = new Hero();
    System.out.println("この勇者の名前は、" + h3.name + "です！"); //２つ目に定義したコンストラクタが実行されてる。
    Wizard w = new Wizard();
    w.name = "スガワラ";
    w.hp = 50;
    w.heal(h1);
    w.heal(h2);
    w.heal(h2);
  }
}