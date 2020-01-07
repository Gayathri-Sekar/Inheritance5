package Problem5;

public class DragonLava extends LavaDino {
    
	private int numberOfWings, numberOfScales;
	private boolean canFly;
	public DragonLava(String species, String consumetype, boolean canBreatheFire, boolean hasHeatResistance,
			int numberOfWings, int numberOfScales, boolean canFly) {
		
		super(species,consumetype,canBreatheFire,hasHeatResistance);
		this.numberOfWings=numberOfWings;
		this.numberOfScales=numberOfScales;
		this.canFly=canFly;
	}
	void displayDinoDetails ()
	{
		System.out.println("Number of Wings:"+this.numberOfWings);
		System.out.println("Number of Scales:"+this.numberOfScales);
		if(this.canFly==true)
		{
			System.out.println("Can fly");
		}
		else
		{
			System.out.println("Cannot fly");
		}
	}
   
}
