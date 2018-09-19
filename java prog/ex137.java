import java.io.FileWriter;  
public class ex137 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try{    
            FileWriter fw=new FileWriter("J:\\abc.txt");    
            fw.write("this is file writer");    
            fw.close();    
           }catch(Exception e){System.out.println(e);}    
           System.out.println("Success...");    

	}

}
