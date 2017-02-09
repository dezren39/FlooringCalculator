package RoomFlooringCalculator;

public class RoomFlooring {
	private float costPerFoot = 8;
	private RoomDimensions room;
	
	public RoomFlooring(RoomDimensions roomIn) {
		room = roomIn;
	}

	public float totalCost() {
		return costPerFoot * room.area();
	}

	public float totalCost(float costPerFootIn) {
		return costPerFootIn * room.area();
	}
	
	public float cost() {
		return costPerFoot;
	}
	public void modCost(String costPerFootIn) {
		costPerFoot = Float.valueOf(costPerFootIn);
	}
}
