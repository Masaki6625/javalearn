public class Wizard extends Character {
  int mp;
  public void attack(Matango m) {
    System.out.println(this.name + "の、攻撃！");
    System.out.println("敵に１０１ポイントのダメージ！");
    m.hp -= 101;
  }

  public void fireball(Monster m) {
    System.out.println(this.name + "は火の玉を放った！");
    System.out.println("敵に２０ポイントのダメージ！");
    m.hp -= 20;
    this.mp -= 5;
    System.out.println(this.name + "は、MPを５ポイントを消費しました。");
  }
}