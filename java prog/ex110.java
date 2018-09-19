
public class ex110 extends Thread {

	public void run(){  
		System.out.println("thread is running...");  
		}  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex110 t1=new ex110();  
		t1.start();  

	}

}
