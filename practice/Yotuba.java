public class Yotuba {
  private String name = "四葉";
  private int hp;

  public void attack(int damage) {
    System.out.println(this.name + "は激怒して攻撃した！");
    System.out.println("敵に" + damage + "のダメージ");
  }

  public void run() {
    System.out.println(this.name + "は焦った顔をした");
    System.out.println(this.name + "は急いで逃げ出した！");
  }
}