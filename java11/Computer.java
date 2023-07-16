//お手本みた。答え合わせ

public class Computer extends TangibleAsset {
  String makerName;
  public Computer(String naem, int price, String color, String makerName) {
    super (name, price, color);
    this.makerName = makerName;
  }
  public String getMakerName() {
    return this.makerName;
  }
}