package direction_game;
import java.util.*;
public class Main {
	void game(String direc) {
		Scanner sc = new Scanner(System.in);
		int turn = sc.nextInt();
		switch(turn) {
		case 1:
			switch(direc) {
			case "east":
				game("north");
				break;
			case "north":
				game("west");
				break;
			case "west":
				game("south");
				break;
			case "south":
				game("east");
				break;
			default:
				System.out.println("Direction doesn't exist!");
			}
			break;
		case -1:
			switch(direc) {
			case "east":
				game("south");
				break;
			case "south":
				game("west");
				break;
			case "west":
				game("north");
				break;
			case "north":
				game("east");
				break;
			default:
				System.out.println("Direction doesn't exist!");
			}
			break;
		case 0:
			System.out.println("The current direction is: "+ direc);
			break;
		default:
			System.out.println("Please enter only no. 1(left), -1(right) or 0(to stop");
			game("east");
		}
		sc.close();
	}
	public static void main(String[] args) {
		System.out.println("Enter the directions:- \n(1 for left, -1 for right and 0 to stop\n");
		Main m = new Main();
		m.game("east");
	}
}
