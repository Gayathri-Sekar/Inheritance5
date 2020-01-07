package Problem5;

public class DragonLava2 extends DragonLava{
    private String abilityName;
    private String abilityDescription;
	
	public DragonLava2(String species, String consumetype, boolean canBreatheFire, boolean hasHeatResistance,
			int numberOfWings, int numberOfScales, boolean canFly,String abilityName, String abilityDescription) {
		super(species,consumetype,canBreatheFire,hasHeatResistance,numberOfWings,numberOfScales,canFly);
		this.abilityName=abilityName;
		this.abilityDescription=abilityDescription;
		
	}
	void  displayDinoAbility()
	{
		System.out.println(""+this.abilityName);
		System.out.println(""+this.abilityDescription);
	}

}
