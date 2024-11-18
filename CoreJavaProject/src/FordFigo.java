
public class FordFigo {
	String Modelname;
	String Color;
	String NumberPlate;
	


public FordFigo(String modelname, String color) {
	
	this.Modelname = modelname;
	this.Color = color;
}
public String SwitchOn() {
	return Modelname+ "is Switch on!" ;
}
public String Accelerate() {
	return Modelname+ "is Accelrate";
}
public String Applybreak() {
	return Modelname+ "is Applybreak";
	
}

public String Switchoff() {
	return Modelname+ "is Switchoff";
}
}
