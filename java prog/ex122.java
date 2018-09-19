
public class ex122 {

	public void finalize()
	{
		System.out.println("object is garbage collected");
	}  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ex122 s1=new ex122();  
		  ex122 s2=new ex122();  
		  s1=null;  
		  s2=null;  
		  System.gc();  
	}

}
