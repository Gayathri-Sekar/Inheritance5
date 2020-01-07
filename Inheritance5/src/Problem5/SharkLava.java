package Problem5;

public class SharkLava extends LavaDino {
    private int numberOfFins, numberOfGills;
    private boolean canSwim;
	public SharkLava(String species, String consumetype, boolean canBreatheFire, boolean hasHeatResistance,
			int numberOfFins, int numberOfGills, boolean canSwim) {
		super(species,consumetype,canBreatheFire,hasHeatResistance);
		this.numberOfFins=numberOfFins;
		this.numberOfGills=numberOfGills;
		this.canSwim=canSwim;
		
	}
	void displayDinoDetails ()
	{
		System.out.println("Number of Fins:"+this.numberOfFins);
		System.out.println("Number of Gills:"+this.numberOfGills);
		if(this.canSwim==true)
		{
			System.out.println("Can swim");
		}
		else
		{
			System.out.println("Cannot swim");
		}
	}

}
