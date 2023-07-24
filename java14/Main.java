public class Main {
  public static void main(String[] args) {
    Hero h1 = new Hero();
    h1.name = "ミナト";
    h1.hp = 100;
    Hero h2 = new Hero();
    h2.name = "ミナト";
    h2.hp = 100;
    if (h1.equals(h2) == true) {
      System.out.println("同じ内容です");
    } else {
      System.out.println("違う内容です");
    }
    //静的フィールドへのアクセス方法
    System.out.println(h1.hp);
    System.out.println(Hero.money);
    h1.money = 300;
    System.out.println(h2.money);
    
    //ランダムにマネーを生成
    Hero.setRandomMoney();
    System.out.println(Hero.money);
    System.out.println(h1.money);
    
  }
}