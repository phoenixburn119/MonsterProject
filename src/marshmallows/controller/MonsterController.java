package marshmallows.controller;

import marshmallows.model.MarshmallowMonster;

public class MonsterController
{
	private MarshmallowMonster DrJohn;
	{
		String name = "";
		int eyes = 3;
		int arms= 2;
		double legs = 2.0;
		double hair = 0.5;
		boolean hasBelly = false;
		
		DrJohn = new MarshmallowMonster(name, eyes, arms, legs, hair, hasBelly);
		
	}

	public void start()
	{
		
	}
}
