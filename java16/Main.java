import java.util.ArrayList;
import java.util.*;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> points = new ArrayList<Integer>();
    points.add(10);
    points.add(80);
    points.add(75);
    for (int i : points) {
      System.out.println(i);
    }
    
    ArrayList<String> names = new ArrayList<String>();
    names.add("湊");
    names.add("朝香");
    names.add("菅原");
    
    Iterator<String> it1 = names.iterator();
    while (it1.hasNext()) {
      String e = it1.next();
      System.out.println(e);
    }
    
    Set<String> colors = new HashSet<String>();
    colors.add("赤");
    colors.add("青");
    colors.add("黄");
    colors.add("赤");
    System.out.println("色は" + colors.size() + "種類");
    
    //String型は自動で辞書の並び順に出力される
    Set<String> words = new TreeSet<String>();
    words.add("dog");
    words.add("cat");
    words.add("wolf");
    words.add("panda");
    for (String s : words) {
      System.out.println(s + "->");
    }
    
    //HashMapクラスの利用
    Map<String, Integer> prefs = new HashMap<String, Integer>();
    prefs.put("京都府", 255);
    prefs.put("東京都", 1261);
    prefs.put("熊本県", 181);
    int tokyo = prefs.get("東京都");
    System.out.println("東京の人口は、" + tokyo);
    prefs.remove("京都府");
    prefs.put("熊本県", 182);
    int kumamoto = prefs.get("熊本県");
    System.out.println("熊本県の人口は、" + kumamoto);
    
    //拡張for文を使って要素を順番に取り出す
    for (String key : prefs.keySet()) {
      int value = prefs.get(key);
      System.out.println(key + "の人口は、" + value);
    }
    
    //練習問題（答えを回答後写し）
    Hero h1 = new Hero("斎藤");
    Hero h2 = new Hero("鈴木");
    List<Hero> heroes = new ArrayList<Hero>();
    heroes.add(h1);
    heroes.add(h2);
    for (Hero h : heroes) {
      System.out.println(h.getName());
    }
    
    Hero h1 = new Hero("斎藤");
    Hero h2 = new Hero("鈴木");
    Map<Hero, Integer> heroes = new HashMap<Hero, Integer>();
    heroes.put(h1, 3);
    heroes.put(h2, 7);
    for (Hero key : heroes.keySet()) {
      int value = heroes.get(key);
      System.out.println(key.getName() + "が倒した敵=" + value);
    }
  }
}