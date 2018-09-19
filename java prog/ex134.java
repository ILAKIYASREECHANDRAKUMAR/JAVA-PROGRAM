import java.io.*;  
public class ex134 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{    
	     FileOutputStream fout=new FileOutputStream("J:\\abc.txt");    
	     BufferedOutputStream bout=new BufferedOutputStream(fout);    
	     String s="Welcome to javaTpoint.";    
	     byte b[]=s.getBytes();    
	     bout.write(b);    
	     bout.flush();    
	     bout.close();    
	     fout.close();    
	     System.out.println("success");    

		// TODO Auto-generated method stub

	}

}
