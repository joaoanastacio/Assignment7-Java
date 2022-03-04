package chessgame;

public class King extends Piece {

  public King(int value, boolean isWhite) {
    super(value, isWhite);
  }

  @Override
  void move() {
    System.out.println("One square");
  }

  @Override
  public String toString() {
    return "King{" +
        "value=" + super.getValue() +
        ", isWhite=" + super.isWhite() +
        '}';
  }
}
