package chessgame;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {

  private static final int QUEEN_OPTION_VALUE = 1;
  private static final int ROOK_OPTION_VALUE = 2;
  private static final int KNIGHT_OPTION_VALUE = 3;
  private static final int BISHOP_OPTION_VALUE = 4;

  public static void main(String[] args) {

    Scanner userInputReader = new Scanner(System.in);
    ArrayList<Piece> chessPieces = new ArrayList<>();

    King king = new King(1000, true);
    chessPieces.add(king);

    Queen queen = new Queen(9, true);
    chessPieces.add(queen);

    Rook rook = new Rook(5, false);
    chessPieces.add(rook);

    Bishop bishop = new Bishop(3, false);
    chessPieces.add(bishop);

    Knight knight = new Knight(2, false);
    chessPieces.add(knight);

    Pawn pawn = new Pawn(1,true);
    chessPieces.add(pawn);

    System.out.println("=== Printing the moves ===");
    for (Piece piece : chessPieces) {
      piece.move();
    }

    Pawn p1 = new Pawn(1, true, true, new Queen(9,true));
    Pawn p2 = new Pawn(1, true, false, null);
    Pawn p3 = new Pawn(1, false, false, null);
    Pawn p4 = new Pawn(1, false, true, new Queen(9, false));
    Pawn p5 = new Pawn(1, true, true, new Knight(2, true));

    System.out.println("\n=== Validanting equals method ===");
    System.out.println(p1.equals(p2)); // Should return false
    System.out.println(p1.equals(p4)); // Should return false
    System.out.println(p1.equals(p5)); // Should return false
    System.out.println(p2.equals(p3)); // Should return false
    System.out.println(p4.equals(p5)); // Should return false

    System.out.println("\n=== Validanting promote method ===");
    System.out.println("\nCongrats! You can promote your pawn. \nChoose one of the following:");
    System.out.println("+============+");
    System.out.println("| [1] Queen  |");
    System.out.println("| [2] Rook   |");
    System.out.println("| [3] Knight |");
    System.out.println("| [4] Bishop |");
    System.out.println("+============+");

    boolean stillPlaying = true;
    while (stillPlaying) {
      try {
        System.out.print("\nChoose one option from 1 to 4: ");
        int userOption = userInputReader.nextInt();

        switch (userOption) {
          case QUEEN_OPTION_VALUE:
            pawn.promote(new Queen(9, pawn.isWhite()));
            System.out.println(pawn);
            stillPlaying = false;
            break;

          case ROOK_OPTION_VALUE:
            pawn.promote(new Rook(5, pawn.isWhite()));
            System.out.println(pawn);
            stillPlaying = false;
            break;

          case KNIGHT_OPTION_VALUE:
            pawn.promote(new Knight(2, pawn.isWhite()));
            System.out.println(pawn);
            stillPlaying = false;
            break;

          case BISHOP_OPTION_VALUE:
            pawn.promote(new Bishop(3, pawn.isWhite()));
            System.out.println(pawn);
            stillPlaying = false;
            break;

          default:
            System.out.println("Here 1");
            System.out.println("Enter a valid number.");
            break;
        }
      } catch (InputMismatchException exception) {
        throw new InputMismatchException("Enter a valid number.");
      }
    }
  }

}
