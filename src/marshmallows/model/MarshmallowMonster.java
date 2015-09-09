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
}
