package Problem5;

public class LizardLava extends LavaDino{
     private int numberOfClaws,numberOfLegs;
     private boolean canRun;
	public LizardLava(String species, String consumetype, boolean canBreatheFire, boolean hasHeatResistance,
			int numberOfClaws, int numberOfLegs, boolean canRun) {
		
		super(species,consumetype,canBreatheFire,hasHeatResistance);
		this.numberOfClaws=numberOfClaws;
		this.numberOfLegs=numberOfLegs;
		this.canRun=canRun;
	}
	void displayDinoDetails ()
	{
		System.out.println("Number of Claws:"+this.numberOfClaws);
		System.out.println("Number of Legs:"+this.numberOfLegs);
		if(this.canRun==true)
		{
			System.out.println("Can run");
		}
		else
		{
			System.out.println("Cannot run");
		}
	}

}
