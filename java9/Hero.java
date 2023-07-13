public class Hero {
  String name;
  int hp;
  Sword sword;

  //このクラスがnewされた直後の初期値をあらかじめ設定しておくことができる。
  //このような処理のことをコンストラクタという。
  public Hero(String name) { //コンストラクタ１
    this.hp = 100; 
    this.name = name; //引数の値でnameフィールドを初期化
  }
  
  //同じメソッドでも引数が違うと使用できる（オーバーロード）をコンストラクタでも使うことができる。
  //すなわちJVMが引数に応じて適切なものを選び実行してくれる。
  // public Hero() { コンストラクタ２
  //   this.hp = 100;
  //コンストラクタが増えていったとするとこのHPも比例して増えていく。初期値を変更したいとなった場合全部書き換える必要が出てくる。そこでコンストラクタ３
  //   this.name = "ダミー";
  // }
  
  public Hero() {
    this("ダミー"); //ここで出てくるthisはこれまで使っていたものではなく同一クラスの別コンストラクタを呼び出すためのもの。
  }
  public void attack() {
    System.out.println(this.name + "は、" + this.sword.name + "を使って攻撃した！");
    System.out.println("相手は" + this.sword.damage + "のダメージを受けた！");
  }
  public void sleep() {
    this.hp = 100;
    System.out.println(this.name + "は、眠って回復した！");
  }
  public void sit(int sec) {
    this.hp += sec;
    System.out.println
      (this.name + "は" + sec + "秒だけ座った！");
      System.out.println("HPが、" + sec + "ポイント回復した！");
  }
  public void slip() {
    this.hp -= 5;
    System.out.println(this.name + "は、転んだ！");
    System.out.println("5のダメージを受けた！");
  }
  public void run() {
    System.out.println(this.name + "は、逃げ出した！");
    System.out.println("GAMEOVER");
    System.out.println("最終HPは" + this.hp + "でした");
  }
}