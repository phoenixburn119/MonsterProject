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
	//Getters
	public String getMonsterName()
	{
		return monsterName;
	}
	
	public int getMonsterEyes()
	{
		return monsterEyes;
	}
	
	public int getMonsterArms()
	{
		return monsterArms;
	}
	
	public double getMonserLegs()
	{
		return monsterLegs;
	}
	
	public double getMonsterHair()
	{
		return monsterHair;
	}
	
	public boolean getMonsterBelly()
	{
		return monsterBelly;
	}
	
	//Setters
	public void setMonsterName(String monsterName)
	{
		this.monsterName = monsterName;
	}
	
	public void setMonsterEyes(int eyes)
	{
		this.monsterEyes = eyes;
	}
	
	public void setMonsterArms(int monsterArms)
	{
		this.monsterArms = monsterArms;
	}
	
	public void setMonsterLegs(double monsterLegs)
	{
		this.monsterLegs = monsterLegs;
	}
	
	public void setMonsterHair(double monsterHair)
	{
		this.monsterHair = monsterHair;
	}
	
	public void setMonsterBelly(boolean monsterBelly)
	{
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
		
		String monsterInfo =  " Name: " + monsterName 
							+ " Eyes: " + monsterEyes 
							+ " Arms: " + monsterArms 
							+ " Legs: " + monsterLegs 
							+ " Hairs: "+ monsterHair 
							+ " Gut: " + Gut;
		
		return monsterInfo;
	}
}
