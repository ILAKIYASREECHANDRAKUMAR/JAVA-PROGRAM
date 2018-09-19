	import java.io.*;  
public class ex143 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception{  
			  
			   FileOutputStream fout=new FileOutputStream("mfile.txt");  
			   PrintStream pout=new PrintStream(fout);  
			   pout.println(1900);  
			   pout.println("Hello Java");  
		   pout.println("Welcome to Java");  
			   pout.close();  
			   fout.close();  
			      
 
		// TODO Auto-generated method stub

	}

}
