package chessgame;

public class Rook extends Piece {

  public Rook(int value, boolean isWhite) {
    super(value, isWhite);
  }

  @Override
  void move() {
    System.out.println("Horizontally or vertically");
  }

  @Override
  public String toString() {
    return "Rook{" +
        "value=" + super.getValue() +
        ", isWhite=" + super.isWhite() +
        '}';
  }
}
