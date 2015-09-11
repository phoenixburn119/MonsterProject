package marshmallows.model;

public class MarshmallowMonster
{
	private String monsterName;
	private int monsterEyes;
	private int monsterArms;
	private double monsterLegs;
	private double monsterHair;
	private boolean monsterBelly;

	private MarshmallowMonster()
	{
		
	}
	
	public MarshmallowMonster(String monsterName, int monsterEyes, int monsterArms, double monsterLegs, double monsterHair, boolean monsterBelly)
	{
		this.monsterName = monsterName;
		this.monsterEyes = monsterEyes;
		this.monsterArms = monsterArms;
		this.monsterLegs = monsterLegs;
		this.monsterHair = monsterHair;
		this.monsterBelly = monsterBelly;
	}
	
	public String toString()
	{
		String Gut;
		if (monsterBelly == true)
		{
			Gut = "yuuuup";
		}
		else
		{
			Gut = "Nawww";
		}
		
		String monsterInfo = "My monster has " + monsterEyes 
							+ " eyes and its' name is " + monsterName 
							+ " It has " + monsterArms + " arms and has " 
							+ monsterLegs + " legs he is a little sparses but has " 
							+ monsterHair + " hairds, does he have a belly? " + Gut;
		
		return monsterInfo;
	}
}
