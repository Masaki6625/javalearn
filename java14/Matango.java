public class Matango {
  int hp;
  final int LEVEL = 10; //頭にfinalをつけると変更できない定数フィールドになる。わかりやすいように変数は大文字でかく。
  char suffix;
  public void run() {
    System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！");
  }
}