import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
  public static void main(String[] args) {
    //文字の長さや等しいかを検索するメソッド等
    String s1 = "すっきりJava";
    String s2 = "Java";
    String s3 = "java";
    if (s2.equals(s3)) {
      System.out.println("s2とs3は等しい");
    }
    if (s2.equalsIgnoreCase(s3)) {
      System.out.println("s2とs3はケースを区別しなければ等しい");
    }
    System.out.println("s1の長さは" + s1.length() + "です。");
    if (s1.isEmpty()) {
      System.out.println("s1はから文字です");
    }
    
    //文字列に指定したものが含まれているか調べるメソッド等
    String s4 = "Java and JavaScript";
    if (s4.contains("Java")) {
      System.out.println("文字列s4は、Javaを含んでいます");
    }
    if (s4.endsWith("Java")) {
      System.out.println("文字列s4は、Javaが末尾にあります。");
    }
    System.out.println("文字列s4で最初にJavaが登場する位置は" + s4.indexOf("Java"));
    System.out.println("文字列s4で最後にJavaが登場する位置は" + s4.lastIndexOf("Java"));
    
    //文字列を切り出すメソッド等
    String s5 = "Java programing";
    System.out.println("文字列s1の４文字目以降は" + s5.substring(3));
    System.out.println("文字列s5の4~8文字目は" + s5.substring(3,8));
    
    //文字列を変換するメソッド等
    System.out.println("参考書のp５６０を参照してください");
    
    //StringBuilderの使い方
    StringBuilder sb =  new StringBuilder();
    for (int i = 0; i < 10000; i++) {
      sb.append("Java");
    }
    String s = sb.toString();
    
    //文字数の制限を行いたい場合
    // public boolean isValidPlayerName(String name) {
    //   return name.matches("[A-Z] [A-Z0-9]{7}");
    // }
    
    //splitメソッドを使った文字列の分割
    String s6 = "abc,def:ghi";
    String[] words = s6.split("[,:]");
    for (String w : words) {
      System.out.println(w + "->");
    }
    
    //replaceAllメソッドを使った文字列の置換
    // String s7 = "abc,def:ghi";
    // String w = s7.replaceAll("[beh]","X");
    // System.out.println(w);
    
    // final String FORMAT = "%-9s %-13s 所持金%,6d";
    // String s8 = String.format
    //   (FORMAT, hero.getName(), hero.getJob(), hero.getGold());
    // System.out.println(s8);
    
    //処理にかかった時間を取得するメソッド
    long start = System.currentTimeMillis();
    long end = System.currentTimeMillis();
    System.out.println("処理にかかった時間は、" + (end - start) + "ミリ秒でした");
    
    //日付を取得するメソッド
    Date now = new Date();
    System.out.println(now);
    System.out.println(now.getTime());
    Date past = new Date(1600705425827L);
    System.out.println(past);
    
    //カレンダー機能
    Calendar c = Calendar.getInstance();
    c.set(2019,8,23,1,23,45);
    c.set(Calendar.MONTH, 9);
    Date d = c.getTime();
    System.out.println(d);
    Date now1 = new Date();
    c.setTime(now1);
    int y = c.get(Calendar.YEAR);
    System.out.println("今年は" + y + "年です");
    
    //String型とDate型の相互変換
    
    SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    
    Date d1 = f.parse("2020/09/22 01:23:45");
    System.out.println(d1);
    Date now2 = new Date();
    String s15 = f.format(now2);
    System.out.println("現在は" + s15 + "です");
  }
}

//