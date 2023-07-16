//お手本みた。答え合わせ

public class Book extends TangibleAsset {
  String name;
  public Book(String name, int price, String color, String isbn) {
    super(name, price, color);
    this.isbn = isbn;
  }
  public String getIsbn() {
    return this.isbn;
  }
}