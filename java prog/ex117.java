
public class ex117 extends Thread{  
	 public void run(){  
		  if(Thread.currentThread().isDaemon()){//checking for daemon thread  
		   System.out.println("daemon thread work");  
		  }  
		  else{  
		  System.out.println("user thread work");  
		 }  
		 }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex117 t1=new ex117();//creating thread  
		ex117 t2=new ex117();  
		ex117 t3=new ex117();  
		  
		  t1.setDaemon(true);//now t1 is daemon thread  
		    
		  t1.start();//starting threads  
		  t2.start();  
		  t3.start();  

	}

}
