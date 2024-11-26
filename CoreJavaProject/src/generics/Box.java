package generics;

public class Box {
	private int length;
	private int breadth;
	private int width;
	public Box(int length, int breadth, int width) {
		super();
		this.length = length;
		this.breadth = breadth;
		this.width = width;
		
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	@Override
	public String toString() {
		return "Box [length=" + length + ", breadth=" + breadth + ", width=" + width + "]";
	}
	
}

