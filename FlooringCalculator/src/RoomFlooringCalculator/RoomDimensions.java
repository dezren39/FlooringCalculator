package RoomFlooringCalculator;

public class RoomDimensions {
	private float length = 0;
	private float width = 0;
	
	public RoomDimensions(float lengthIn, float widthIn) {
        this.length = lengthIn;
        this.width = widthIn;
    }
	
	public float area() {
		return length*width;
	}
	
	public void modArea(float lengthIn, float widthIn) {
		length = lengthIn;
		width = widthIn;
	}
}
