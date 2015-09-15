package marshmallows.controller;

import marshmallows.model.MarshmallowMonster;
import marshmallows.view.MonsterDisplay;
import java.util.Scanner;

public class MonsterController
{
	private MarshmallowMonster DrJohn;
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
		askQuestion();
		myDisplay.displayInfo("Update monster info " + DrJohn.toString());
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
}
