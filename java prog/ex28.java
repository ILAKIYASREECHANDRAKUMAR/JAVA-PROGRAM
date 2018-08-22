
public class ex28 {
		void msg(){System.out.println("Hello");}  
		}  
		class B{  
		void msg(){System.out.println("Welcome");}  
		}  
		class C extends ex28,B{ 
		
	public static void main(String args[]) 
	{
			   C obj=new C();  
			   obj.msg();//Now which msg() method would be invoked?  


	}

}
