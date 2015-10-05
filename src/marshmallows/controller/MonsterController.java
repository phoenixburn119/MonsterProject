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
		String  name = myDisplay.getAnswer("Lets make you a friend. What is your monsters name?");
		myDisplay.displayResponse("You chose" + name);
		DrJohn.setMonsterName(name);
		
		String eyes = myDisplay.getAnswer("How many Eyes?");
		
		while(!isDouble(eyes));
		{
			eyes = myDisplay.getAnswer("Give it a valid number.");
		}
		
		if(isDouble(eyes))
		{
			age = Double.parseDouble(eyes);
		}
		
		else
		{
			eyes = 2;
		}
		myDisplay.displayResponse("It has " + eyes + " eyes");
		DrJohn.setMonsterEyes(eyes);
		
		
		
		
	}
	
	private boolean isInteger(String input)
	{
		boolean isInt = false;
	}
	
	private boolean isDouble(String input)
	{
		boolean isDouble = false;
		
		try
		{
			double validDouble = Double.parseDouble(input);
			isDouble = true;
		}
		catch(NumberFormatException error)
		{
			myDisplay.displayResponse("You did not type in a valid number.");
		}
		return isDouble;
	}
}
