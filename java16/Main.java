import java.util.ArrayList;
import java.util.*;
import java.util.HashSet;
import java.util.Set;

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
  }
}