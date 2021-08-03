/*
3. You are expected to reset several electronic devices in future. Refactor the code given above such that TestClass's reset method is able to reset any new device without requiring any change in the method code. 
*/

interface ElectricDevice{
	void reset();
}

class Radio implements ElectricDevice{
	private double frequency = 1.1; // insert appropriate getter and setter 
	public void setFrequency(double f){
		this.frequency = f;
	}
	public double getFrequency(){
		return frequency;
	}
	public void reset(){
		setFrequency(0.0);
	}
}
class TV implements ElectricDevice{
	private int channel = 5; // insert appropriate getter and setter 
	public void setChannel(int c){
		this.channel = c;
	}
	public int getChannel(){
		return channel;
	}
	public void reset(){
		setChannel(0);
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
	public static void reset(ElectricDevice e){
		System.out.println("Resetting device");
		e.reset();
	}
}
	