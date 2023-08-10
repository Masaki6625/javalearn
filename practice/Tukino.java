public class Tukino {
  String name = "月乃";
  int hp;
  private int mp = 10;

  public void magic() {
    if (mp >= 1) {
      System.out.println(this.name + "の攻撃！");
      this.mp -= 3;
      System.out.println(this.name + "はマジックを使って500のダメージを与えた！");
    } else {
      System.out.println("mpが足りず攻撃できない！");
    }
  }
  
  public static void main(String[] args) {
    Tukino t = new Tukino();
    t.magic();
  }
}