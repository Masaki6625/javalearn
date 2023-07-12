public class Main {
  public static void main(String[] args) {
    //ここでクラス型でインスタンス（勇者）を作成。
    Hero h = new Hero();
    //フィールドに初期値を代入する。
    h.name = "ミナト";
    h.hp = 100;
    
    Matango m1 = new Matango();
    m1.hp = 50;
    m1.suffix = 'A';
    
    Matango m2 = new Matango();
    m2.hp = 48;
    m2.suffix = 'B';
    //勇者で定義したメソッドを呼び出してみる
    h.sit(5);
    m1.run();
    m2.run();
    h.run();
  }
}