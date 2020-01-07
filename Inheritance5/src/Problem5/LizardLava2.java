package Problem5;

public class LizardLava2 extends LizardLava{

	private String abilityName;
    private String abilityDescription;
	public LizardLava2(String species, String consumetype, boolean canBreatheFire, boolean hasHeatResistance,
			int numberOfClaws, int numberOfLegs, boolean canRun, String abilityName, String abilityDescription) {
		super(species,consumetype,canBreatheFire,hasHeatResistance,numberOfClaws,numberOfLegs,canRun);
		this.abilityName=abilityName;
		this.abilityDescription=abilityDescription;
		
	}
	void  displayDinoAbility()
	{
		System.out.println(""+this.abilityName);
		System.out.println(""+this.abilityDescription);
	}
}
 