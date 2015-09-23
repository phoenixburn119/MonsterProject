package marshmallows.controller;

import marshmallows.model.MarshmallowMonster;
import marshmallows.view.MonsterDisplay;
import java.util.Scanner;

public class MonsterController
{
	private MarshmallowMonster DrJohn; //Declares a Monster called DrJohn.
	private MarshmallowMonster userMonster;
	private MonsterDisplay myDisplay;
	private Scanner monsterScanner;
	
	public MonsterController()
	{
		String name = "CoolCoolnstein";
		int eyes = 3;
		int arms= 2;
		double legs = 2.0;
		double hair = 0.5;
		boolean hasBelly = true;
		
		monsterScanner = new Scanner(System.in);
		myDisplay = new MonsterDisplay();
		DrJohn = new MarshmallowMonster(name, eyes, arms, legs, hair, hasBelly);
	}

	public void start()
	{
		myDisplay.displayInfo(DrJohn.toString());
		this.createUserMonster();
		myDisplay.displayInfo("Update monster info " + userMonster.toString());
	}
	
	private void askQuestion()
	{
		System.out.println("I want a new name for a monster, type one please!");
		String newMonsterName = monsterScanner.next();
		DrJohn.setMonsterName(newMonsterName);
		
		System.out.println("Give me a new number of eyes!");
		int updatedEyes = monsterScanner.nextInt();
		DrJohn.setMonsterEyes(updatedEyes);
		
		System.out.println("Give me a new number of arms!");
		int updatedArms = monsterScanner.nextInt();
		DrJohn.setMonsterArms(updatedArms);
		
		System.out.println("Give me a new number of legs!");
		double updatedLegs = monsterScanner.nextDouble();
		DrJohn.setMonsterLegs(updatedLegs);
		
		System.out.println("Give me more hair please!");
		double updatedHair = monsterScanner.nextDouble();
		DrJohn.setMonsterHair(updatedHair);
		
		System.out.println("Do I have a belly?!");
		boolean updatedBelly = monsterScanner.nextBoolean();
		DrJohn.setMonsterBelly(updatedBelly);
	}
	
	/**
	 * Creates a MarshamllowMonster instance from user input.
	 */
	private void createUserMonster()
	{
		//Step one: Gather user information.
		System.out.println("Lets make you a friend. What is your monsters name?");
		String userName;
		userName = monsterScanner.nextLine();
		
		System.out.println("Number of eyes on the monster?");
		int userEyes = monsterScanner.nextInt();
		
		System.out.println("How many arms?");
		int userArms = monsterScanner.nextInt();
		
		System.out.println("How many legs will it have? decimal please.");
		double userLegs = monsterScanner.nextDouble();
		
		System.out.println("How much hair will it have? A decimal please.");
		double userHair;
		userHair = monsterScanner.nextDouble();
		
		System.out.print("Does it have a belly? - true or false");
		boolean userBelly = monsterScanner.nextBoolean();
		
		//Step two: Build the monster using the constructor.
		userMonster = new MarshmallowMonster(userName, userEyes, userArms, userLegs, userHair, userBelly);
		
	}
}
