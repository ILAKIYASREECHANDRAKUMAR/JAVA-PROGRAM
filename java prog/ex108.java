
public class ex108 {

	 private int data=30;//instance variable  
	 void display(){  
	  class Local{  
	   void msg(){System.out.println(data);}  
	  }  
	  Local l=new Local();  
	  l.msg();  
	 }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ex108 obj=new ex108();  
		  obj.display();  

	}

}
