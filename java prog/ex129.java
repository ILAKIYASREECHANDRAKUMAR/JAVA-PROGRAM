
public class ex129 extends Thread{  
	  
	public void run(){  
	for(int i=1;i<=2;i++){  
	if(Thread.interrupted()){  
	System.out.println("code for interrupted thread");  
	}  
	else{  
	System.out.println("code for normal thread");  
	}  
	  
	}//end of for loop  
	}  
	  


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex129 t1=new ex129();  
		ex129 t2=new ex129();  
		  
		t1.start();  
		t1.interrupt();  
		  
		t2.start();  

	}

}
