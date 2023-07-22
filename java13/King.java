public class King {
  public void talk(Hero h) {
    //勇者で設定したメソッドを呼び出すことでprivateの名前を取ってこれる
    System.out.println("王様：ようこそ我が国へ、勇者" + h.getName() + "よ。");
    System.out.println("王様：長旅疲れたであろう。");
    System.out.println("王様；まずは城下町を見てくると良い。ではまた会おう。");
    h.die();
  }
}