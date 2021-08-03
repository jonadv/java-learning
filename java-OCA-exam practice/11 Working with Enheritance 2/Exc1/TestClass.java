
/*
The code refers to a class named PdfDocument. Write code for this class such that TestClass will print "pdf" when executed. 
*/

public class TestClass {
  public static void main(String[] args) {
	Document d = new PdfDocument();
	System.out.println(d.getType()); // should print "pdf" 
  }
}
class Document {
	private String type = "dummy";
	private byte[] data; // insert appropriate getters and setters 
	public String getType(){
		return this.type;
	}
	public byte[] getData(){
		return this.data;
	}
	public void setType(String type){
		this.type = type;
	}
	public void setData(){
		this.data = data;
	}
}
class PdfDocument extends Document{
	PdfDocument(){
		setType("pdf");
	}
}