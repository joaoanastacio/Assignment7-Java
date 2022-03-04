package chessgame;

public class Bishop extends Piece {

  public Bishop(int value, boolean isWhite) {
    super(value, isWhite);
  }

  @Override
  void move() {
    System.out.println("Diagonally");
  }

  @Override
  public String toString() {
    return "Bishop{" +
        "value=" + super.getValue() +
        ", isWhite=" + super.isWhite() +
        '}';
  }
}
