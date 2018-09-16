
public class ex64 {

		 int data=50;  
		  
		 void change(int data){  
		 data=data+100;//changes will be in the local variable only  
		 }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex64 op=new ex64();  
			  
			   System.out.println("before change "+op.data);  
	      	   op.change(500);  
			   System.out.println("after change "+op.data);  
		  

	}

}
