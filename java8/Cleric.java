import java.util.*; //お手本に書いてあった

public class Cleric {
  String name;
  int hp = 50;
  final int MAXHP = 50; //お手本ではMAX_HPのみたいにスネークになってた
  int mp = 50;
  final int MAXMP = 50; //HPと同様MAX_MP

  public void selfAid() {
    System.out.println(this.name + "は、セルフエイドを唱えた！");
    this.hp = this.MAXHP;
    this.mp -= 5;
    System.out.println("HPが最大に回復した！");
  }
  //答えを見て修正した
  public int pray(int sec) {
    System.out.println(this.name + "は、" + sec + "秒間天に祈った！");

    //論理上の回復量を乱数を用いて決定する
    int recover = new Random().nextInt(3) + sec;

    //実際の回復量を計算する
    int recoverActual = Math.min(this.MAXMP - this.mp, recover);

    this.mp += recoverActual;
    System.out.println("MPが" + recoverActual + "回復した！");
    return recoverActual;
  }
}