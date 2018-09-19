import java.io.CharArrayWriter;  
import java.io.FileWriter;  

public class ex139 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception{    
        CharArrayWriter out=new CharArrayWriter();    
        out.write("Welcome to javaTpoint");    
        FileWriter f1=new FileWriter("J:\\a.txt");    
        FileWriter f2=new FileWriter("J:\\b.txt");    
        FileWriter f3=new FileWriter("J:\\c.txt");    
        FileWriter f4=new FileWriter("J:\\d.txt");    
        out.writeTo(f1);    
        out.writeTo(f2);    
        out.writeTo(f3);    
        out.writeTo(f4);    
        f1.close();    
        f2.close();    
        f3.close();    
        f4.close();    
        System.out.println("Success...");    
 
		// TODO Auto-generated method stub

	}

}
