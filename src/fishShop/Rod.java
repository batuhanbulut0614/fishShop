package fishShop;

public class Rod {
   private String fishingRodName;
   private double FishingRodDragForce;
   private int FishingRodWeight;
   private String NumberOfBalls;
   private int fishingLine;
   private String CoilWindingCapacity;
   private String FishingRodLength;
   private String fishingRod;
public Rod() {
	super();
}
public Rod(String fishingRodName,  double fishingRodDragForce, int fishingRodWeight, String numberOfBalls,
		int fishingLine, String coilWindingCapacity, String fishingRodLength, String fishingRod) {
	super();
	this.fishingRodName = fishingRodName;
	FishingRodDragForce = fishingRodDragForce;
	FishingRodWeight = fishingRodWeight;
	NumberOfBalls = numberOfBalls;
	this.fishingLine = fishingLine;
	CoilWindingCapacity = coilWindingCapacity;
	FishingRodLength = fishingRodLength;
	this.fishingRod = fishingRod;
}
public String getFishingRodName() {
	return fishingRodName;
}
public void setFishingRodName(String fishingRodName) {
	this.fishingRodName = fishingRodName;
}
public double getFishingRodDragForce() {
	return FishingRodDragForce;
}
public void setFishingRodDragForce(double fishingRodDragForce) {
	FishingRodDragForce = fishingRodDragForce;
}
public int getFishingRodWeight() {
	return FishingRodWeight;
}
public void setFishingRodWeight(int fishingRodWeight) {
	FishingRodWeight = fishingRodWeight;
}
public String getNumberOfBalls() {
	return NumberOfBalls;
}
public void setNumberOfBalls(String numberOfBalls) {
	NumberOfBalls = numberOfBalls;
}
public int getFishingLine() {
	return fishingLine;
}
public void setFishingLine(int fishingLine) {
	this.fishingLine = fishingLine;
}
public String getCoilWindingCapacity() {
	return CoilWindingCapacity;
}
public void setCoilWindingCapacity(String coilWindingCapacity) {
	CoilWindingCapacity = coilWindingCapacity;
}
public String getFishingRodLength() {
	return FishingRodLength;
}
public void setFishingRodLength(String fishingRodLength) {
	FishingRodLength = fishingRodLength;
}
public String getfishingRod() {
	return fishingRod;
}
public void setfishingRod(String fishingRod) {
	FishingRodLength = fishingRod;
}
}
