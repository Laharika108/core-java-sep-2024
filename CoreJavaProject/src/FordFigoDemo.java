
public class FordFigoDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FordFigo fore = new FordFigo("FIGO", "silver");
		System.out.println(fore.SwitchOn());
		System.out.println(fore.Accelerate());
		System.out.println(fore.Applybreak());
		System.out.println(fore.Switchoff());
		System.out.println("------------------");
		FordFigoTitanium forefigtit =new  FordFigoTitanium("TITANIUM", "silver", 8);
		System.out.println(forefigtit.SwitchOn());
		System.out.println(forefigtit.Accelerate());
		System.out.println(forefigtit.Applybreak());
		System.out.println(forefigtit.ejectAirbags());
		System.out.println(forefigtit.Switchoff());
	}

}
