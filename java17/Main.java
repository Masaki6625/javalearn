import java.io.*;

//例外の対処方法
// public class Main {
//   public static void main(String[] args) {
//     //Java7から導入されたシステム。tryの後に（）で処理を書くことで自動的にfinallyが呼び出される
//     try (FileWriter fw = new FileWriter("data.txt");) {
//       fw.write("hello!");
//     } catch (Exception e) {
//       System.out.println("何かしらの例外が発生しました");
//     }
//   }
// }

//実際に例外を実行する

public class Main {
  public static void main(String[] args) {
    Person p = new Person();
    p.setAge(-128);
  }
}