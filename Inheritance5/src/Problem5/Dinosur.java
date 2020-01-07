package Problem5;

public class Dinosur {
    private String species;
    private String consumetype;
	public Dinosur(String species, String consumetype) {
		this.species=species;
		this.consumetype=consumetype;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public String getConsumetype() {
		return consumetype;
	}
	public void setConsumetype(String consumetype) {
		this.consumetype = consumetype;
	}
	void display()
	{
		System.out.println("Species:"+this.species);
		System.out.println("Consumption Type:"+this.consumetype);
	}

}
