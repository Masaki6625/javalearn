public class FizzBuzz {
  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      if ( i % 3 == 0 && i % 5 == 0) {
        System.out.println("FizzBuzz");
      } else if ( i % 3 == 0) {
        System.out.println("Fizz");
      } else if ( i % 5 == 0) {
        System.out.println("Buzz");
      } else {
        System.out.println(i);
      }
    }
    
    for (int i = 10; i >= 2; i -= 2) {
      System.out.println(i);
    }
    
    int counts = 0;
    int sum = 0;
    
    for (int i = 0; i <= 10; i++ ) {
       if (i % 2 == 0) {
        counts++;
        sum = sum + i;
       }
    }
    
    
    System.out.println("偶数の数は" + counts);
    System.out.println("偶数の数の合計は" + sum);
  }
}