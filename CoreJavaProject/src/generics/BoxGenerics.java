package generics;

public class BoxGenerics<P> {
	private P length;
	private P breadth;
	private P widrh;
	public BoxGenerics(P length, P breadth, P widrh) {
		super();
		this.length = length;
		this.breadth = breadth;
		this.widrh = widrh;
	}
	public P getLength() {
		return length;
	}
	public void setLength(P length) {
		this.length = length;
	}
	public P getBreadth() {
		return breadth;
	}
	public void setBreadth(P breadth) {
		this.breadth = breadth;
	}
	public P getWidrh() {
		return widrh;
	}
	public void setWidrh(P widrh) {
		this.widrh = widrh;
	}
	@Override
	public String toString() {
		return "BoxGenerics [length=" + length + ", breadth=" + breadth + ", widrh=" + widrh + "]";
	}
	

}
