//練習問題12-3
public class Practice {
  public static void main(String[] args) {
    // JavaにおいてY[]型は、Y型の要素を持つ配列を表します。Yは任意のデータ型やクラス名に置き換えることができます。
    Y[] array = new Y[2];
    array[0] = new A();
    array[1] = new B();
    for (Y y : array) {
      y.b();
    }
  }
}