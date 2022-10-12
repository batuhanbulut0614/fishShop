package fishShop;

public class Aquarium {
	private String fishAquariumName;
	private String aquariumColors;
	private String aquariumSize;
	private int aquariumPrice;
	public Aquarium() {
		super();
	}
	public Aquarium(String fishAquariumName, String aquariumColors, String aquariumSize, int aquariumPrice) {
		super();
		this.fishAquariumName = fishAquariumName;
		this.aquariumColors = aquariumColors;
		this.aquariumSize = aquariumSize;
		this.aquariumPrice = aquariumPrice;
	}
	public String getFishAquariumName() {
		return fishAquariumName;
	}
	public void setFishAquariumName(String fishAquariumName) {
		this.fishAquariumName = fishAquariumName;
	}
	public String getAquariumColors() {
		return aquariumColors;
	}
	public void setAquariumColors(String aquariumColors) {
		this.aquariumColors = aquariumColors;
	}
	public String getAquariumSize() {
		return aquariumSize;
	}
	public void setAquariumSize(String aquariumSize) {
		this.aquariumSize = aquariumSize;
	}
	public int getAquariumPrice() {
		return aquariumPrice;
	}
	public void setAquariumPrice(int aquariumPrice) {
		this.aquariumPrice = aquariumPrice;
	}

}
