//高度な継承(未来を見据えたクラスを作ること。同じフィールド、メソッドを持っているクラスをその都度開発するのは効率が悪い。
//なので同じフィールド、メソッドを持っているクラスを開発で有効に使ってもらうため元となるクラスを作ること)

public class Character {
  String name;
  int hp;
   public void run() {
     System.out.println(this.name + "は、逃げ出した！");
   }

   public void attack(Matango m) {
     System.out.println(this.name + "の攻撃！");
     m.hp -= ??;
     System.out.println("敵に？？ポイントのダメージを与えた！");
   }
}

// ここでは様々な心配事が残った継承材料になってしまっている。
// １、メソッドを確定することができない。（処理をかけない）
// ２、空白にしてオーバーライドしてもらいたいが忘れてしまうかもしれない。
//     また、誤字脱字により機能せずエラーは出ないが正しく動かないといったトラブルが起こる子も知れない。
// ３、処理を書かずにおいておき使う人に書いてもらおうとするが、使う側は
//     これは何もしないことが前提なのかオーバーライドし使うものなのかわからない。
// ４、これそのものをnewして使われてしまう可能性があること。
//     （継承して肉付けすることが前提のため正しく動作しない。）
// これら全ての問題を解決するために「抽象クラス」、「インターフェース」がある！

//抽象クラス（javaには３の問題を解決する文法が用意されている。）

//abstractメソッドを持つクラスは必ずabstractクラスにしないといけない。
//（コンパイルエラーになる）
//また誤ってこのクラスをnewされる問題（4）も解決できる。
public abstract class Caracter {
  String name;
  int hp;

   public void run() {
     System.out.println(this.name + "は、逃げ出した！");
   }

   public abstract void attack(Matango m);
   //abstractは「抽象的、曖昧な」などの意味を持つ英単語
   //「ここでは内容が現時点でどうなるか確定しないので処理を書きません。」という意味になる。
   //抽象メソッドと呼ばれる。
   }
}

//オーバーライドの強制

public class Dancer extends Caracter {
  
  // これだけではコンパイルエラーになってしまう。
  // なぜなら親としているCharacterは抽象クラスだから抽象メソッド（attack）を
  // 子クラスのDancerも持っているから。
  public void dance() {
    System.out.println(this.name + "は、情熱的に踊った！");
  }
  
  // 抽象メソッドattackを定義してあげることで
  // 抽象メソッドを持ったDancerクラスとなりコンパイルエラーを回避できる！
  public void attack(Matango m) {
    System.out.println(this.name + "の攻撃");
    System.out.println("敵に３ポイントのダメージを与えた！");
    m.hp -= 3;
  }
}

//インターフェース
//継承ツリーを下（実装されたもの）から上（抽象メソッドばかり）に登っていき
//抽象メソッドしかなくフィールドもないクラスをインターフェースと呼ぶことができる

public class interface Character {
  public abstract void run(); //void run();としても動作する。
}

//インターフェース実行の例
 public interface CleaningService {
   Shirt washShirt(Shirt s);
   Towl washTowl(Towl t);
   Coat washCoat(Coat c);
   }
 }
 
 //このインターフェースを継承した京都クリーニングの例
 
 //インターフェースの継承の場合はextends ではなく　implements(実装の意)を使用する
 public class KyotoCleaningShop implements CleaningSrvice {
   String ownerName;
   String address;
   String phone;
   //シャツを洗う
   public Shirt washShirt(Shirt s) {
     return s;
   }
   
   //タオルを洗う
   public Towl washTowl(Towl t) {
     return t;
   }
   
   //コートを洗う
   public Coat washCort(Cort c) {
     return c;
   }
 }
 
 //継承と実装を同時に行う
 
 public class Fool extends Character implements Human {
   //Characterからhpやnameなどのフィールドを継承している
   //Characterから継承した抽象メソッドattack()を実装
   public void attack(Matango m) {
     System.out.println(this.name + "は戦わずに遊んでいる")
   }
   
   //さらにHumanから継承した４つの抽象メソッドを実装
   public void talk() {
   }
   
   public void watch() {
   }
   
   public void hear() {
   }
   
   public void run() {
   }
   
 }