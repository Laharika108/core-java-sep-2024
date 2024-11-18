

public class FordFigoTitanium extends FordFigo{
	int noOfAirbags;

	public FordFigoTitanium(String modelName, String color, int noOfAirbags) {
		//super();
		super(modelName, color);
		//this.modelName = modelName;
		//this.color = color;
		this.noOfAirbags = noOfAirbags;
	}
	
	public String ejectAirbags() {
		return Modelname + " has ejected " + noOfAirbags + " airbags!";
	}
	
	@Override
	public String Applybreak() {
		return Modelname + " applied ABS brakes!";
	}

}