
public class synchronize {
	
		void printTable(int n){//method not synchronized  
			   for(int i=1;i<=5;i++){  
			     System.out.println(n*i);  
			     try{  
			      Thread.sleep(400);  
			     }catch(Exception e){System.out.println(e);}  
			   }  
			  
			 }  
			}  
			  
		class MyThread1 extends Thread{  
			synchronize t;  
			MyThread1(synchronize t){  
			this.t=t;  
			}  
			public void run(){  
			t.printTable(5);  
			}  
			  
			}  
			class MyThread2 extends Thread{  
				synchronize t;  
			MyThread2(synchronize t){  
	     	this.t=t;  
			}  
			public void run(){  
			t.printTable(100);  
			}  
			}  
			  
			class TestSynchronization1{  

	
	public static void main(String[] args) {
			synchronize obj = new synchronize();//only one object  
			MyThread1 t1=new MyThread1(obj);  
			MyThread2 t2=new MyThread2(obj);  
			t1.start();  
			t2.start();  


	}

}
