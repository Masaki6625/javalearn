public class SuperHero extends Hero {
  boolean flying;
  
  public SuperHero() {
    System.out.println("SyperHeroのコンストラクタが動作");
  }
  public void attack(Matango m) {
    super.attack(m);
    if (this.flying) {
      super.attack(m);
    }
  }
  
  public void fly() {
    this.flying = true;
    System.out.println("飛び上がった！");
  }
  
  public void lend() {
    this.flying = false;
    System.out.println("着地した！");
  }
  public void run() {
    System.out.println(this.name + "は撤退した"); //継承した子クラスで同じ名前だが別の動きをさせたい場合子クラスに書き込むことで実現できる。
  }
}