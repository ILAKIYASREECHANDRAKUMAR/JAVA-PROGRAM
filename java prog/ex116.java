
public class ex116 extends Thread{  
	 public void run(){  
		   System.out.println("running thread name is:"+Thread.currentThread().getName());  
		   System.out.println("running thread priority is:"+Thread.currentThread().getPriority());
		 
		 }  


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ex116 m1=new ex116();  
		  ex116 m2=new ex116();  
		  m1.setPriority(Thread.MIN_PRIORITY);  
		  m2.setPriority(Thread.MAX_PRIORITY);  
		  m1.start();  
		  m2.start();  

	}

}
