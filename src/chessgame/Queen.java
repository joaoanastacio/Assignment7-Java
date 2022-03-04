package chessgame;

public class Queen extends Piece {

  public Queen(int value, boolean isWhite) {
    super(value, isWhite);
  }

  @Override
  void move() {
    System.out.println("Like bishop and rook");
  }

  @Override
  public String toString() {
    return "Queen{" +
        "value=" + super.getValue() +
        ", isWhite=" + super.isWhite() +
        '}';
  }
}

