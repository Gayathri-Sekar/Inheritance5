package Problem5;

public class DragonLava3 extends DragonLava2{
    private String superPowerName,superPowerDescription;
	public DragonLava3(String species, String consumetype, boolean canBreatheFire, boolean hasHeatResistance,
			int numberOfWings, int numberOfScales, boolean canFly, String abilityName, String abilityDescription,
			String superPowerName, String superPowerDescription) {
		
		super(species,consumetype,canBreatheFire,hasHeatResistance,numberOfWings,numberOfScales,canFly,abilityName,abilityDescription);
		this.superPowerName=superPowerName;
		this.superPowerDescription=superPowerDescription;
	}
	
	void displayDinoSuperPower()
	{
		System.out.println(""+this.superPowerName);
		System.out.println(""+this.superPowerDescription);
	}

}
