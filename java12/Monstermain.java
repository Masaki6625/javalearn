public class Monstermain {
  public static void main(String[] args) {
   Monster[] monsters = new Monster[3];
   monsters[0] = new Slime();
   monsters[1] = new Goblin();
   monsters[2] = new Funybad();
   
   for (Monster m : monsters) {
     m.run();
   }
  }
}

//多能性と配列をうまく組み合わせることで
//「大雑把に見ると全部モンスターだよね。個々に特性が異なるインスタンスを配列に入れてもモンスターであることに変わりないよね。
//でもモンスターを扱うときは、個々に特性は配列に格納されてるから呼び出す時はそれぞれの特性も表現するね！」
//とjavaは判断しモンスタークラスを順番に実行してもそれぞれ個々の属性を使った表現を行なってくれる。