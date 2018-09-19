
public class ex106 {

	 private int data=30;  
	 class Inner{  
	  void msg(){System.out.println("data is "+data);}  
	 }  
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ex106 obj=new ex106();  
		  ex106.Inner in=obj.new Inner();  
		  in.msg();  
	}

}
