

public class Test{
	public static void main(String[] arg){
		int i = 0;
		for(String s : arg){
			System.out.println("Printing arg " + (++i) + ": " + s);
		}
		System.out.println("Done.");
	}
}
