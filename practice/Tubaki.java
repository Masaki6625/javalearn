public class Tubaki {
  private String name = "椿";
  private int hp = 100;
  
  public void attack(int damage) {
    System.out.println(this.name + "の攻撃！");
    System.out.println(damage + "のダメージ！");
  }
}