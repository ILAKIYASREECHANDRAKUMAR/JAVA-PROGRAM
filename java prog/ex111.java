
public class ex111 implements Runnable {

	public void run(){  
		System.out.println("thread is running...");  
		}  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex111 m1=new ex111();  
		Thread t1 =new Thread(m1);  
		t1.start();  

	}

}
