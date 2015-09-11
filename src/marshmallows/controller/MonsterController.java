package marshmallows.controller;

import marshmallows.model.MarshmallowMonster;
import marshmallows.view.MonsterDisplay;

public class MonsterController
{
	private MarshmallowMonster DrJohn;
	private MonsterDisplay myDisplay;
	
	public MonsterController()
	{
		String name = "CoolCoolnstein";
		int eyes = 3;
		int arms= 2;
		double legs = 2.0;
		double hair = 0.5;
		boolean hasBelly = true;
		
		myDisplay = new MonsterDisplay();
		DrJohn = new MarshmallowMonster(name, eyes, arms, legs, hair, hasBelly);
	}

	public void start()
	{
		myDisplay.displayInfo(DrJohn.toString());
	}
}
