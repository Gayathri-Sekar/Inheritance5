package Problem5;

public class SharkLava2 extends SharkLava {

	private String abilityName;
    private String abilityDescription;
	
	public SharkLava2(String species, String consumetype, boolean canBreatheFire, boolean hasHeatResistance,
			int numberOfFins, int numberOfGills, boolean canSwim, String abilityName, String abilityDescription) {
		super(species,consumetype,canBreatheFire,hasHeatResistance,numberOfFins,numberOfGills,canSwim);
		this.abilityName=abilityName;
		this.abilityDescription=abilityDescription;
		
	}
	void  displayDinoAbility()
	{
		System.out.println(""+this.abilityName);
		System.out.println(""+this.abilityDescription);
	}

}
