public class Matango {
  int hp;
  final int LEVEL = 10; //頭にfinalをつけると変更できない定数フィールドになる。わかりやすいように変数は大文字でかく。
  char suffix;

  public Matango(int hp) {
   this.hp = hp;
  }

  public void run() {
    System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！");
  }

//ここは実験
  // public void dead(int hp) {
  //   if (this.hp < 0) {
  //     System.out.println("モンスターは力尽きた");
  //   }
  // }
}