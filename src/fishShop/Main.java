package fishShop;

public class Main {

	public static void main(String[] args) {
		Fish fish1=new Fish();
		fish1.setFishName("Hamsi");
		fish1.setFishColor("Mavi-Beyaz");
		fish1.setFishLength(18);
		fish1.setHowManyEggsDoesAFishLay(40000.);
		fish1.setAtWhatDepthsOfWaterCanFishSwim("25-60");
		fish1.setHowManyFish(35);
		System.out.println(fish1.getFishName()+" "+fish1.getFishColor()+" "+fish1.getFishLength()+"cm "+fish1.getHowManyEggsDoesAFishLay()+" "+fish1.getAtWhatDepthsOfWaterCanFishSwim()+" "+fish1.getHowManyFish()+"TL");
        
		Rod rod1=new Rod();
		rod1.setFishingRodName("Shimano Fx 4000 G-power 270 Cm 7-35 gr Spin Olta");
		rod1.setFishingRodDragForce(8.5);
		rod1.setFishingRodWeight(320);
		rod1.setNumberOfBalls("2+1");
		rod1.setFishingLine(82);
		rod1.setCoilWindingCapacity("0.30/180 Mt");
		rod1.setFishingRodLength("270 Cm");
		rod1.setfishingRod("1.150 TL");
		System.out.println(rod1.getFishingRodName()+" "+rod1.getFishingRodDragForce()+" "+rod1.getFishingRodWeight()+" "+rod1.getNumberOfBalls()+" "+rod1.getFishingLine()+" "+rod1.getCoilWindingCapacity()+" "+rod1.getFishingRodLength()+" "+rod1.getfishingRod());
		
		Aquarium aquarium1=new Aquarium();
		aquarium1.setFishAquariumName("ikizlerakvaryum Akvaryum");
		aquarium1.setAquariumColors("Beyaz");
		aquarium1.setAquariumSize("35CM");
		aquarium1.setAquariumPrice(160);
		System.out.println(aquarium1.getFishAquariumName()+" "+aquarium1.getAquariumColors()+" "+aquarium1.getAquariumSize()+" "+aquarium1.getAquariumPrice()+("TL"));
		
		Bait bait1=new Bait();
		bait1.setFishFoodName("Ahm Guppy Granulat Lepistes Balık Yemi 250 Ml");
		bait1.setFishFoodBrand("AHM");
		bait1.setHowMuchİsfishFood(49.90);
		System.out.println(bait1.getFishFoodName()+" "+bait1.getFishFoodBrand()+" "+bait1.getHowMuchİsfishFood()+("TL"));
		
		
	}

}
