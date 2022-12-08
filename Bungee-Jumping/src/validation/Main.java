package validation;
import java.util.*;
public class Main {
	int age;
	public void eligibility(int age) {
        if (age>18 && age<60) {
			System.out.println("Hey there Adult, please enter your Height(in feet)");
			Scanner sc1 = new Scanner(System.in);
			float Aheight = sc1.nextFloat();
			if (Aheight>=4.8) {
				System.out.println("Please Enter your Weight(in KGs:-");
				Scanner sc2 = new Scanner(System.in);
				float Aweight = sc2.nextFloat();
				if (Aweight>=50.0 && Aweight<=120.0) {
					if (Aweight>80.0)
						System.out.println("Don't forget to add extra ropes!\n and enjoy your Jumping.");
					else
						System.out.println("Welcome! Enjoy your jumping.");
				}
				else if(Aweight<50.0)
				    System.out.println("Sorry! You are underweight");
				else
					System.out.println("Sorry! You are overweight");
			}
			else
				System.out.println("Sorry, but you are to short to jump.");
		}
		else if(age>12 && age<18){
			System.out.println("Hey there child, please enter your height(in feet):- ");
			Scanner sc = new Scanner(System.in);
			float Cheight = sc.nextFloat();
			if (Cheight>=4.2) {
				System.out.println("Please Enter your weight(in KGs):-");
				Scanner sc3 = new Scanner(System.in);
				float Cweight = sc3.nextFloat();
				if (Cweight>=40.0 && Cweight<=60.0)
					System.out.println("Stay Calm, Enjoy your jumping kid");
				else if (Cweight<40.0)
					System.out.println("You are underweight!");
				else
					System.out.println("You are overweight!");
			}
			else
				System.out.println("Please, grow some height!");
		}
		else
			System.out.println("SORRY! You are not eligible for any type of bungee jumping");
	}

	
	public static void main(String[] args) {
		System.out.println("Hello and welcome to B-Tech Bungee jumping.");
		System.out.println("Please enter your age: ");
		Scanner sc4 = new Scanner(System.in);
		int age = sc4.nextInt();
		Main M = new Main();
		M.eligibility(age);

}}