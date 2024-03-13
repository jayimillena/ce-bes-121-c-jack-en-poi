import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors
{
  public static void main(String[] args) 
  {
    System.out.println("Welcome to Rock Paper Scissors");
    System.out.println("Press [1] for rock");
    System.out.println("Press [2] for paper");
    System.out.println("Press [3] for scissors");

    Scanner input = new Scanner(System.in);
    Random random = new Random();

    System.out.println("Hi what's your name? ");
    String player = input.nextLine();
    System.out.println("Hi "+ player + " let's play rock paper and scissors");
    System.out.print("What's your move: ");
    
    String player_turn = input.nextLine();
    int computer_turn = random.nextInt(2);

    if (player_turn.equals("1") && computer_turn == 0)
    {
      System.out.println("Your have chosen rock, and computer chosen rock");
      System.out.println("It is a draw!");
    }
    else if (player_turn.equals("1") && computer_turn == 1)
    {
      System.out.println("Your have chosen rock, and computer chosen paper");
      System.out.println("Computer win!");
    }
    else if (player_turn.equals("1") && computer_turn == 2)
    {
      System.out.println("Your have chosen rock, and computer chosen scissors");
      System.out.println("You win!");
    }

    input.close();
  }
}