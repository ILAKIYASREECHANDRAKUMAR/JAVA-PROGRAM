
public class ex114 extends Thread{  
	  public void run(){  
		   System.out.println("running...");  
		  }  


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ex114 t1=new ex114();  
		  ex114 t2=new ex114();  
		  System.out.println("Name of t1:"+t1.getName());  
		  System.out.println("Name of t2:"+t2.getName());  
		   
		  t1.start();  
		  t2.start();  
		  
		  t1.setName("ILAKIYA");  
		  System.out.println("After changing name of t1:"+t1.getName());  

	}

}
