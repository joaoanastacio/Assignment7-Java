package chessgame;

public class Knight extends Piece {

  public Knight(int value, boolean isWhite) {
    super(value, isWhite);
  }

  @Override
  void move() {
    System.out.println("Like an L");
  }

  @Override
  public String toString() {
    return "Knight{" +
        "value=" + super.getValue() +
        ", isWhite=" + super.isWhite() +
        '}';
  }
}

