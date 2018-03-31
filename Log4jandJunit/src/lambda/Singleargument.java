package lambda;
interface myinterface
{
	String getData(String name);
}

public class Singleargument {

	public static void main(String[] args) {
		
		/*myinterface m=(name)->{
			return "Hello "+name;
			
		};*/
		myinterface m=(name)->"Hello "+name;
		
		String s=m.getData("Nikhil");
		System.out.println(s);

	}

}
