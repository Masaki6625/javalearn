public class Main {
  public static void main(String[] args) {
    Yotuba y1 = new Yotuba();
    y1.attack(150);
    y1.run();
    
    Tubaki t1 = new Tubaki();
    t1.attack(3);
    
    Tukino tu1 = new Tukino();
    tu1.magic();
    
    Chachamaru cha = new Chachamaru();
    cha.ruby();
    System.out.println(cha.know);
    
    
    //課題勉強
    //偶数を大きい順から順番に縦に並べる問題
    for (int i = 10; i >= 2; i -= 2) {
      System.out.println(i);
    }
    
    //偶数の数とそれらの合計を出す問題
    int counts = 0;
    int sum = 0;
    
    for (int i = 1; i <= 10; i++ ) {
      if (i % 2 == 0) {
        counts++;
        sum += i;
      }
    }
    System.out.println("1から10までの偶数の数は" + counts);
    System.out.println("1から10までの偶数の合計は" + sum);
    
    //1 ~ 10を横並びにカンマに区切って表示する問題（10はカンマをつけない）
    
    for (int i = 1; i <= 10; i++) {
      if (i <= 9) {
        System.out.print(i + ",");
      } else {
        System.out.print(i);
      }
    }
    
    System.out.println();
    
    int[] array = new int[20];
    
    for (int i = 0; i < array.length; i++ ) {
      array[i] = i * 5;
    }
    
    for (int i = 0; i <= 10; i++) {
      if (array[i] % 2 != 0) {
        System.out.print(array[i]);
        if (i < 9) {
          System.out.print(",");
        }
      }
    }
        
    for (int i = 11; i < array.length; i++) {
      if (array[i] % 2 == 0) {
        System.out.print(array[i]);
        if (i < 18) {
          System.out.print(",");
        }
      }
    }
    
    System.out.println();
  }
}