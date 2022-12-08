package p1;
import java.util.*;
public class Main {
	void college() {
		System.out.println("Select your College: \n1 PIT\n2 PIET\n3 Exit");
		Scanner sc = new Scanner (System.in);
		int college = sc.nextInt();
		switch (college) {
		case 1:
			department();
			break;
		case 2:
			System.out.println("We don't have details of PIET.");
			break;
		case 3:
			System.out.println("Thanks!");
			break;
		default:
			System.out.println("Select the correct option!");
		}
		sc.close();
	}
	void department() {
		System.out.println("Select your department: \n1 CSE\n2 ECE\n3 EEE\n4 MECH\n5 CIVIL\n6 Go back to college selection");
		Scanner sc1 = new Scanner(System.in);
		int dp = sc1.nextInt();
		switch (dp) {
		case 1:
			sub_department();
			break;
		case 2:
			System.out.println("We don't have any information.");
			break;
		case 3:
			System.out.println("We don't have any information.");
			break;
		case 4:
			System.out.println("We don't have any information.");
			break;
		case 5:
			System.out.println("We don't have any information.");
			break;
		case 6:
			college();
			break;
		default:
			System.out.println("Select the correct option.");
		}
		sc1.close();
	}
	void sub_department() {
		System.out.println("Select your sub-department: \n1 CC\n2 AI\n3 IOT\n4 BDA\n5 Core \n6 Go back to department section");
		Scanner sc2 = new Scanner(System.in);
		int sub_dp = sc2.nextInt();
		switch(sub_dp) {
		case 1:
			event_selection();
			break;
		case 2:
			System.out.println("We don't have any information.");
			break;
		case 3:
			System.out.println("We don't have any information.");
			break;
		case 4:
			System.out.println("We don't have any information.");
			break;
		case 5:
			System.out.println("We don't have any information.");
			break;
		case 6:
			department();
			break;
		default:
			System.out.println("Select the correct option.");
		}
		sc2.close();
	}
	void event_selection() {
		System.out.println("Welcome to Cloud Computing.");
		System.out.println("Select the Events: \n1 RDBMS\n2 SDLC\n3 Go Back to Sub-Department");
		Scanner sc3 = new Scanner(System.in);
		int event = sc3.nextInt();
		switch (event) {
		case 1:
			System.out.println("We don't have any information.");
			break;
		case 2:
			venue_detail();
			break;
		case 3:
			sub_department();
			break;
		default:
			System.out.println("Select the correct option.");
		}
		sc3.close();
	}
	void venue_detail() {
		System.out.println("SDLC:- \n Software development life cycle.\n bla bla bla bla\n bla bla bla bla");
		System.out.println("Venue details:- \n College: PIT\n Block: A\n Room No: 371\n");
		event_selection();
	}
	public static void main(String[] args) {
		Main m = new Main();
		m.college();
	}

}
