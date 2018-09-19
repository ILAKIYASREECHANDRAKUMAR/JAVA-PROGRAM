
public class ex115 extends Thread{  
	 public void run(){  
		  System.out.println(Thread.currentThread().getName());  
		 }  
 

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex115 t1=new ex115();  
		  ex115 t2=new ex115();  
		  
		  t1.start();  
		  t2.start();  
 

	}

}
