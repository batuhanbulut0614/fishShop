package fishShop;

public class Fish { 
	private String fishName;
	private String fishColor;
	private int fishLength;
	private double howManyEggsDoesAFishLay;
	private String AtWhatDepthsOfWaterCanFishSwim;
	private int HowManyFish;
	public Fish() {
		super();
	}
	public Fish(String fishName, String fishColor, int fishLength, double howManyEggsDoesAFishLay,
			String atWhatDepthsOfWaterCanFishSwim, int howManyFish, double fishingRod) {
		super();
		this.fishName = fishName;
		this.fishColor = fishColor;
		this.fishLength = fishLength;
		this.howManyEggsDoesAFishLay = howManyEggsDoesAFishLay;
		AtWhatDepthsOfWaterCanFishSwim = atWhatDepthsOfWaterCanFishSwim;
		HowManyFish = howManyFish;
	}
	public String getFishName() {
		return fishName;
	}
	public void setFishName(String fishName) {
		this.fishName = fishName;
	}
	public String getFishColor() {
		return fishColor;
	}
	public void setFishColor(String fishColor) {
		this.fishColor = fishColor;
	}
	public int getFishLength() {
		return fishLength;
	}
	public void setFishLength(int fishLength) {
		this.fishLength = fishLength;
	}
	public double getHowManyEggsDoesAFishLay() {
		return howManyEggsDoesAFishLay;
	}
	public void setHowManyEggsDoesAFishLay(double howManyEggsDoesAFishLay) {
		this.howManyEggsDoesAFishLay = howManyEggsDoesAFishLay;
	}
	public String getAtWhatDepthsOfWaterCanFishSwim() {
		return AtWhatDepthsOfWaterCanFishSwim;
	}
	public void setAtWhatDepthsOfWaterCanFishSwim(String atWhatDepthsOfWaterCanFishSwim) {
		AtWhatDepthsOfWaterCanFishSwim = atWhatDepthsOfWaterCanFishSwim;
	}
	public int getHowManyFish() {
		return HowManyFish;
	}
	public void setHowManyFish(int howManyFish) {
		HowManyFish = howManyFish;
	}
	

}
