package Problem5;

public class LavaDino extends Dinosur{

	private boolean canBreatheFire;
	private boolean hasHeatResistance;
	public LavaDino(String species, String consumetype, boolean canBreatheFire, boolean hasHeatResistance) {
		super(species,consumetype);
		this.canBreatheFire=canBreatheFire;
		this.hasHeatResistance=hasHeatResistance;
	}
    void DinoDetails()
    {
    	if(this.canBreatheFire==true)
    	{
    		System.out.println("This dragon breaths fire");
    	}
    	else
    	{
    		System.out.println("This dragon do not breath fire");
    	}
    	if(this.hasHeatResistance==true)
    	{
    		System.out.println("This dragon resistant to heat");
    	}
    	else
    	{
    		System.out.println("This dragon do not resistant to heat");
    	}
    }
}
