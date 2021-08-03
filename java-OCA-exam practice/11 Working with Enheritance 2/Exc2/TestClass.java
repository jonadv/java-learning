/*
2. Write code for the reset method in TestClass such that TestClass will print 0.0 and 0 when executed. 
*/
class Radio {
	private double frequency = 1.1; // insert appropriate getter and setter 
	public void setFrequency(double f){
		this.frequency = f;
	}
	public double getFrequency(){
		return frequency;
	}
}
class TV {
	private int channel = 5; // insert appropriate getter and setter 
	public void setChannel(int c){
		this.channel = c;
	}
	public int getChannel(){
		return channel;
	}
}
public class TestClass {
	public static void main(String[] args) {
		TV t = new TV();
		Radio r = new Radio();
		reset(t);
		reset(r);
		System.out.println(r.getFrequency()); // should print 0.0 
		System.out.println(t.getChannel()); // should print 0 
	}
	public static void reset(Object o){
		if(o instanceof TV){
			System.out.println("Got instance of TV, resetting to 0");
			((TV)o).setChannel(0);
		}else{
			System.out.println("Got instance of Radio, resetting to 0.0");
			((Radio)o).setFrequency(0.0);
		}
	}
}
	