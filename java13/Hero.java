public class Main {
  //int hp;  これでは誰かが値を変更できてしまうなので
  private int hp;  //とすると変更できなくなる
  private String name;
  Sword sword;
  
  //キングから勇者の名前にアクセスできるようになる。
  //getがついているためgetter(ゲッター)メソッド
  public String getName() {
    return this.name;
  }
  
  //setを使っているのでsetter(セッター)メソッド
  public  void setName(String name) {
    if (name == null) {
      throw new IllegalArgumentException
        ("名前がnullである。処理を中断");
    }
    if (name.length() <= 1) {
      throw new IllegalArgumentException
        ("名前が短すぎる。処理を中断");
    }
    if (name.length() >= 8) {
      throw new IllegalArgumentException
        ("名前が長すぎる。処理を中断");
    }
    this.name = name;
  }
  
  public void bye() {
    System.out.println("勇者は別れを告げた");
  }
  
  //ここもフィールドと同じ理由
  private void die() {
    System.out.println(this.name + "は死んでしまった!");
    System.out.println("GAME OVERです。");
  }
  
  public void sleep() {
    this.hp = 100;
    System.out.println(this.name + "は眠って回復した！");
  }
  
  public void attack(Matango m) {
    System.out.println(this.name + "の攻撃！");
    System.out.println("お化けきのこ" + m.suffix + "から２ポイントの反撃を受けた！");
    this.hp -= 2;
    if (this.hp <= 0){
     this.die();
    }
  }
}