import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
while(true) {
		String[] rps={"r","p","s"};
		String computerMove=rps[new Random().nextInt(rps.length)];
		
		Scanner sc=new Scanner(System.in);
		String playerMove;
		while(true) {
			System.out.println("Please enter your move(r, p or s): ");
			playerMove=sc.nextLine();
			if(playerMove.equals("r") ||playerMove.equals("p") ||playerMove.equals("s") ) {
				break;
		}
			System.out.println(playerMove+" is not a valid move.");
			
		}
		System.out.println("Computer played: "+ computerMove);
		if(computerMove.equals(playerMove)) {
			System.out.println("It's a tie");
		}
		else if(playerMove=="r") {
			if(computerMove=="p") {
				System.out.println("You lose!");
			}
			else if(computerMove=="s") {
				System.out.println("You win!");
			}			
		}
		else if(playerMove=="p") {
			if(computerMove=="r") {
				System.out.println("You win!");
			}
			else if(computerMove=="s") {
				System.out.println("You lose!");
			}

			
		}
		
		else if(playerMove=="s") {
			if(computerMove=="r") {
				System.out.println("You lose!");
			}
			if(computerMove=="p") {
				System.out.println("You win!");
			}
		}
			System.out.println("Play again? (y/n)");
		      String playAgain = sc.nextLine();
		      
		      if (!playAgain.equals("y")) {
		        break;
		       
		   
			
		}
		      
		}
		System.out.println("You quit the game!");
	}

}
