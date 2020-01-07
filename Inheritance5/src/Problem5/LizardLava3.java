package Problem5;

public class LizardLava3 extends LizardLava2 {
	 private String superPowerName,superPowerDescription;
	public LizardLava3(String species, String consumetype, boolean canBreatheFire, boolean hasHeatResistance,
			int numberOfClaws, int numberOfLegs, boolean canRun, String abilityName, String abilityDescription,
			String superPowerName, String superPowerDescription) {
		super(species,consumetype,canBreatheFire,hasHeatResistance,numberOfClaws,numberOfLegs,canRun,abilityName,abilityDescription);
		this.superPowerName=superPowerName;
		this.superPowerDescription=superPowerDescription;
	}
	
	void displayDinoSuperPower()
	{
		System.out.println(""+this.superPowerName);
		System.out.println(""+this.superPowerDescription);
	}
	

}
