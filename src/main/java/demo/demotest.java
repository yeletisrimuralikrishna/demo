package demo;

public class demotest {
	
		int x=10;
		int y=50;
		
		//System.out.println("Just printing");
		public void add() {
			System.out.println("Adding the values"+x+y);
			//return x+y;
		}
		
		public void mul() {
			System.out.println("Multiplying the values"+x*y);
		}
		public static void main( String[] args )
	    {
	        System.out.println( "Hello World!" );
	        demotest d1=new demotest();
	        d1.add();
	        d1.mul();
	    }
		
}
