
public class ex120 extends Thread{  
	 public void run(){  
		   System.out.println("task one");  
		 }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex120 t1=new ex120();  
		  ex120 t2=new ex120();  
		  ex120 t3=new ex120();  
		  
		  t1.start();  
		  t2.start();  
		  t3.start();  

	}

}
