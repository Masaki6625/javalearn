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
  }
}