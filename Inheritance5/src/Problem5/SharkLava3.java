package Problem5;

public class SharkLava3 extends SharkLava2{
	private String superPowerName,superPowerDescription;
	public SharkLava3(String species, String consumetype, boolean canBreatheFire, boolean hasHeatResistance,
			int numberOfFins, int numberOfGills, boolean canSwim, String abilityName, String abilityDescription,
			String superPowerName, String superPowerDescription) {
		super(species,consumetype,canBreatheFire,hasHeatResistance,numberOfFins,numberOfGills,canSwim,abilityName,abilityDescription);
		this.superPowerName=superPowerName;
		this.superPowerDescription=superPowerDescription;	
	}
	void displayDinoSuperPower()
	{
		System.out.println(""+this.superPowerName);
		System.out.println(""+this.superPowerDescription);
	}

}
