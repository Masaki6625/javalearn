//５人1組のチーム全員を宿舎に泊めてhpを５０回復させたい。

public class Arraymain {
  public static void main(String[] args) {
    Character[] c = new Character[5];
    c[0] = new Hero();
    c[1] = new Hero();
    c[2] = new Thief();
    c[3] = new Wizard();
    c[4] = new Wizard();
    
    //宿舎にとめて順番に配列を回し回復させる
    for (Character ch : c) {
      cd.hp += 50;
      System.out.println("メンバーは全員hpが50回復した！");
    }
    System.out.println(c[2].hp);
  }
} 