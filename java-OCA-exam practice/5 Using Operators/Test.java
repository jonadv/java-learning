class Test{
	public static void main(String[] arg){
		byte b = 1;
//		b = b << 1; 			//wont compile cause result is an int
		b = (byte) (b << 1); 	//compiles, b = 2 
		System.out.println("b = "+b);
		
		int c = b << 1; 		//compiles, c = 4
		System.out.println("c = "+c);
		
//		byte d+=b; 				//does not compile, cannot be used in declaration
		byte e=0; 
		e += b; 				//compiles, e = 2
		System.out.println("e = "+e);
		
		String s = "a"; 
		String[] sa = 	{ "a", s, s.substring( 0, 1), new String("a"), "" +'a' }; 
		for( int i = 0; i < sa.length; i++){ 
			System.out.println( i); 
			System.out.println( s == sa[i]); 
			System.out.println( s.equals(sa[i])); 
		}
	}
}