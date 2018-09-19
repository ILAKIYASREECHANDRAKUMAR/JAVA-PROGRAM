
public class ex124 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime r=Runtime.getRuntime();  
		  System.out.println("Total Memory: "+r.totalMemory());  
		  System.out.println("Free Memory: "+r.freeMemory());  
		    
		  for(int i=0;i<10000;i++){  
		   new ex124();  
		  }  
		  System.out.println("After creating 10000 instance, Free Memory: "+r.freeMemory());  
		  System.gc();  
		  System.out.println("After gc(), Free Memory: "+r.freeMemory());  

	}

}
