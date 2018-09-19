
public class ex112 extends Thread{

	 public void run(){  
		  for(int i=1;i<5;i++){  
		    try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
		    System.out.println(i); 
		  }
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ex112 t1=new ex112();
		  ex112 t2=new ex112();
		   
		  t1.start();  
		  t2.start();  

	}

}
