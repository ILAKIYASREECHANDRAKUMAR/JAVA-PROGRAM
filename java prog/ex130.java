import java.io.FileOutputStream;  
public class ex130 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try{    
            FileOutputStream fout=new FileOutputStream("J:\\abc.txt");    
            String s="hello";    
            byte b[]=s.getBytes();//converting string into byte array    
            fout.write(b);    
            fout.close();    
            System.out.println("success...");    
           }catch(Exception e){System.out.println(e);}    

	}

}
