public class Chachamaru {
  String name = "茶々丸";
  int hp = 100000;
  int know = 0;
  
  void ruby() {
    System.out.println(this.name + "は、Ruby on Railsを習得した！");
    this.know += 10;
    System.out.println(this.name + "は、１０の経験値を獲得した！");
  }
}