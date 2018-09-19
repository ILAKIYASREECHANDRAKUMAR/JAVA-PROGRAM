
public class ex113 extends Thread{

	 public void run(){  
		  for(int i=1;i<=5;i++){  
		   try{  
		    Thread.sleep(500);  
		   }catch(Exception e){System.out.println(e);}  
		  System.out.println(i);  
		  }  
		 }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex113 t1=new ex113();  
		 ex113 t2=new ex113();  
		 ex113 t3=new ex113();  
		 t1.start();  
		 try{  
		  t1.join();  
		 }catch(Exception e){System.out.println(e);}  
		  
		 t2.start();  
		 t3.start();  
	}

}
