package practicequestions;

import java.util.StringJoiner;

public class Stringjoiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner SJ1 = new StringJoiner(" ,", " [" , " ]");
	
	SJ1.add("a").add("b").add("c");
	System.out.println(SJ1);
	StringJoiner SJ2 = new StringJoiner(" :", " [" , " ]");
	SJ2.add("p").add("q");
	System.out.println(SJ2);
	SJ1.merge(SJ2);
	System.out.println(SJ1);
}
}