package collections;

import java.util.Objects;

public class Room {
	private int length;
	private int breadth;
	private int width;
	public Room(int length, int breadth, int width) {
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
	public int hashCode() {
		return Objects.hash(breadth, length, width);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Room other = (Room) obj;
		return breadth == other.breadth && length == other.length && width == other.width;
	}
	@Override
	public String toString() {
		return "Room [length=" + length + ", breadth=" + breadth + ", width=" + width + "]";
	}
	

}
