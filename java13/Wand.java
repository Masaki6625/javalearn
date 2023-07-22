//解答を見て修正した
public class Wand {
  private String name;
  private double power;
  public String getName() {return this.name}
    if (name == null || name.length() < 3) {
      throw new IllegalArgumentException
        ("杖に設定しようとしている名前が異常です")
    }
  public void setName(String name) {this.name = name;}
  public double getPower() {return this.power}
    if (power < 0.5 || power < 100.0) {
  public void setPower(double power) {this.power = power;}
  }
  this.power = power;
}
